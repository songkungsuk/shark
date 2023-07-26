package com.shark.contorller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.shark.common.CommonView;
import com.shark.service.SharkInfoService;
import com.shark.service.Impl.SharkInfoServiceImpl;

@WebServlet("/shark-info/*")
public class SharkInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	SharkInfoService sharkInfo = new SharkInfoServiceImpl();

	public SharkInfoServlet() {
		System.out.println("아기상어 아빠상어 엄마상어");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String cmd = CommonView.getcmd(request);
		System.out.println(cmd);
		String uri = CommonView.sliceURI(request);
		System.out.println(uri);

		if (uri.equals("list")) {
			request.setAttribute("sharkList", sharkInfo.selectSharkList());
		} else if (uri.equals("view")) {
			String sharkNum = request.getParameter("SHARK_NUM");
			request.setAttribute("shark", sharkInfo.selectShark(sharkNum));
		} else if (uri.equals("update")) {
			String sharkNum = request.getParameter("sharkNum");
			request.setAttribute("shark", sharkInfo.selectShark(sharkNum));
		}

		CommonView.foward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uri = CommonView.sliceURI(request);

		Map<String, String> shark = new HashMap<String, String>();
		if(request.getParameter("SHARK_NUM") != null) {
			shark.put("SHARK_NUM", request.getParameter("SHARK_NUM"));	
		}
		shark.put("SHARK_NAME", request.getParameter("SHARK_NAME"));
		shark.put("SHARK_AGE", request.getParameter("SHARK_AGE"));
		shark.put("SHARK_BIRTH", request.getParameter("SHARK_BIRTH"));
		shark.put("SHARK_LENGTH", request.getParameter("SHARK_LENGTH"));

		request.setAttribute("msg", "상어를 놓쳐버렷어요");
		request.setAttribute("url", "/shark-info/list");

		if (uri.equals("insert")) {
			int result = sharkInfo.insertshark(shark);

			if (result != 0) {
				request.setAttribute("msg", "상어를 수조에 넣엇어요! ");

			}
		} else if (uri.equals("update")) {
			int result = sharkInfo.updateshark(shark);

			if (result != 0) {
				request.setAttribute("msg", "상어를 수조에서 바꾸엇어요! ");

			}
		} else if (uri.equals("delete")) {
			String sharkNum = request.getParameter("SHARK_NUM");
			int result = sharkInfo.deleteshark(sharkNum);

			if (result != 0) {
				request.setAttribute("msg", "상어를 잡아먹었어요! ");

			}
		}else if (uri.equals("login")) {
			request.setAttribute("msg", "상어의 정보를 확인해주세요");
			request.setAttribute("url", "/shark-info/login");
			HttpSession session = request.getSession();
			boolean login = sharkInfo.login(shark, session);
			if(login) {
				request.setAttribute("msg", "물속으로 들어갔습니다.");
				request.setAttribute("url","/shark-info/list");
			}
			
		}

		CommonView.fowardMessagePage(request, response);
	}

}

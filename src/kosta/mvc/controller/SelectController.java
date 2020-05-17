package kosta.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SelectController implements Controller {

	@Override
	public ModelAndView handeleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("SelectController ��û�Ǿ����ϴ�.");
		
		request.setAttribute("message", "Select�� ����Դϴ�.");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("selectResult.jsp");
		
		return mv;
	}

}

package kosta.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertController implements Controller {

	@Override
	public ModelAndView handeleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("InsertController ��û�Ǿ����ϴ�.");
		
		request.setAttribute("message", "Insert�� ����Դϴ�.");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("insertResult.jsp");
		
		return mv;
	}

}

package kosta.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteController implements Controller {

	@Override
	public ModelAndView handeleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("DeleteController ��û�Ǿ����ϴ�.");
		
		request.setAttribute("message", "Delete�� ����Դϴ�.");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("deleteResult.jsp");
		
		return mv;
	}

}

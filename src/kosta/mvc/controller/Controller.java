package kosta.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {
	ModelAndView handeleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	// 리턴 값을 만들어야된다. ModelAndView로
}

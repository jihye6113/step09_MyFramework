package kosta.mvc.controller;

public class ModelAndView {

	private String viewName;
	private boolean isRedirect; // true�̸� redirect���, false�̸� forward���
	
	public String getViewName() {
		return viewName;
	}
	public void setViewName(String viewName) {
		this.viewName = viewName;
	}
	public boolean isRedirect() {
		return isRedirect;
	}
	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}
	
}

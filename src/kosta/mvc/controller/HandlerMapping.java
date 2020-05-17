package kosta.mvc.controller;

/**
 * ��û�� ������ � Controller�� �����ؾ� �ϴ��� ã�Ƽ� �����Ѵ�.
 * */
public class HandlerMapping {
	
	private static HandlerMapping factory = new HandlerMapping();
	
	private HandlerMapping() {}
	
	public static HandlerMapping getFactory() {
		return factory;
	}

	public Controller createController(String key) {
		Controller controller = null;
		if(key.equals("insert")) {
			controller = new InsertController();
		} else if(key.equals("select")) {
			controller = new SelectController();
		} else if(key.equals("delete")) {
			controller = new DeleteController();
		}
		
		return controller;
	}
}

package com.ssnc;

import org.apache.wicket.protocol.http.WebSession;
import org.apache.wicket.request.Request;

public class CheeserSession extends WebSession {
	
	private static final long serialVersionUID = -8613261030803291367L;
	private Cart cart = new Cart();
	
	protected CheeserSession(Request request) {
		super(request);
	}
	
	public Cart getCart() {
		return cart;
	}
}

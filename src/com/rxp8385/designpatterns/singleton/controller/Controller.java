package com.rxp8385.designpatterns.singleton.controller;

import com.rxp8385.designpatterns.singleton.model.Model;
import com.rxp8385.designpatterns.singleton.view.LoginFormEvent;
import com.rxp8385.designpatterns.singleton.view.LoginListener;
import com.rxp8385.designpatterns.singleton.view.View;

public class Controller implements LoginListener {
	private View view;
	private Model model;
	
	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
	}

	@Override
	public void loginPerformed(LoginFormEvent event) {
		System.out.println("Login event received. " + event.getName() + "; " + event.getPassword());
		
	}

}
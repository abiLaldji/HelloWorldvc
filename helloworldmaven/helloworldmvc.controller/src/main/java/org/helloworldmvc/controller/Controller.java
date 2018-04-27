package org.helloworldmvc.controller;

import java.io.IOException;

import org.helloworldmvc.contract.IModel;
import org.helloworldmvc.contract.IView;


public class Controller {
	private IView view;
	private IModel model;
	
	public Controller(IView view, IModel model) {
		this.view = view;
		this.model = model;
		
	}
	
	public void run() {
			
		
				try {
					System.out.println(this.view.displayMessage(model.getHelloWorld()));
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			
		
		
	}

}

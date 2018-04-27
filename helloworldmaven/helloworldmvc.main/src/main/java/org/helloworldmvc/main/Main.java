package org.helloworldmvc.main;

import org.helloworldmvc.controller.Controller;
import org.helloworldmvc.model.Model;
import org.helloworldmvc.view.View;

public class Main {


	public static void main(String[] args) {
		View view = new View();
		Model model = new Model();

		Controller controller = new Controller(view, model);
		
		controller.run();
	}

}

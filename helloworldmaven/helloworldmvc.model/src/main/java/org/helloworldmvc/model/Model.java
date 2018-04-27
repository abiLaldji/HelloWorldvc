package org.helloworldmvc.model;

import org.helloworldmvc.contract.IModel;

public class Model implements IModel{
	
	final String fileName = "Hello.txt";


	public String getHelloWorld() {
		return DAOHelloWorld.readFile(fileName);
	}



}


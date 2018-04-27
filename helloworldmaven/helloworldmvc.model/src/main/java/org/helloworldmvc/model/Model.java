package org.helloworldmvc.model;

import org.helloworldmvc.contract.IModel;

public class Model implements IModel{
	
	final String fileName = "/home/abi/Hello.txt";


	public String getHelloWorld() {
		return DAOHelloWorld.readFile(fileName);
	}



}


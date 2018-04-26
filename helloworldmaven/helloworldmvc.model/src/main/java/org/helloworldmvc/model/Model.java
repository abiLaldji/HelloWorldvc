package org.helloworldmvc.model;

import java.io.IOException;

import org.helloworldmvc.contract.IModel;

public class Model implements IModel{
	
	final String fileName = "/home/abi/Hello.txt";


	public String getHelloWorld() throws IOException {
		return DAOHelloWorld.readFile(fileName);
	}



}


package org.helloworldmvc.model;

import java.io.BufferedReader;
import java.io.FileReader;

public class DAOHelloWorld {
	
	
	static String readFile(String fileName) {
	    BufferedReader br;
        StringBuilder sb = new StringBuilder();

		try {
			br = new BufferedReader(new FileReader(fileName));
			
	        String line = br.readLine();

	        while (line != null) {
	            sb.append(line);
	            sb.append("\n");
	            line = br.readLine();
			     br.close();

	        }
	    } catch(Exception e) {
	    	e.printStackTrace();
	    }   	
        return sb.toString();

	}
}

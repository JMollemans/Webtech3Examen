package edu.ap.registratie;

import org.restlet.resource.ClientResource;

public class RaceClient {
	
	public static void main(String[] args) {
        
        try {
       	ClientResource resource = new ClientResource("http://localhost:8081/Registraties/registratie");
       	// Post a new race
       	/*
       	 * datum en uur interventie
		    naam patiënt
		    geboortedatum patiënt
		    naam verpleegkundige
		    diagnose
		    */
       	String race = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>";
       	race += "<race name=\"The next run\" date=\"13/07/2016\" distance=\"10\" id=\"25\"><uri>race/25</uri>";
       	race += "<description>De volgende loop</description>";
       	race += "<runners></runners></race>";
   		resource.post(race);
   		// get the response
       	System.out.println(resource.getResponseEntity().getText());
       }
       catch (Exception e) {
           System.out.println("In main : " + e.getMessage());
       }
   }

}

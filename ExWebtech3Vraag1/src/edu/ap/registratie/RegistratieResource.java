package edu.ap.registratie;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;
import org.restlet.resource.Post;
import edu.ap.xml.XMLParser;

public class RegistratieResource extends ServerResource {

	@Get("html")
	public String getRace() {
		String reg_id = getAttribute("reg_id");
		XMLParser parser = new XMLParser();
		return parser.getRace(reg_id);
	}
	
	@Post("txt")
	public String addRunner(String runner) {
		String reg_id = getAttribute("reg_id");
		XMLParser parser = new XMLParser();
		return parser.addRunner(reg_id, runner);
	}
	
}

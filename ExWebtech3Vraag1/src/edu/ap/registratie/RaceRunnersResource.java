package edu.ap.registratie;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;
import edu.ap.xml.XMLParser;

public class RaceRunnersResource extends ServerResource {

	@Get("html")
	public String getRunners() {
		String reg_id = getAttribute("reg_id");
		XMLParser parser = new XMLParser();
		return parser.getRunners(reg_id);
	}
}

package edu.ap.registratie;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class RacesApplication extends Application {

    /**
     * Creates a root Restlet that will receive all incoming calls.
     */
   @Override
   public synchronized Restlet createInboundRoot() {

       Router router = new Router(getContext());

	    router.attach("/registratie", RegistratieResource.class);
	    router.attach("/registratie/{reg_id}", RegistratieResource.class);
	    router.attach("/registratie/{reg_id}/runner", RaceRunnersResource.class);
	    //router.attach("/registratie/{reg_id}/runner/{runner_id}", RaceRunnerResource.class);

       return router;
   }
}

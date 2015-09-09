package poc.rest.ws.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/hello")
public class Hello {
		@GET
		@Path("{msg}")
		@Produces("text/plain")
		public String getMessage(@PathParam("msg") String msg){
			return "Hello "+msg;
		}
}

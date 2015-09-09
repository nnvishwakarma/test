package poc.rest.ws.config;



public class ApplicationConfig extends org.glassfish.jersey.server.ResourceConfig{
	public ApplicationConfig(){
		packages("poc.rest.ws.resources");
	}
	 
}

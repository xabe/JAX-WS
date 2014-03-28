package es.xabe.arquitectura.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "es.xabe.arquitectura.ws.GreetService", serviceName="GreetService")
public class GreetServiceImpl implements GreetService {

		
	public String getServerTime() {
		  return (new java.util.Date()).toString();
	}	

	public String greet(String name) {
		return "Hello " + name ;
	}

}

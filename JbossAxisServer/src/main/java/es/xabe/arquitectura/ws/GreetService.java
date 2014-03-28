package es.xabe.arquitectura.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="GreetService")
public interface GreetService{
	
	@WebMethod(action="getServerTime",operationName="getServerTime")
    public String getServerTime();
	
	@WebMethod(action="greet",operationName="greet")
    public String greet(@WebParam(name="name")String name);
    
}

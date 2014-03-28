package es.xabe.arquitectura.ws;

import es.xabe.arquitectura.ws.greet.GetServerTime;
import es.xabe.arquitectura.ws.greet.GetServerTimeE;
import es.xabe.arquitectura.ws.greet.GetServerTimeResponseE;
import es.xabe.arquitectura.ws.greet.Greet;
import es.xabe.arquitectura.ws.greet.GreetE;
import es.xabe.arquitectura.ws.greet.GreetResponseE;
import es.xabe.arquitectura.ws.greet.GreetServiceStub;




public class ClientGreet {
	public static final String END_POINT = "http://localhost:8080/JbossAxisServer/GreetService?wsdl";
	
	public ClientGreet() {
		try
		{
			GreetServiceStub stub = new GreetServiceStub(END_POINT);

            //Call the getServerTime method
			GetServerTime param = new GetServerTime();
			GetServerTimeE getServerTimeE = new GetServerTimeE();
			getServerTimeE.setGetServerTime(param);
            GetServerTimeResponseE timeResponse = stub.getServerTime(getServerTimeE);
            System.out.println("The server time is:" + timeResponse.getGetServerTimeResponse().get_return());

            //Call the greet method
            Greet greetInput = new Greet();
            greetInput.setName("Axis2 !!");
            GreetE greetE = new GreetE();
            greetE.setGreet(greetInput);
            GreetResponseE greetResponse = stub.greet(greetE);
            System.out.println("Server responded:" + greetResponse.getGreetResponse().get_return());
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	


}

package es.xabe.arquitectura;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.xabe.arquitectura.model.Acta;
import es.xabe.arquitectura.ws.RegistroWS;



public class Client {
	
	public static void main(String args[]) throws Exception {
		 
		 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"client-cxf.xml"});
		context.start();
		RegistroWS registroWS = (RegistroWS) context.getBean("registroClient");
		Acta example = registroWS.getestado("Pepe");
		System.out.println(example.getNombre());
		
		List<Acta> actas = registroWS.getestados();
		for(Acta acta: actas){
			System.out.println(acta.getNombre());
		}
		
		context.close();		 
	}
}

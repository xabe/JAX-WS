package es.xabe.arquitectura.ws;

import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import es.xabe.arquitectura.model.Acta;
import es.xabe.arquitectura.service.RegistroService;

@WebService(endpointInterface = "es.xabe.arquitectura.ws.RegistroWS", serviceName="registroWS")
public class RegistroWSImpl implements RegistroWS {

	@Autowired
	private RegistroService registroService;


	public Acta getestado(String value) {
		Acta acta = new Acta();
		acta.setNombre(value);
		return acta;
	}
	
	public List<Acta> getestados() {
		return registroService.getActas();
	}

}


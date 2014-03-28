package es.xabe.arquitectura.ws;

import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import es.xabe.arquitectura.model.Acta;
import es.xabe.arquitectura.service.RegistroService;

@WebService(endpointInterface = "es.xabe.arquitectura.ws.RegistroWS", serviceName="RegistroWS")
public class RegistroWSImpl extends SpringBeanAutowiringSupport implements RegistroWS {

	@Autowired
	private RegistroService registroService;


	public Acta getEstado(String value) {
		Acta acta = new Acta();
		acta.setNombre(value);
		return acta;
	}
	
	public List<Acta> getAllEstados() {
		return registroService.getActas();
	}

}


package es.xabe.arquitectura.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import es.xabe.arquitectura.model.Acta;

@WebService
public interface RegistroWS {
	
	@WebMethod
	@WebResult(name="acta")
	Acta getestado(@WebParam(name="tipo")String value);
	
	@WebMethod
	@WebResult(name="actas")
	List<Acta> getestados();
}

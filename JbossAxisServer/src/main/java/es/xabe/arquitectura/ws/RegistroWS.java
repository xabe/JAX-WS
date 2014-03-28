/**
 * RegistroWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.xabe.arquitectura.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import es.xabe.arquitectura.model.Acta;

@WebService(name="RegistroWS")
public interface RegistroWS {
	
	@WebMethod(action="getEstado",operationName="getEstado")
	Acta getEstado(@WebParam(name="tipo")String value);
	
	@WebMethod(action="getAllEstados",operationName="getAllEstados")
	List<Acta> getAllEstados();
}


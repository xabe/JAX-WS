package es.xabe.arquitectura.ws;

import es.xabe.arquitectura.ws.registro.Acta;
import es.xabe.arquitectura.ws.registro.GetAllEstados;
import es.xabe.arquitectura.ws.registro.GetAllEstadosE;
import es.xabe.arquitectura.ws.registro.GetAllEstadosResponseE;
import es.xabe.arquitectura.ws.registro.GetEstado;
import es.xabe.arquitectura.ws.registro.GetEstadoE;
import es.xabe.arquitectura.ws.registro.GetEstadoResponseE;
import es.xabe.arquitectura.ws.registro.RegistroWSStub;





public class ClientRegistro {
	public static final String END_POINT = "http://localhost:8080/JbossAxisServer/RegistroWS?wsdl";
	
	public ClientRegistro() {
		try
		{
			RegistroWSStub stub = new RegistroWSStub(END_POINT);

            //Call the getServerTime method
			GetEstado param = new GetEstado();
			param.setTipo("Axis2 !!");
			GetEstadoE getEstadoE = new GetEstadoE();
			getEstadoE.setGetEstado(param);
			GetEstadoResponseE getEstadoResponseE = stub.getEstado(getEstadoE);
            System.out.println("The server responded:" + getEstadoResponseE.getGetEstadoResponse().get_return().getNombre());

            //Call the greet method
            GetAllEstados params = new GetAllEstados();
            GetAllEstadosE getAllEstadosE = new GetAllEstadosE();
            getAllEstadosE.setGetAllEstados(params);
            GetAllEstadosResponseE allEstadosResponseE = stub.getAllEstados(getAllEstadosE);
            Acta [] actas = allEstadosResponseE.getGetAllEstadosResponse().get_return();
            for(Acta acta : actas){
            	 System.out.println("Server responded:" + acta.getNombre());
            }           
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	


}

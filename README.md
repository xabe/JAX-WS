JBoss JAX-WS
======================

Este ejemplo muestra como conectarse a un JAX-WS remotamente que esta desplegando en un Jboss 6.1 EAP, Este ejemplo utiliza Apache CXF y Axis2 para implementar JAX-WS,
implementa un cliente para conectarse con el servidor.

Ejecutar el ejemplo
-------------------
		
Contruimos el WAR que contiene el servicio Rest
		
		cd JbossAxisServer
        mvn clean package	
		
Despues desplegamos el ear en nuestro JBoss 6.1 EAP

		cp target/JbossAxisServer.war JBOSS_HOME/standalone/deployments

Por ultimo ejecutamos el cliente:
		
		cd JbossAxisClient
		mvn clean package exec:exec
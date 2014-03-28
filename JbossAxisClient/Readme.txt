1º Instalar primero Axis2
2º Crear la variable AXIS2_HOME
3º Añadir la barpeta bin de AXIS2_HOME al PATH

4º WSDL2Java.bat -ss -g -uri http://localhost:8080/JbossAxisServer/RegistroWS?wsdl 
5º WSDL2Java.bat -ss -g -uri http://localhost:8080/JbossAxisServer/GreetService?wsdl 
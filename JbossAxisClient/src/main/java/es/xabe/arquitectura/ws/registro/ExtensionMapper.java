
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package es.xabe.arquitectura.ws.registro;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://ws.arquitectura.xabe.es/".equals(namespaceURI) &&
                  "getEstado".equals(typeName)){
                   
                            return  es.xabe.arquitectura.ws.registro.GetEstado.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.arquitectura.xabe.es/".equals(namespaceURI) &&
                  "getAllEstadosResponse".equals(typeName)){
                   
                            return  es.xabe.arquitectura.ws.registro.GetAllEstadosResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.arquitectura.xabe.es/".equals(namespaceURI) &&
                  "getAllEstados".equals(typeName)){
                   
                            return  es.xabe.arquitectura.ws.registro.GetAllEstados.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.arquitectura.xabe.es/".equals(namespaceURI) &&
                  "acta".equals(typeName)){
                   
                            return  es.xabe.arquitectura.ws.registro.Acta.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.arquitectura.xabe.es/".equals(namespaceURI) &&
                  "getEstadoResponse".equals(typeName)){
                   
                            return  es.xabe.arquitectura.ws.registro.GetEstadoResponse.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
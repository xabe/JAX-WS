
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package es.xabe.arquitectura.ws.greet;
        
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
                  "getServerTime".equals(typeName)){
                   
                            return  es.xabe.arquitectura.ws.greet.GetServerTime.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.arquitectura.xabe.es/".equals(namespaceURI) &&
                  "greetResponse".equals(typeName)){
                   
                            return  es.xabe.arquitectura.ws.greet.GreetResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.arquitectura.xabe.es/".equals(namespaceURI) &&
                  "getServerTimeResponse".equals(typeName)){
                   
                            return  es.xabe.arquitectura.ws.greet.GetServerTimeResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.arquitectura.xabe.es/".equals(namespaceURI) &&
                  "greet".equals(typeName)){
                   
                            return  es.xabe.arquitectura.ws.greet.Greet.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    

/**
 * RegistroWSMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package es.xabe.arquitectura.ws.registro;

        /**
        *  RegistroWSMessageReceiverInOut message receiver
        */

        public class RegistroWSMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        RegistroWSSkeleton skel = (RegistroWSSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getAllEstados".equals(methodName)){
                
                es.xabe.arquitectura.ws.registro.GetAllEstadosResponseE getAllEstadosResponse1 = null;
	                        es.xabe.arquitectura.ws.registro.GetAllEstadosE wrappedParam =
                                                             (es.xabe.arquitectura.ws.registro.GetAllEstadosE)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    es.xabe.arquitectura.ws.registro.GetAllEstadosE.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAllEstadosResponse1 =
                                                   
                                                   
                                                         skel.getAllEstados(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAllEstadosResponse1, false, new javax.xml.namespace.QName("http://ws.arquitectura.xabe.es/",
                                                    "getAllEstados"));
                                    } else 

            if("getEstado".equals(methodName)){
                
                es.xabe.arquitectura.ws.registro.GetEstadoResponseE getEstadoResponse3 = null;
	                        es.xabe.arquitectura.ws.registro.GetEstadoE wrappedParam =
                                                             (es.xabe.arquitectura.ws.registro.GetEstadoE)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    es.xabe.arquitectura.ws.registro.GetEstadoE.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getEstadoResponse3 =
                                                   
                                                   
                                                         skel.getEstado(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getEstadoResponse3, false, new javax.xml.namespace.QName("http://ws.arquitectura.xabe.es/",
                                                    "getEstado"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(es.xabe.arquitectura.ws.registro.GetAllEstadosE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.xabe.arquitectura.ws.registro.GetAllEstadosE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.xabe.arquitectura.ws.registro.GetAllEstadosResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.xabe.arquitectura.ws.registro.GetAllEstadosResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.xabe.arquitectura.ws.registro.GetEstadoE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.xabe.arquitectura.ws.registro.GetEstadoE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.xabe.arquitectura.ws.registro.GetEstadoResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.xabe.arquitectura.ws.registro.GetEstadoResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.xabe.arquitectura.ws.registro.GetAllEstadosResponseE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.xabe.arquitectura.ws.registro.GetAllEstadosResponseE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private es.xabe.arquitectura.ws.registro.GetAllEstadosResponseE wrapgetAllEstados(){
                                es.xabe.arquitectura.ws.registro.GetAllEstadosResponseE wrappedElement = new es.xabe.arquitectura.ws.registro.GetAllEstadosResponseE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.xabe.arquitectura.ws.registro.GetEstadoResponseE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.xabe.arquitectura.ws.registro.GetEstadoResponseE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private es.xabe.arquitectura.ws.registro.GetEstadoResponseE wrapgetEstado(){
                                es.xabe.arquitectura.ws.registro.GetEstadoResponseE wrappedElement = new es.xabe.arquitectura.ws.registro.GetEstadoResponseE();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (es.xabe.arquitectura.ws.registro.GetAllEstadosE.class.equals(type)){
                
                           return es.xabe.arquitectura.ws.registro.GetAllEstadosE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.xabe.arquitectura.ws.registro.GetAllEstadosResponseE.class.equals(type)){
                
                           return es.xabe.arquitectura.ws.registro.GetAllEstadosResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.xabe.arquitectura.ws.registro.GetEstadoE.class.equals(type)){
                
                           return es.xabe.arquitectura.ws.registro.GetEstadoE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.xabe.arquitectura.ws.registro.GetEstadoResponseE.class.equals(type)){
                
                           return es.xabe.arquitectura.ws.registro.GetEstadoResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    
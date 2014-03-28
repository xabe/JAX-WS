
/**
 * GreetServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package es.xabe.arquitectura.ws.greet;

        /**
        *  GreetServiceMessageReceiverInOut message receiver
        */

        public class GreetServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        GreetServiceSkeleton skel = (GreetServiceSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("greet".equals(methodName)){
                
                es.xabe.arquitectura.ws.greet.GreetResponseE greetResponse1 = null;
	                        es.xabe.arquitectura.ws.greet.GreetE wrappedParam =
                                                             (es.xabe.arquitectura.ws.greet.GreetE)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    es.xabe.arquitectura.ws.greet.GreetE.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               greetResponse1 =
                                                   
                                                   
                                                         skel.greet(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), greetResponse1, false, new javax.xml.namespace.QName("http://ws.arquitectura.xabe.es/",
                                                    "greet"));
                                    } else 

            if("getServerTime".equals(methodName)){
                
                es.xabe.arquitectura.ws.greet.GetServerTimeResponseE getServerTimeResponse3 = null;
	                        es.xabe.arquitectura.ws.greet.GetServerTimeE wrappedParam =
                                                             (es.xabe.arquitectura.ws.greet.GetServerTimeE)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    es.xabe.arquitectura.ws.greet.GetServerTimeE.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getServerTimeResponse3 =
                                                   
                                                   
                                                         skel.getServerTime(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getServerTimeResponse3, false, new javax.xml.namespace.QName("http://ws.arquitectura.xabe.es/",
                                                    "getServerTime"));
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(es.xabe.arquitectura.ws.greet.GreetE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.xabe.arquitectura.ws.greet.GreetE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.xabe.arquitectura.ws.greet.GreetResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.xabe.arquitectura.ws.greet.GreetResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.xabe.arquitectura.ws.greet.GetServerTimeE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.xabe.arquitectura.ws.greet.GetServerTimeE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.xabe.arquitectura.ws.greet.GetServerTimeResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.xabe.arquitectura.ws.greet.GetServerTimeResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.xabe.arquitectura.ws.greet.GreetResponseE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.xabe.arquitectura.ws.greet.GreetResponseE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private es.xabe.arquitectura.ws.greet.GreetResponseE wrapgreet(){
                                es.xabe.arquitectura.ws.greet.GreetResponseE wrappedElement = new es.xabe.arquitectura.ws.greet.GreetResponseE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.xabe.arquitectura.ws.greet.GetServerTimeResponseE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.xabe.arquitectura.ws.greet.GetServerTimeResponseE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private es.xabe.arquitectura.ws.greet.GetServerTimeResponseE wrapgetServerTime(){
                                es.xabe.arquitectura.ws.greet.GetServerTimeResponseE wrappedElement = new es.xabe.arquitectura.ws.greet.GetServerTimeResponseE();
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
        
                if (es.xabe.arquitectura.ws.greet.GreetE.class.equals(type)){
                
                           return es.xabe.arquitectura.ws.greet.GreetE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.xabe.arquitectura.ws.greet.GreetResponseE.class.equals(type)){
                
                           return es.xabe.arquitectura.ws.greet.GreetResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.xabe.arquitectura.ws.greet.GetServerTimeE.class.equals(type)){
                
                           return es.xabe.arquitectura.ws.greet.GetServerTimeE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.xabe.arquitectura.ws.greet.GetServerTimeResponseE.class.equals(type)){
                
                           return es.xabe.arquitectura.ws.greet.GetServerTimeResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    

package com.soap.ws;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.0
 * 2021-03-25T23:28:46.560-07:00
 * Generated source version: 3.3.0
 *
 */
public final class MessageGen_MessageGenImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://ws.soap.com/", "messageGenService");

    private MessageGen_MessageGenImplPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = MessageGenService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        MessageGenService ss = new MessageGenService(wsdlURL, SERVICE_NAME);
        MessageGen port = ss.getMessageGenImplPort();

        {
        System.out.println("Invoking getMessage...");
        java.lang.String _getMessage__return = port.getMessage();
        System.out.println("getMessage.result=" + _getMessage__return);


        }
        {
        System.out.println("Invoking getTotal...");
        int _getTotal_arg0 = 0;
        int _getTotal_arg1 = 0;
        java.lang.Double _getTotal__return = port.getTotal(_getTotal_arg0, _getTotal_arg1);
        System.out.println("getTotal.result=" + _getTotal__return);


        }

        System.exit(0);
    }

}
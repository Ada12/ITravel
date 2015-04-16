/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.ObjectFactory;
import beans.Travel;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author yangchen
 */
public class MarshalTravelInfo {
    public void getXml(Travel travelInfo, String path){
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance("beans");
            Marshaller marshaller = jaxbContext.createMarshaller();
            JAXBElement<Travel> jet = (new ObjectFactory()).createTravel(travelInfo);
            marshaller.setProperty(Marshaller.JAXB_ENCODING,"gb2312");
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(jet, new FileOutputStream(path + "travel.xml"));
        } catch (JAXBException ex) {
            Logger.getLogger(MarshalTravelInfo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MarshalTravelInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import beans.ObjectFactory;
import beans.SceneryList;
import beans.SceneryLists;
import beans.SceneryObjectList;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
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
public class MarshalSceneryList {
    
    public void getXml(List<SceneryList> lsl, String path) throws FileNotFoundException {
        SceneryObjectList sol = new SceneryObjectList();
        SceneryLists sls = new SceneryLists();
        sls.setSceneryList(lsl);
        sol.setSceneryLists(sls);
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance("beans");
            Marshaller marshaller = jaxbContext.createMarshaller();
            JAXBElement<SceneryObjectList> jsol = (new ObjectFactory()).createSceneryObjectList(sol);
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(jsol, new FileOutputStream(path + "scenerylist.xml"));
            System.out.println(MarshalSceneryList.class.getResource("/").getPath() + "scenerylist.xml");
        } catch (JAXBException ex) {
            Logger.getLogger(MarshalSceneryList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

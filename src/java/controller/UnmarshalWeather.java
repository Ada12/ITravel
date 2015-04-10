/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.Profiles;
import beans.Weather;
import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.util.ValidationEventCollector;

/**
 *
 * @author yangchen
 */
public class UnmarshalWeather {
    
    public Weather getWeather(String city){
        
        
        try {
            JAXBContext jbc = JAXBContext.newInstance("beans");
            Unmarshaller um = jbc.createUnmarshaller();
            
            um.setEventHandler(new ValidationEventCollector(){
                public boolean handleEvent(ValidationEventCollector ve){
                    System.err.println(ve);
                    return true;
                }
            });
            
            GetResource gr = new GetResource();
            String url = getURL(gr, city);
            String res = gr.getData(url);
        
            Profiles pf = (Profiles) um.unmarshal(new StringReader(res));
            Weather w = pf.getWeather();
            return w;
            
        } catch (JAXBException ex) {
            Logger.getLogger(UnmarshalWeather.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
    public String getURL(GetResource gr, String city){
        city = gr.ChangeGB(city);
        String url = "http://php.weather.sina.com.cn/xml.php?city="+ city +"&password=DJOYnieT8234jlsK&day=0";
        return url;
    }
}

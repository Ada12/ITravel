/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.ValidationEvent;
import javax.xml.bind.ValidationEventHandler;
import java.io.StringReader;
import beans.Result;
import beans.PlaceSearchResponse;
import beans.Results;
import java.util.List;


/**
 *
 * @author yangchen
 */
public class UnmarshalRestaurant {
    
    public List<Result> getData(String location, String category){
//        Result r = new Result();
//        r.setAddress("1239号");
//        r.setName("北京");
//        r.setTelephone("1234556");
//        r.setUid("111");
        
        try {
            JAXBContext jbc = JAXBContext.newInstance("beans");
            Unmarshaller um = jbc.createUnmarshaller();
		   
            um.setEventHandler(new ValidationEventHandler(){
                public boolean handleEvent(ValidationEvent ve){
                System.err.println(ve);
		return true;
                }
            });
            GetResource gr = new GetResource();
            String url = getURL(gr, location, category);
            String res = gr.getData(url);
            
            PlaceSearchResponse psr = (PlaceSearchResponse) um.unmarshal(new StringReader((res)));
            Results results = psr.getResults();
            List<Result> result = results.getResult();
            return result;
            
        } catch (JAXBException ex) {
            Logger.getLogger(UnmarshalRestaurant.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public String getURL(GetResource gr, String location, String category){
        category = gr.ChangeGB(category);
        String url = "http://api.map.baidu.com/place/v2/search?query="+ category +"&location="+ location +"&radius=2000&output=xml&ak=X2FGKdTqlfoXvwXhdz8UYEko";
        return url;
    }
    
    
}

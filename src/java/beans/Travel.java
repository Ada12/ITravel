/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author yangchen
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "travel", propOrder = {
    "travelTitle",
    "travelCity",
    "weather",
    "listScenery",
    "listRestaurant",
    "listBank",
    "listHotel"
})
public class Travel {
    
    @XmlElement(required = true)
    private String travelTitle;
    @XmlElement(required = true)
    private String travelCity;
    @XmlElement(required = true)
    private Weather weather;
    @XmlElement(required = true)
    private List<Scenery> listScenery;
    @XmlElement(required = true)
    private List<Result> listRestaurant;
    @XmlElement(required = true)
    private List<Result> listBank;
    @XmlElement(required = true)
    private List<Hotel> listHotel;

    public String getTravelTitle() {
        return travelTitle;
    }

    public void setTravelTitle(String travelTitle) {
        this.travelTitle = travelTitle;
    }

    public String getTravelCity() {
        return travelCity;
    }

    public void setTravelCity(String travelCity) {
        this.travelCity = travelCity;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public List<Scenery> getListScenery() {
        return listScenery;
    }

    public void setListScenery(List<Scenery> listScenery) {
        this.listScenery = listScenery;
    }

    public List<Result> getListRestaurant() {
        return listRestaurant;
    }

    public void setListRestaurant(List<Result> listRestaurant) {
        this.listRestaurant = listRestaurant;
    }

    public List<Result> getListBank() {
        return listBank;
    }

    public void setListBank(List<Result> listBank) {
        this.listBank = listBank;
    }

    public List<Hotel> getListHotel() {
        return listHotel;
    }

    public void setListHotel(List<Hotel> listHotel) {
        this.listHotel = listHotel;
    }
    
    
}

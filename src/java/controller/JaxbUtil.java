/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.StringWriter;
import java.util.Collection;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.namespace.QName;
import org.apache.commons.lang.StringUtils;

/**
 *
 * @author yangchen
 */
public class JaxbUtil {
    private JAXBContext jaxbContext;
    
    //所有需要序列化的Root对象类型
    public JaxbUtil(Class<?>... types) {  
        try {  
            jaxbContext = JAXBContext.newInstance(types);  
        } catch (JAXBException e) {  
            throw new RuntimeException(e);  
        }  
    } 
    
    //object->Xml
    public String toXml(Object root, String encoding){
        try {
            StringWriter writer = new StringWriter();  
            createMarshaller(encoding).marshal(root, writer);  
            return writer.toString();
        } catch (JAXBException ex) {
            throw new RuntimeException(ex);
        }
    }

    //object list -> xml Root Element是Collection的情形
    @SuppressWarnings("unchecked")
    public String toXml(Collection root, String rootName, String encoding){
        try {
            CollectionWrapper wrapper = new CollectionWrapper();
            wrapper.collection = root;
            JAXBElement<CollectionWrapper> wrapperElement = new JAXBElement<CollectionWrapper>
                (new QName(rootName), CollectionWrapper.class, wrapper);
            StringWriter writer = new StringWriter();
            createMarshaller(encoding).marshal(wrapperElement, writer);
            return writer.toString();
        } catch (JAXBException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    //创建marshaller，设置encoding
    public Marshaller createMarshaller(String encoding){
        try {
            Marshaller marshaller = jaxbContext.createMarshaller();  
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);  
  
            if (StringUtils.isNotBlank(encoding)) {  
                marshaller.setProperty(Marshaller.JAXB_ENCODING, encoding);  
            }  
            return marshaller;  
        } catch (JAXBException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    //封装Root Element是Collection的情况
    public static class CollectionWrapper{
        @SuppressWarnings("unchecked")
        @XmlAnyElement
        protected Collection collection;
    }
}

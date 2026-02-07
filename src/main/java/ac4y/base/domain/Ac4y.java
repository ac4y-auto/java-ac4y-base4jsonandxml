package ac4y.base.domain;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlRootElement;

import ac4y.utility.GsonCap;
import ac4y.utility.JaxbCap;
import com.google.gson.Gson;

@XmlRootElement
@MappedSuperclass
public class Ac4y extends Ac4yObject { 
	
	public String getAsJson(){
		return new GsonCap().getObjectAsJson(this);
	}
	
	public Object getFromJson(String json){

		//return new GsonCap().getFromJson(aJson, this.getClass());
		return new Gson().fromJson(json, this.getClass());
	}
	
	public String getAsXml() throws JAXBException{
		return new JaxbCap().getObjectAsXmlString(this.getClass(), this);
	}

	public Object getFromXml(String aXml) throws JAXBException{
		return new JaxbCap().getObjectFromXmlString(this.getClass(), aXml);
	}
		
}

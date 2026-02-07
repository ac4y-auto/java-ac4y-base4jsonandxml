package ac4y.base.domain;

import javax.xml.bind.JAXBException;

import ac4y.utility.GsonCap;
import ac4y.utility.JaxbCap;

public class Ac4yNoId {

	public String getAsJson(){
		return new GsonCap().getObjectAsJson(this);
	}
	
	public Object getFromJson(String aJson){
		return new GsonCap().getFromJson(aJson, this.getClass());
	}
	
	public String getAsXml() throws JAXBException{
		return new JaxbCap().getObjectAsXmlString(this.getClass(), this);
	}

	public Object getFromXml(String aXml) throws JAXBException{
		return new JaxbCap().getObjectFromXmlString(this.getClass(), aXml);
	}
		
}

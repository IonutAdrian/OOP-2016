package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;


public abstract class Mammal extends Animal {

		private float normalBodyTemp;
		private float percBodyHair;
		
		
		
		
	
		public float getNormalBodyTemp(){
			return normalBodyTemp;
		}
		public float getPercBodyHair(){
			return percBodyHair;
		}
		public void setNormalBodyTemp(float temp){
			normalBodyTemp=temp;
		}
		public void setPrecBodyHair(float hair){
			percBodyHair=hair;
		}
		
		public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
			super.encodeToXml(eventWriter);
			createNode(eventWriter, "normalBodyTemp", String.valueOf(getNormalBodyTemp()));
			createNode(eventWriter, "percBodyHair", String.valueOf(getPercBodyHair()));
			}
		public void decodeFromXml(Element element) {
			setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("normalBodyTemp").item(0).getTextContent()));
			setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("percBodyHair").item(0).getTextContent()));
			}
			
	}



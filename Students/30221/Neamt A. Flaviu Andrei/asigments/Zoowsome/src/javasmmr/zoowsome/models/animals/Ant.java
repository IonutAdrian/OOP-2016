package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import java.util.Random;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Ant extends Insect {

	 public Ant(String name, int legs,boolean canFly,boolean isDangerous,double cost,double perc){
		 this.setName(name);
		 this.setNrOfLegs(legs);
		 this.setCanFly(canFly);
		 this.setIsDangerous(isDangerous);
		 this.setDangerPerc(perc);
		 this.setMaitenanceCost(cost);
	 }
	 
	 public Ant(){
		 this.setName("Ant");
		 this.setNrOfLegs(2);
		 this.setCanFly(false);
		 this.setIsDangerous(true);
		 this.setMaitenanceCost(1.0);
		 this.setDangerPerc(0.1);
	 }
	 @Override
		public boolean kill() {
		double killeru;
		Random aiurea=new Random();
		killeru=aiurea.nextDouble();
		if(killeru>= this.getDangerPerc())
			return false;
		return true;
		}
	 public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	 {
	 super.encodeToXml(eventWriter);
	 createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
	 Constants.Animals.Insects.Ant);
	 }
}
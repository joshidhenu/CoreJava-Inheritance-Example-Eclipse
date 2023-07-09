package animal.reptile;

import animal.Animal;

public class Reptile extends Animal{
	protected String skin, egg;
	protected boolean backbone;
	
	public Reptile() {
		heightInFeet = 5;
		weightInKilos = 20;
		animalType = "Reptile";
		bloodType = "cold";
		this.skin = "Dry Skin";
		this.backbone = true;
		this.egg = "soft shelled";
	}
	
	

	@Override
	public String ShowInfo() {
		return "Reptile [skin=" + skin + ", egg=" + egg + ", backbone=" + backbone + ", heightInFeet=" + heightInFeet
				+ ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

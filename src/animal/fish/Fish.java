package animal.fish;

import animal.Animal;

public class Fish extends Animal{

	protected boolean waterBone = true;
	protected boolean gills = true;
	
	
	public Fish() {
		
		animalType = "Fish";
		this.waterBone = true;
		this.gills = true;
	}


	@Override
	public String ShowInfo() {
		return "Fish [waterBone=" + waterBone + ", gills=" + gills + ", heightInFeet=" + heightInFeet
				+ ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

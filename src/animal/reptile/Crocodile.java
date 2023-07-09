package animal.reptile;

public class Crocodile extends Reptile{
	
	
	public Crocodile() {
		super();
		egg = "Hard Shelled";
	}
	

	@Override
	public String ShowInfo() {
		return "Crocodile [skin=" + skin + ", egg=" + egg + ", backbone=" + backbone + ", heightInFeet=" + heightInFeet
				+ ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

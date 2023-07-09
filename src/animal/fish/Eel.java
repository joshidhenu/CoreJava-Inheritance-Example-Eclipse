package animal.fish;

public class Eel extends Fish {
	
	private String special;
	
	public Eel() {
		super();
		this.special = "Release electric stock";
	}
	

	@Override
	public String ShowInfo() {
		return "Eel [special=" + special + ", waterBone=" + waterBone + ", gills=" + gills + ", heightInFeet="
				+ heightInFeet + ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType="
				+ bloodType + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

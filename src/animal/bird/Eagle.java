package animal.bird;

public class Eagle extends Bird {
	
	

	@Override
	public String ShowInfo() {
		return "Eagle [feather=" + feather + ", canFly=" + canFly + ", heightInFeet=" + heightInFeet
				+ ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

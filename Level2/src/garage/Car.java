package garage;

public class Car extends Vehicle{

	private int numberOfDoors;

	public Car(int vehicleID, String make, String model, int fuelCapacity, int numberOfDoors) {
		super(vehicleID, make, model, fuelCapacity);
		this.numberOfDoors = numberOfDoors;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}


}

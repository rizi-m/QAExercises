package garage;

public class Vehicle {
	
	private int vehicleID;
	private String make;
	private String model;
	private int fuel;
	private int fuelCapacity;
	private boolean isOn;
	
	public Vehicle(int vehicleID, String make, String model, int fuelCapacity) {
		super();
		this.vehicleID = vehicleID;
		this.make = make;
		this.model = model;
		this.fuelCapacity = fuelCapacity;
		fuel = 0;
		isOn = false;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	public int getVehicleID() {
		return vehicleID;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}
			
}

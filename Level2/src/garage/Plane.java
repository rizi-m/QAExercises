package garage;

public class Plane extends Vehicle {

	private int altitude;
	private boolean isFlying;
	
	
	public Plane(int vehicleID, String make, String model, int fuelCapacity) {
		super(vehicleID, make, model, fuelCapacity);
		altitude = 0;
		isFlying = false;
	}

	public int getAltitude() {
		return altitude;
	}


	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}


	public boolean isFlying() {
		return isFlying;
	}

}

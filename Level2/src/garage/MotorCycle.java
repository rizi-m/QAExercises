package garage;

public class MotorCycle extends Vehicle{
	private boolean isPassengerAllowed;

	public MotorCycle(int vehicleID, String make, String model, int fuelCapacity, boolean isPassengerAllowed) {
		super(vehicleID, make, model, fuelCapacity);
		this.isPassengerAllowed = isPassengerAllowed;
	}

	public boolean isPassengerAllowed() {
		return isPassengerAllowed;
	}
	
	
}

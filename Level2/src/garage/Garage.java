package garage;
import java.util.ArrayList;
import java.util.Optional;

public class Garage {
	
	private ArrayList<Vehicle> vehicles = new ArrayList<>();
	
	public void add(Vehicle vehicle) {
		vehicles.add(vehicle);
	}
	
	public Optional<Vehicle> removeVehicleById(int id) {
		Optional<Vehicle> vehicleToRemove = vehicles.stream()
			.filter(vehicle -> vehicle.getVehicleID() == id)
			.findFirst();
		if (vehicleToRemove.isPresent()) {
			vehicles.remove(vehicleToRemove.get());
		}
		return vehicleToRemove;
	}
	
	public static int calculateBillFor(Vehicle vehicle) {
		if (vehicle instanceof Car) {
			Car car = (Car) vehicle;
			return 190 + car.getFuelCapacity() * (car.getNumberOfDoors() / 2);
		}
		if (vehicle instanceof MotorCycle) {
			MotorCycle motorCycle = (MotorCycle) vehicle;
			if (motorCycle.isPassengerAllowed()) {
				return 70 + motorCycle.getFuelCapacity() * 2;
			}
			return 70 + motorCycle.getFuelCapacity();
		}
		if (vehicle instanceof Plane) {
			return 10000 + 10 * vehicle.getFuelCapacity();
		}
		return 0;
	}
	
	public void calculateBillsForVehicles() {
		for(Vehicle vehicle : vehicles) {
			int bill = calculateBillFor(vehicle);
			System.out.println(bill);
		}
	}
	
	
	public void empty() {
		vehicles.clear();
	}
	
	public static void main(String[] args) {
		Garage garage = new Garage();
		garage.add(new Car(10, "", "", 1, 50));
		garage.add(new MotorCycle(20, "", "", 9, false));
		garage.add(new Plane(90, "", "", 200));


	}
}

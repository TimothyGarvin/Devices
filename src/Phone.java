
public class Phone extends Device {
	
	public void makeCall() {
		System.out.println("Making a call now.");
		batteryPercentage -= 5;
		currentBattery();
	}
	public void playGame() {
		System.out.println("Gaming");
		batteryPercentage -= 20;
		currentBattery();
	}
	public void charge() {
		System.out.println("Charging!");
		batteryPercentage += 50;
		currentBattery();
	}
}

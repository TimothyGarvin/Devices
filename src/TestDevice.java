
public class TestDevice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Device device = new Device();
		Phone phone = new Phone();
		device.currentBattery();
		
		phone.makeCall();
		phone.makeCall();
		phone.makeCall();
		
		phone.playGame();
		phone.playGame();
		phone.charge();
	}

}

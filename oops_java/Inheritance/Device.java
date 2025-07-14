public class Device {
	int deviceId;
	String status;
	public Device(int deviceId, String status) {
		this.deviceId = deviceId;
		this.status = status;
	}
	public void displayStatus() {
		System.out.println("devide id: " + deviceId);
		System.out.println("status " + status);
	}
	
}
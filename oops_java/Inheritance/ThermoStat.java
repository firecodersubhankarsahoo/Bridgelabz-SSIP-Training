public class ThermoStat extends Device {
	String tempSetting;
	public ThermoStat(int id, String status, String tempSetting) {
		super(id,status);
		this.tempSetting = tempSetting;
	}
	
	public void displayStatus() {
		super.displayStatus();
		System.out.println("Temperature settings: "+ tempSetting);
	}
	public static void main(String[] args) {
		ThermoStat ob = new ThermoStat(101, "on", "setting on");
		ob.displayStatus();
	}
}
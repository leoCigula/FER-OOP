package hr.fer.oop.a6.comp;

public class Mp3Player extends Device implements Portable{
	private int batteryCapacity;
	private int memorySize;
	
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity=batteryCapacity;
	}
	public int getMemorySize() {
		return memorySize;
	}
	public void setMemorySize(int memorySize) {
		this.memorySize=memorySize;
	}
	public Mp3Player() {
		
	}
	public Mp3Player(String name,String manufacturer,int batteryCapacity,int memorySize) {
		super(name,manufacturer);
		this.batteryCapacity=batteryCapacity;
		this.memorySize=memorySize;
	}
}

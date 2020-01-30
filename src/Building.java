
public abstract class Building {

	private int floors;
	private int windows;
	
	public Building(int floors,int windows) {
		setFloors(floors);
		setWindows(windows);
		
	}
	public Building(int windows) {
		setWindows(windows);
	}
	
	public abstract double findSquareFootage();
	
	public int getFloors() {
		return floors;
	}
	public void setFloors(int floors) {
		this.floors = floors;
	}
	public int getWindows() {
		return windows;
	}
	public void setWindows(int windows) {
		this.windows = windows;
	}
	
	
	
}

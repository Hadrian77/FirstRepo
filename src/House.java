
public class House extends Building implements MLSListable {

	private Room[] rooms;
	private int bathrooms;

	public House(int floors, int windows, Room[] rooms, int bathrooms) {
		super(floors, windows);
		setRooms(rooms);
		setBathrooms(bathrooms);
		// TODO Auto-generated constructor stub
	}

	public int countRooms() {
		int roomCount = 0;
		for (Room room : rooms) {
			roomCount++;

		}
		return roomCount;
	}
	

	public Room[] getRooms() {
		return rooms;
	}

	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}

	public int getBathrooms() {
		return bathrooms;
	}

	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}

	public double findSquareFootage() {
		double squareFootage = 0;
		double roomArea = 0;
		for (Room room : rooms) {

			roomArea = room.getLength() * room.getWidth();
			squareFootage += roomArea;

		}
		return squareFootage;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return   "This home has " + this.countRooms() + " bedrooms and " + this.getBathrooms()
		+ " bathrooms, with a  " + this.findSquareFootage() + " square foot floorplan.";
	}

	
}

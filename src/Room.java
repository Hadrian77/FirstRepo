
public class Room implements Comparable<Room> {
	private double length;
	private double width;
	private int closets;
	private String floorCovering;

	Room(double length, double width, int closets, String floorCovering) {
		setLength(length);
		setWidth(width);
		setClosets(closets);
		setFloorCovering(floorCovering);

	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public int getClosets() {
		return closets;
	}

	public void setClosets(int closets) {
		this.closets = closets;
	}

	public String getFloorCovering() {
		return floorCovering;
	}

	public void setFloorCovering(String floorCovering) {
		this.floorCovering = floorCovering;
	}

	public int compareTo(Room o) {

		if (this.length == o.length && this.width == o.width && this.closets == o.closets && this.floorCovering.equals(o.floorCovering)) {
			return 0;
		}
		else if(this.length == o.length && this.width == o.width && this.closets == o.closets && this.floorCovering.compareTo(o.floorCovering)== 1)
		{
			return 1;
		}
		
		else if(this.length == o.length && this.width == o.width && this.closets == o.closets && this.floorCovering.compareTo(o.floorCovering)==-1) {
			return -1;
		}
		else if (this.length + this.width + this.closets > o.length + o.width + o.closets) {
			return 1;
		} else if (this.length + this.width + this.closets < o.length + o.width + o.closets) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (obj instanceof Room) {
			Room test = (Room) obj;
			if (this.length == test.length && this.width == test.width && this.closets == test.closets &&
					this.floorCovering.equals(test.floorCovering)
					) {
				return true;
			}
		}
		return false;

	}
}

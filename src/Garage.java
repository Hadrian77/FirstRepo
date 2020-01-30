
public class Garage extends Building {

	private double length;
	private double width;
	int cars;
	boolean isGravel;
	boolean isCement;

	Garage(int windows, double length, double width, int cars, int gravelOddCementEven) {
		super(windows);
		setLength(length);
		setWidth(width);
		setCars(cars);
		if (gravelOddCementEven % 2 == 0) {
			isGravel = false;
			isCement = true;
		}

		else {
			isGravel = true;
			isCement = false;
		}

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

	public int getCars() {
		return cars;
	}

	public void setCars(int cars) {
		this.cars = cars;
	}

	public boolean isGravel() {
		return isGravel;
	}

	public void setGravel(boolean isGravel) {
		this.isGravel = isGravel;
		this.isCement = !isGravel;
	}

	public boolean isCement() {
		return isCement;
	}

	public void setCement(boolean isCement) {
		this.isCement = isCement;
		this.isGravel = !isCement;
	}

	@Override
	public double findSquareFootage() {
		double squareFootage = this.getLength() * this.getWidth();

		return squareFootage;
	}

	@Override
	public String toString() {
		if (isGravel) {
			return "This garage has " + this.getWindows() + " windows, is a " + this.getCars()
					+ " car garage with " + this.findSquareFootage() + " square feet of gravel flooring";
		} else {
			return "This garage has " + this.getWindows() + " windows, is a " + this.getCars() + " car garage with "
					+ this.findSquareFootage() + " square feet of cement flooring";
		}
	}
}

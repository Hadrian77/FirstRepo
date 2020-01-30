
public interface MLSListable {
	
	public static String getMLSListing(House house) {

		return "This home has " + house.countRooms() + " bedrooms and " + house.getBathrooms()
				+ " bathrooms, with a  " + house.findSquareFootage() + " square foot floorplan.";
	}

}

import java.util.ArrayList;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		Random rand = new Random();
		Room type1 = new Room(40.3, 34.5, 1, "Carpet");
		Room type2 = new Room(46.9, 10.7, 1, "Tile");
		Room type3 = new Room(40.3, 34.5, 1, "Wood");
		Room type4 = new Room(70.8, 69.5, 2, "Carpet");
		Room type5 = new Room(21.0, 34.5, 1, "Tile");
		Room type6 = new Room(47.5, 36.6, 3, "Carpet");
		Room[] full = { type1, type2, type3, type4, type5, type6 };

		House roja = new House(1, 1, buildHouse(full), 1);
		House amarilla = new House(19, 2, buildHouse(full), 3);
		House morada = new House(8, 4, buildHouse(full), 11);
		House blanca = new House(16, 2, buildHouse(full), 2);
		Garage rojo = new Garage(1,1.0,1.0,1,1);
		Garage amarillo = new Garage(2,112.0,1231.0,12,3);
		Garage morado = new Garage(2,1200.0,1200.0,1,1);
		Garage blanco = new Garage(2,14.8,90.0,4,1);
		
		ArrayList<Building> buildings = new ArrayList<Building>();
		buildings.add(blanco);
		buildings.add(blanca);
		buildings.add(amarillo);
		buildings.add(amarilla);
		buildings.add(rojo);
		buildings.add(roja);
		buildings.add(morado);
		buildings.add(morada);
		for(Building b: buildings) {
			System.out.println(b);
		}
		System.out.println();
		System.out.println(MLSListable.getMLSListing(roja));
		//garage
		//System.out.println(MLSListable.getMLSListing(rojo));
		//room
		//System.out.println(MLSListable.getMLSListing(type1));
	}

	public static Room[] buildHouse(Room[] full) {
		int index = 0;
		Room[] houseInProgress = new Room[10];
		Random rand = new Random();
		int counter = 0;
		for (int i = 0; i < 10; i++) {
			
			double chance = rand.nextDouble();
			int picker = rand.nextInt(6);
			if (i == 0) {
				houseInProgress[0] = full[picker];
				index++;
			} 
		
			else if (chance < 0.35) {
				houseInProgress[index] = full[picker];
				index++;
			}
		}
			Room[] builtHouse = new Room[index];
			for (int y = 0; y < index; y++) {
				 
					builtHouse[y] = houseInProgress[y];
				
			
				}
				
		
		
		
	

		return builtHouse;
}
}

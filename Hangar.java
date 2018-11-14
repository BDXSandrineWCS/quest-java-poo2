import java.util.ArrayList;

public class Hangar{
	
	public static void main( String ... args ) {
		Car clio = new Car( "Renault" , 60000 );
		Car mini = new Car( "BMW" , 150000 );
		Car ignis = new Car( "Suzuki" , 107004 );
		Boat schooner = new Boat ( "Aegean", 2007090);
		Boat peterson = new Boat ( "Camden", 8098);
		Boat beaufort = new Boat ( "Herbulot", 403465);
		
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(clio);
        	vehicles.add(schooner);
		vehicles.add(peterson);
		vehicles.add(mini);
		vehicles.add(beaufort);
		vehicles.add(ignis);

		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle.doStuff());
		}
		
	}
}

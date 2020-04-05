
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x = 0;
		Scanner scan = new Scanner(System.in);
				
		Bus bus = new Bus("06 ANK 06", 24);
		while( x != 5)
		{
			System.out.println("1-Book a seat");
			System.out.println("2-Display all passengers with their seat numbers");
			System.out.println("3-Display all available seatIDs");
			System.out.println("4-Search");
			System.out.println("5-Exit");
			System.out.print("Enter your choose: ");
			
			x = scan.nextInt();
			
			if ( x == 1 )
			{
				
				System.out.print("Enter seat id: ");
				int a = scan.nextInt();
				
				Passenger p = new Passenger();
				System.out.print("Enter name: ");
				String b = scan.next();
				p.setName(b);
				System.out.print("Enter surname: ");
				String c = scan.next();
				p.setSurname(c);
				System.out.print("Enter gender: ");
				String d = scan.next();
				p.setGender(d);
				
				Phone p1 = new Phone();
				System.out.print("Enter country code: ");
				String e = scan.next();
				p1.setCountrycode(e);
				System.out.print("Enter code: ");
				String f = scan.next();
				p1.setCode(f);
				System.out.print("Enter number: ");
				String g = scan.next();
				p1.setNumber(g);
				System.out.print("Enter type: ");
				String h = scan.next();
				p1.setType(h);
				p.setPhone(p1);
				
				bus.bookSeat(p, a);
					
			}
	
			else if ( x == 2 )
			{
				bus.printAllPassengers();
				
			}
			else if ( x == 3 )
			{
				bus.printAllAvailableSeatIDs();
			}
			else if ( x == 4 )
			{
				
				bus.search();
			}
			
		}
		
	}
		
}

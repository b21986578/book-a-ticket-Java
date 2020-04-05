

import java.util.Scanner;

public class Bus {
	private String plate;
	private  int  seatCount;
	Seat [] seats;
	
	
	public Bus(String plate, int seatCount) {
		this.setSeatCount(seatCount);
		this.seats = new Seat[seatCount];
		this.plate = plate;
		for(int i=0; i < seatCount; i++) {
			seats[i] = new Seat();
		}
		System.out.println("------"+plate+"------"+"Capacity of Bus: "+seatCount);
		
	}
	public void bookSeat(Passenger p, int seatID ) {
		
		if(seats[seatID-1].getStatus())
		{
			System.out.println("The seat has already reserved!");
		}
		else
		{
			seats[seatID-1] = new Seat(seatID, true, p);
		}
		
		
	}
	public void printAllPassengers() {
		
		for(int i=0;i<getSeatCount();i++) 
		{
			if(seats[i].getseatID() != 0)
			{
				seats[i].display();
			}
		}
				
		}		
		
	public void printAllAvailableSeatIDs() {
		for(int i=0;i<getSeatCount();i++) 
		{
			if(seats[i].getseatID() != 0)
			{
				System.out.println(i+1+"-Reserved");
			}
			else
			{
				System.out.println(i+1+"-Available");
			}
		}
	}
	public void search() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter name: ");
		String a = scan.nextLine();
		System.out.print("Enter surname: ");
		String b = scan.nextLine();
		boolean flag = true;
		for(int i=0;i< getSeatCount();i++) {
			if(seats[i].getStatus())
			{
				if ( a.equals(seats[i].getP().getName()) && b.equals(seats[i].getP().getSurname()))
				{
					System.out.println(seats[i].getP().display());
					flag = false;
				}
			}	
		}
		if(flag)
		{
			System.out.println("This passenger is not found!");
		}
					
	}
	
	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}
	public int getSeatCount() {
		return seatCount;
	}
	public  void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

}

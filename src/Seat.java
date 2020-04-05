

public class Seat {
	private  int seatID;
	private  boolean status;
	private Passenger p;
	public Seat() {
	}
	public Seat(int seatID, boolean status, Passenger p) {
		this.seatID = seatID;
		this.status = status;
		this.p = p;
	}
	public void display() {
		
		System.out.println( "Seat: "+ getseatID() + " status: Reserved" +"\n"+p.display());
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public  int getseatID() {
		return seatID;
	}
	public void setseatID(int seatID){
		this.seatID = seatID;
	}
	public Passenger getP() {
		return p;
	}
	public void setP(Passenger p) {
		this.p = p;
	}
}

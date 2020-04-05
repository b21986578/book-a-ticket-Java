


public class Passenger {
	private  String name;
	private  String surname;
	private  String gender;
	private Phone phone;
	
	public Passenger() {
		
	}
	public Passenger(String name, String surname, String gender,Phone phone) {
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.setPhone(phone);
	
	}
	
	public String display() {
		return getName() + " " + getSurname() + " " + "(" + getGender() + ")"+ "\n"+ phone.display();
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public  String getName() {
		return name;
	}
	public  String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public  String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
}

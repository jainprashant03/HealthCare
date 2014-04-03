import java.util.ArrayList;


public class Doctor {
	private String name;
	private int id;
	private String specialty;
	private int phoneNumber;
	private ArrayList<Timeslot> timeslots;
	/**
	 * @param name
	 * @param id
	 * @param specialty
	 * @param phoneNumber
	 */
	public Doctor(String name, int id, String specialty, int phoneNumber) {
		super();
		this.name = name;
		this.id = id;
		this.specialty = specialty;
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public ArrayList<Timeslot> getTimeslots() {
		return timeslots;
	}
	public void setTimeslots(ArrayList<Timeslot> timeslots) {
		this.timeslots = timeslots;
	}
	
	
	
}

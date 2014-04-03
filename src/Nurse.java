import java.util.ArrayList;


public class Nurse {
	private String name;
	private int id;
	private ArrayList<Consultation> consultations;
	/**
	 * @param name
	 * @param id
	 * @param consultations
	 */
	public Nurse(String name, int id) {
		super();
		this.name = name;
		this.id = id;
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
	public ArrayList<Consultation> getConsultations() {
		return consultations;
	}
	public void setConsultations(ArrayList<Consultation> consultations) {
		this.consultations = consultations;
	}
	
}

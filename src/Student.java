import java.util.ArrayList;


public class Student {
	private String name;
	private int id;
	private MedicalRecord medicalRecord;
	private ArrayList<Appointment> appointments;
	private ArrayList<Consultation> consultations;
	/**
	 * @param name
	 * @param id
	 * @param medicalRecord
	 */
	public Student(String name, int id, MedicalRecord medicalRecord) {
		super();
		this.name = name;
		this.id = id;
		this.medicalRecord = medicalRecord;
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
	public MedicalRecord getMedicalRecord() {
		return medicalRecord;
	}
	public void setMedicalRecord(MedicalRecord medicalRecord) {
		this.medicalRecord = medicalRecord;
	}
	public ArrayList<Appointment> getAppointments() {
		return appointments;
	}
	public void setAppointments(ArrayList<Appointment> appointments) {
		this.appointments = appointments;
	}
	public ArrayList<Consultation> getConsultations() {
		return consultations;
	}
	public void setConsultations(ArrayList<Consultation> consultations) {
		this.consultations = consultations;
	}

}

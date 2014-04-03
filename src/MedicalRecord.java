import java.util.ArrayList;


public class MedicalRecord {
	private Student student;
	private int recordId;
	private ArrayList<Vaccination> vaccinations;
	private ArrayList<HealthProblem> healthProblems;
	/**
	 * @param student
	 * @param recordId
	 */
	public MedicalRecord(Student student, int recordId) {
		super();
		this.student = student;
		this.recordId = recordId;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public int getRecordId() {
		return recordId;
	}
	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}
	public ArrayList<Vaccination> getVaccinations() {
		return vaccinations;
	}
	public void setVaccinations(ArrayList<Vaccination> vaccinations) {
		this.vaccinations = vaccinations;
	}
	public ArrayList<HealthProblem> getHealthProblems() {
		return healthProblems;
	}
	public void setHealthProblems(ArrayList<HealthProblem> healthProblems) {
		this.healthProblems = healthProblems;
	}
	
}

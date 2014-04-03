import java.sql.Date;
import java.sql.Time;


public class Consultation {
	private Nurse nurse;
	private Student student;
	private Date date;
	private Time time;
	private String notes;
	/**
	 * @param nurse
	 * @param student
	 * @param date
	 * @param time
	 */
	public Consultation(Nurse nurse, Student student, Date date, Time time) {
		super();
		this.nurse = nurse;
		this.student = student;
		this.date = date;
		this.time = time;
	}
	public Nurse getNurse() {
		return nurse;
	}
	public void setNurse(Nurse nurse) {
		this.nurse = nurse;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
}

import java.sql.Date;
import java.sql.Time;


public class Appointment extends Timeslot {
	private Student student;
	private String reason;
	private String notes;
	/**
	 * @param doctor
	 * @param date
	 * @param time
	 * @param duration
	 * @param student
	 * @param reason
	 */
	public Appointment(Doctor doctor, Date date, Time time, int duration, Student student, String reason) {
		super(doctor, date, time, duration);
		this.student = student;
		this.reason = reason;
	}
	public Student getStudent() {
		return student;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
}

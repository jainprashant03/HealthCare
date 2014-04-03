import java.sql.Date;
import java.sql.Time;


public class Timeslot {
	private Doctor doctor;
	private Date date;
	private Time time;
	private int duration;
	/**
	 * @param doctor
	 * @param date
	 * @param time
	 * @param duration
	 */
	public Timeslot(Doctor doctor, Date date, Time time, int duration) {
		super();
		this.doctor = doctor;
		this.date = date;
		this.time = time;
		this.duration = duration;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
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
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
}

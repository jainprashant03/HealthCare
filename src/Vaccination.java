import java.sql.Date;
import java.sql.Time;


public class Vaccination {
	private String type;
	private Date date;
	private Time time;
	private Doctor givenBy;
	private Student givenTo;
	/**
	 * @param type
	 * @param date
	 * @param time
	 * @param givenBy
	 * @param givenTo
	 */
	public Vaccination(String type, Date date, Time time, Doctor givenBy,
			Student givenTo) {
		super();
		this.type = type;
		this.date = date;
		this.time = time;
		this.givenBy = givenBy;
		this.givenTo = givenTo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	public Doctor getGivenBy() {
		return givenBy;
	}
	public void setGivenBy(Doctor givenBy) {
		this.givenBy = givenBy;
	}
	public Student getGivenTo() {
		return givenTo;
	}
	public void setGivenTo(Student givenTo) {
		this.givenTo = givenTo;
	}
}

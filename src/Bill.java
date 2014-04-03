
public class Bill {
	private int amount;
	private Appointment appointment;
	/**
	 * @param amount
	 * @param appointment
	 */
	public Bill(int amount, Appointment appointment) {
		super();
		this.amount = amount;
		this.appointment = appointment;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Appointment getAppointment() {
		return appointment;
	}
	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

}

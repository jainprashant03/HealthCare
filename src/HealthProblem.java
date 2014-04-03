
public class HealthProblem {
	private String diagnosis;
	private String description;
	private String treatment;
	/**
	 * @param diagnosis
	 * @param description
	 * @param treatment
	 */
	public HealthProblem(String diagnosis, String description, String treatment) {
		super();
		this.diagnosis = diagnosis;
		this.description = description;
		this.treatment = treatment;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTreatment() {
		return treatment;
	}
	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

}

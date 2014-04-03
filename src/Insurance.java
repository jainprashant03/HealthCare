
public class Insurance {
	private Student student;
	private String company;
	private int idNo;
	private int deductible;
	private int currentDeductible;
	/**
	 * @param student
	 * @param company
	 * @param idNo
	 * @param deductible
	 */
	public Insurance(Student student, String company, int idNo, int deductible) {
		super();
		this.student = student;
		this.company = company;
		this.idNo = idNo;
		this.deductible = deductible;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getIdNo() {
		return idNo;
	}
	public void setIdNo(int idNo) {
		this.idNo = idNo;
	}
	public int getDeductible() {
		return deductible;
	}
	public void setDeductible(int deductible) {
		this.deductible = deductible;
	}
	public int getCurrentDeductible() {
		return currentDeductible;
	}
	public void setCurrentDeductible(int currentDeductible) {
		this.currentDeductible = currentDeductible;
	}

}

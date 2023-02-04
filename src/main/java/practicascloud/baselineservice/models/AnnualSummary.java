package practicascloud.baselineservice.models;

public class AnnualSummary {
	
	private Integer year;
	private Double initialBalance;
	private Double contribution;
	private Double returnBalance;
	private Double finalBalance;
	
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Double getInitialBalance() {
		return initialBalance;
	}
	public void setInitialBalance(Double initialBalance) {
		this.initialBalance = initialBalance;
	}
	public Double getContribution() {
		return contribution;
	}
	public void setContribution(Double contribution) {
		this.contribution = contribution;
	}
	public Double getReturnBalance() {
		return returnBalance;
	}
	public void setReturnBalance(Double returnBalance) {
		this.returnBalance = returnBalance;
	}
	public Double getFinalBalance() {
		return finalBalance;
	}
	public void setFinalBalance(Double finalBalance) {
		this.finalBalance = finalBalance;
	}
	
	
}

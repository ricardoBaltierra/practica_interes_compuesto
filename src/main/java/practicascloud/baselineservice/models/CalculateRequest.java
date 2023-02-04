package practicascloud.baselineservice.models;

public class CalculateRequest {

	private Double initialInvestment;
	private Double annualContribution;
	private Double investmentIncrease;
	private Integer investmentYears;
	private Double investmentReturn;
	
	public Double getInitialInvestment() {
		return initialInvestment;
	}
	public void setInitialInvestment(Double initialInvestment) {
		this.initialInvestment = initialInvestment;
	}
	public Double getAnnualContribution() {
		return annualContribution;
	}
	public void setAnnualContribution(Double annualContribution) {
		this.annualContribution = annualContribution;
	}
	public Double getInvestmentIncrease() {
		return investmentIncrease;
	}
	public void setInvestmentIncrease(Double investmentIncrease) {
		this.investmentIncrease = investmentIncrease;
	}
	public Integer getInvestmentYears() {
		return investmentYears;
	}
	public void setInvestmentYears(Integer investmentYears) {
		this.investmentYears = investmentYears;
	}
	public Double getInvestmentReturn() {
		return investmentReturn;
	}
	public void setInvestmentReturn(Double investmentReturn) {
		this.investmentReturn = investmentReturn;
	}	
}

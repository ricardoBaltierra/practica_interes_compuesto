package practicascloud.baselineservice.models;

import java.util.List;

public class ResumeInvestment {

	private Double investmentProfit;
	private Double finalAmount;
	private List<AnnualSummary> annualSummaries;
	
	public Double getInvestmentProfit() {
		return investmentProfit;
	}
	public void setInvestmentProfit(Double investmentProfit) {
		this.investmentProfit = investmentProfit;
	}
	public Double getFinalAmount() {
		return finalAmount;
	}
	public void setFinalAmount(Double finalAmount) {
		this.finalAmount = finalAmount;
	}
	public List<AnnualSummary> getAnnualSummaries() {
		return annualSummaries;
	}
	public void setAnnualSummaries(List<AnnualSummary> annualSummaries) {
		this.annualSummaries = annualSummaries;
	}
	
}

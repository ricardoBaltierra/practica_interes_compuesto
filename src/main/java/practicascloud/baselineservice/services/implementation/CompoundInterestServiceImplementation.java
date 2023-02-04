package practicascloud.baselineservice.services.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import practicascloud.baselineservice.models.AnnualSummary;
import practicascloud.baselineservice.models.CalculateRequest;
import practicascloud.baselineservice.models.ResumeInvestment;
import practicascloud.baselineservice.services.CompoundInterestService;

@Service
public class CompoundInterestServiceImplementation implements CompoundInterestService {

	@Override
	public ResumeInvestment calculateInvestment(CalculateRequest calculateRequest) {
		// TODO Auto-generated method stub
		ResumeInvestment resumeInvestment = new ResumeInvestment();
		List<AnnualSummary> annualSumaries = new ArrayList<>();
		AnnualSummary annualSummary = new AnnualSummary();
		
		int years = 0;
		
		while ( years < calculateRequest.getInvestmentYears().intValue()) {
			years++;
			if (years == 1) {
				annualSummary.setYear(Integer.valueOf(years));
				annualSummary.setInitialBalance(calculateRequest.getInitialInvestment());
				annualSummary.setContribution(calculateRequest.getAnnualContribution());
				annualSummary.setReturnBalance(
						Math.round(((calculateRequest.getInitialInvestment() + calculateRequest.getAnnualContribution())
								* (calculateRequest.getInvestmentReturn() / 100)) * Math.pow(10, 0)) / Math.pow(10, 0));
				annualSummary.setFinalBalance(annualSummary.getInitialBalance() + annualSummary.getContribution()
						+ annualSummary.getReturnBalance());
				annualSumaries.add(annualSummary);
			} else {
				annualSummary = new AnnualSummary();
				for (AnnualSummary ann : annualSumaries) {
					if (ann.getYear().equals(Integer.valueOf(years - 1))) {
						annualSummary.setYear(Integer.valueOf(years));
						annualSummary.setInitialBalance(ann.getFinalBalance());
						annualSummary.setContribution(Math
								.round(((ann.getContribution()
										+ (ann.getContribution())
												* (calculateRequest.getInvestmentIncrease() / 100)))
										* Math.pow(10, 0))
								/ Math.pow(10, 0));
						annualSummary.setReturnBalance(Math
								.round(((annualSummary.getInitialBalance() + annualSummary.getContribution())
										* (calculateRequest.getInvestmentReturn() / 100)) * Math.pow(10, 0))
								/ Math.pow(10, 0));
						annualSummary.setFinalBalance(annualSummary.getInitialBalance()
								+ annualSummary.getContribution() + annualSummary.getReturnBalance());
					}
				}
				annualSumaries.add(annualSummary);
			}
		}
		resumeInvestment.setInvestmentProfit(0.0);
		for (AnnualSummary ann : annualSumaries) {
			resumeInvestment.setInvestmentProfit(resumeInvestment.getInvestmentProfit() + ann.getReturnBalance());
			if (ann.getYear().equals(Integer.valueOf(years))) {
				resumeInvestment.setFinalAmount(ann.getFinalBalance());
			}
		}
		resumeInvestment.setAnnualSummaries(annualSumaries);
		return resumeInvestment;
	}

}

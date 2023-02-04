package practicascloud.baselineservice.services;

import practicascloud.baselineservice.models.CalculateRequest;
import practicascloud.baselineservice.models.ResumeInvestment;

public interface CompoundInterestService {
	
	public ResumeInvestment calculateInvestment(CalculateRequest calculateRequest);
}

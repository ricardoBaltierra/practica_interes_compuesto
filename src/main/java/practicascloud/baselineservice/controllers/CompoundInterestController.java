package practicascloud.baselineservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import practicascloud.baselineservice.models.CalculateRequest;
import practicascloud.baselineservice.models.ResumeInvestment;
import practicascloud.baselineservice.services.CompoundInterestService;

@RestController
@RequestMapping("/compundInterest")
public class CompoundInterestController {
	
	@Autowired
	CompoundInterestService service;

    @PostMapping()
    @RequestMapping("/calculate")
    public ResumeInvestment calculateCompoundInteres(@RequestBody CalculateRequest calculateRequest) {
    	ResumeInvestment var  = service.calculateInvestment(calculateRequest);
        return var;
    }
}

package com.factorypattern.src;

public class GetPlanFactory {
	
	public Plan getPlan(String scheme) {
		if ("DOMESTIC".equalsIgnoreCase(scheme)) {
			return new DomesticPlan();
		}
		else if ("CORPORATE".equalsIgnoreCase(scheme)) {
			return new CorporatePlan();
		}
		else {
			return new AnonymousPlan();
		}
		
	}
}

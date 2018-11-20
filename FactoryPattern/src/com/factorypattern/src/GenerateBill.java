package com.factorypattern.src;

public class GenerateBill {


	private void GenerateBill() {
		System.out.print("Private Constructor for removing Code Smells");
	}

	public static void main(String args[]) {
		String scheme = "CORPORATE";
		int units = 10;
		double bill ;


		GetPlanFactory getPlanFactory = new GetPlanFactory();

		Plan plan = getPlanFactory.getPlan(scheme);
		plan.setRate();
		bill = plan.calculatebill(units);
		System.out.print("Your Bill Is "+bill);

	}

}

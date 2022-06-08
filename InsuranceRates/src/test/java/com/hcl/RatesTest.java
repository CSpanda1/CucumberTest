package com.hcl;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RatesTest {
	Calculations c = new Calculations();

	@Given("Customer {string} signs up")
	public void customer_signs_up(String string) {
		c.customerName(string);
	}
	
	@When("If customer age {int} is greater than {int}, apply discount {int}")
	public void if_customer_age_is_greater_than_apply_discount(Integer int1, Integer int2, Integer int3) {
		if (int1 > int2) {
			c.addDiscount(int3);
			System.out.println("Customer's age is greater than " + int2 + ", " + int3 + "% discount applied");
		}
	}
	
	@When("If customer has no crashes {string}, apply discount {int}")
	public void if_customer_has_no_crashes_apply_discount(String string, Integer int1) {
		if (string.matches("True|true|T|t|Yes|yes|Y|y")) {
			c.addDiscount(int1);
			System.out.println("Customer has no crash history, " + int1 + "% discount applied");
		}
	}
	
	@When("If customers credit score {int} is greater than {int}, apply discount {int}")
	public void if_customers_credit_score_is_greater_than_apply_discount(Integer int1, Integer int2, Integer int3) {
		if (int1 > int2) {
			c.addDiscount(int3);
			System.out.println("Customer's credit score is higher than " + int2 + ", " + int3 + "% discount applied");
		}
	}
	@When("If customers income {int} is greater than {int}, apply discount {int}")
	public void if_customers_income_is_greater_than_apply_discount(Integer int1, Integer int2, Integer int3) {
		if (int1 > int2) {
			c.addDiscount(int3);
			System.out.println("Customer's income is higher than " + int2 + ", " + int3 + "% discount applied");
		}
	}
	@When("If customer is military {string}, apply discount {int}")
	public void if_customer_is_military_apply_discount(String string, Integer int1) {
		if (string.matches("True|true|T|t|Yes|yes|Y|y")) {
			c.addDiscount(int1);
			System.out.println("Customer is in the military, " + int1 + "% discount applied");
		}
	}
	@When("If customer is a student {string}, apply discount {int}")
	public void if_customer_is_a_student_apply_discount(String string, Integer int1) {
		if (string.matches("True|true|T|t|Yes|yes|Y|y")) {
			c.addDiscount(int1);
			System.out.println("Customer is a student, " + int1 + "% discount applied");
		}
	}
	@When("If customers vehicle is parked in a garage {string}, apply discount {int}")
	public void if_customers_vehicle_is_parked_in_a_garage_apply_discount(String string, Integer int1) {
		if (string.matches("True|true|T|t|Yes|yes|Y|y")) {
			c.addDiscount(int1);
			System.out.println("Customer parks in a garage, " + int1 + "% discount applied");
		}
	}
	@When("If customers account tenure {int} is greater than {int} year, apply discount {int}")
	public void if_customers_account_tenure_is_greater_than_year_apply_discount(Integer int1, Integer int2, Integer int3) {
		if (int1 > int2) {
			c.addDiscount(int3);
			System.out.println("Customer's tenure is longer than " + int2 + " year(s), " + int3 + "% discount applied");
		}
	}
	@When("If customers safety feature count {int} is greater than {int}, apply discount {int}")
	public void if_customers_safety_feature_count_is_greater_than_apply_discount(Integer int1, Integer int2, Integer int3) {
		if (int1 > int2) {
			c.addDiscount(int3);
			System.out.println(
					"Customer's vehicle has more than " + int2 + " safety features, " + int3 + "% discount applied");
		}
	}
	@When("If customer signed up for payment autodraft {string}, apply discount {int}")
	public void if_customer_signed_up_for_payment_autodraft_apply_discount(String string, Integer int1) {
		if (string.matches("True|true|T|t|Yes|yes|Y|y")) {
			c.addDiscount(int1);
			System.out.println("Customer signed up for payment autodraft, " + int1 + "% discount applied");
		}
	}
	@When("If customer bundles additional policies {string}, apply discount {int}")
	public void if_customer_bundles_additional_policies_apply_discount(String string, Integer int1) {
		if (string.matches("True|true|T|t|Yes|yes|Y|y")) {
			c.addDiscount(int1);
			System.out.println("Customer chose to bundle additional policies, " + int1 + "% discount applied");
		}
	}
	@When("If customers yearly mileage {int} is less than {int} miles per year, apply discount {int}")
	public void if_customers_yearly_mileage_is_less_than_miles_per_year_apply_discount(Integer int1, Integer int2, Integer int3) {
		if (int1 < int2) {
			c.addDiscount(int3);
			System.out.println("Customer's yearly milage is less than " + int2 + ", " + int3 + "% discount applied");
		}
	}
	@When("If customer does not have a lien {string} on the vehicle, apply discount {int}")
	public void if_customer_does_not_have_a_lien_on_the_vehicle_apply_discount(String string, Integer int1) {
		if (string.matches("False|false|F|f|No|no|N|n")) {
			c.addDiscount(int1);
			System.out.println("Customer does not have a lien on the vehicle, " + int1 + "% discount applied");
		}
	}
	@When("If customers total vehicle mileage {int} is less than {int} miles, apply discount {int}")
	public void if_customers_total_vehicle_mileage_is_less_than_miles_apply_discount(Integer int1, Integer int2, Integer int3) {
		if (int1 < int2) {
			c.addDiscount(int3);
			System.out.println("Customer's total milage is less than " + int2 + ", " + int3 + "% discount applied");
		}
	}
	@When("If customers vehicle is electric {string}, apply discount {int}")
	public void if_customers_vehicle_is_electric_apply_discount(String string, Integer int1) {
		if (string.matches("True|true|T|t|Yes|yes|Y|y")) {
			c.addDiscount(int1);
			System.out.println("Customer has an electric vehicle, " + int1 + "% discount applied");
		}
	}
	@Then("Display total discount")
	public void display_total_discount() {
		c.getFinalDetails();
	}

}

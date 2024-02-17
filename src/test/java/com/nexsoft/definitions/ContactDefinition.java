package com.nexsoft.definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactDefinition {
	
	@Before
	public void init() {
		
	}
	
	@Given("User at Main Activity")
	public void iniGiven() {
		
	}
	
	@When("User tap add button") //"^User memasukan uname (.*)$"
	public void iniWhen() {
		
	}

	@And("User tap create new event button")  //"^User memasukan pass (.*)$"
	public void iniAndKesatu() {
		
	}
	
	@And("User go to New Event Activity")
	public void iniAndKedua() {
		
	}
	
	@And("^User input (.*) and (.*)$")
	public void iniAndKetiga(String eventName, String eventPlace) {
		
	}
	
	@And("^User input (.*) and (.*)$")
	public void iniAndKeempat(String companies, String phone) {
		
	}
	
	@And("User choose encounter type and prevention type")
	public void iniAndKelima() {
		
	}
	
	@And("^User input (.*)$")
	public void iniAndKeenam(String notes) {
		
	}
	
	@Then("User save new event")
	public void iniThen() {
		
	}
	
	@And("User back to Main Activity")
	public void iniAndTerakhir() {
		
	}
	
}

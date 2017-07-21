package com.test.stepdef;

import com.test.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WebStepDef {

	@Given("^a member login to the XPlan application with \"([^\"]*)\"$")
	public void loginToApplication(String user) {
		LoginPage loginPage = new LoginPage();
		loginPage.launchApplication();
		loginPage.loginToApplication();
	}

	@Given("^verify a member has client with assets$")
	public void verifyClientWithAssets() {

	}

	@Given("^verify a member has client with plans linked to portfolio accounts$")
	public void verifyPlanLinkedToPortfolio() {

	}

	@When("^a member navigates to assets table/section in client focus page$")
	public void navigateToAsset() {

	}

	@Then("^verify a member navigated to assets table/section$")
	public void verifyNavigationToAssetTable() {

	}

	@Then("^verify exchange rate data is not displayed$")
	public void verifyExchangeRateDataNotDsiplayed() {

	}

	@Given("^verify a member has client with plans not linked to portfolio accounts$")
	public void verifyClientlinkWithPortfolio() {

	}

	@Then("^verify exchange rate data is displayed$")
	public void verifyExchangeRateDataDisplayed() {

	}

}

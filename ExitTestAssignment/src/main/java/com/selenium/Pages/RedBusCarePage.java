package com.selenium.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RedBusCarePage {
	WebDriver driver;

	// using Pagefactory concept
	public RedBusCarePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	// -----------------------Here we are declaring the locator for each test cases-----------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"offer_container\"]/li[2]/span")
	public WebElement Care;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'200')]")
	public WebElement Amount;

	@FindBy(how = How.XPATH, using = "//body/div[@id='reactContentMount']/div[1]/div[2]/div[2]/div[7]/div[1]/span[2]/input[1]")
	public WebElement Name;

	@FindBy(how = How.XPATH, using = "//body/div[@id='reactContentMount']/div[1]/div[2]/div[2]/div[7]/div[2]/span[2]/input[1]")
	public WebElement Email;

	@FindBy(how = How.XPATH, using = "//body/div[@id='reactContentMount']/div[1]/div[2]/div[2]/div[7]/div[3]/span[2]/input[1]")
	public WebElement PhoneNo;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'DONATE NOW')]")
	public WebElement Submit;

	// Method for Click On RedBus Care
	public void ClickCare() {
		Care.click();
	}

	// Method for Select the Particular Amount
	public void SelectAmount() {
		Amount.click();
	}

	// Method for Entering User Detail
	public void EnterDetail(String UserName, String Emails, String Number) {
		Name.sendKeys(UserName);
		Email.sendKeys(Emails);
		PhoneNo.sendKeys(Number);
		Submit.click();

	}

}

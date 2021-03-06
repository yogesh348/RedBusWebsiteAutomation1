package com.selenium.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BusHirePage {
	WebDriver driver;

	// using Pagefactory concept
	public BusHirePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	//------------------------Here we are declaring the locator for Outstation And Local  journey Type----------------
	@FindBy(how = How.XPATH, using = " //a[@id='redBus Bus Hire']")
	public WebElement BusHire;

	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div[4]/div[1]/div[1]/div[1]")
	public WebElement Outstation;

	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div[4]/div[2]")
	public WebElement Local;

	@FindBy(how = How.ID, using = "locationTextFieldLocal")
	public WebElement Source;

	@FindBy(how = How.XPATH, using = "//span[@class='searchText']")
	public WebElement SelectSource;

//	@FindBy(how = How.XPATH, using = "//body/ul[@id='ui-id-3']/li[@id='ui-id-76']/div[1]/span[@class='searchText']")
//	public WebElement SelectDestination;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Gorakhpur Railway Station')]")
	public WebElement SelectDestination;

	@FindBy(how = How.XPATH, using = "//input[@id='local_dest_name']")
	public WebElement Destination;

	@FindBy(how = How.ID, using = "numberOfPax")
	public WebElement MaxNo;

	@FindBy(how = How.XPATH, using = "//div[@id='OSLeadGen_DoJStart']")
	public WebElement FromWhen;

	@FindBy(how = How.XPATH, using = "//*[@id=\"LocalLeadGen_DateOfPickup_Click\"]")
	public WebElement StartingTime;

	@FindBy(how = How.XPATH, using = "//div[@id='OSLeadGen_DoJEnd']")
	public WebElement TillWhen;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'OK')]")
	public WebElement Ok;

	@FindBy(how = How.XPATH, using = "/html/body/div[5]/div[3]/div/div[1]/div/div[3]/div[2]/div/div[5]/div[7]/button/span[1]/p")
	public WebElement Date;

	@FindBy(how = How.XPATH, using = "//button[@id='proceedButtonOutstation']")
	public WebElement ProceedButton;

	@FindBy(how = How.XPATH, using = "//button[@id='proceedButtonLocal']")
	public WebElement Proceed;

	@FindBy(how = How.XPATH, using = "/html/body/div[5]/div[3]/div/div[1]/div/div[4]/div[1]/div[1]/button[2]/span[1]")
	public WebElement ChangeDate;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'24')]")
	public WebElement FromWhenDate;

	//Method for Click on BusHire
	public void ClickRedBus() {
		BusHire.click();
	}

	//Method for Click on Outstation Journey Type
	public void ClickOutstation() throws InterruptedException {
		driver.switchTo().frame(driver.findElement(By.tagName("Object")));
		Outstation.click();
		Thread.sleep(5000);
	}

	//Method for Click on Local Journey Type
	public void clickLocal() throws InterruptedException {
		driver.switchTo().frame(driver.findElement(By.tagName("Object")));
		Local.click();
		Thread.sleep(5000);
	}

	//Method for Enter Source Location
	public void EnterSource(String src) {
		Source.sendKeys(src);
		SelectSource.click();
	}

	//Method for Enter Source for local Journey type
	public void EnterLocalSource(String src) {
		Source.sendKeys(src);
		SelectSource.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
	}

	//Method for Enter Destination Source
	public void EnterDestination(String Destination1) {
		Destination.sendKeys(Destination1);
//		Select s = new Select(SelectDestination);
		SelectDestination.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
	}

	//Method for Select TillDate
	public void ClickTillDate() {
		TillWhen.click();
		Date.click();
		Ok.click();
	}

	//Method for Select FromDate
	public void ClickFromDate() {
		Actions a = new Actions(driver);
		// scroll down a page
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		FromWhen.click();
		FromWhenDate.click();
		Ok.click();
	}

	//Method for Select  WhenDate
	public void ClickWhenDate() {
		Actions a = new Actions(driver);
		// scroll down a page
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		StartingTime.click();
		Date.click();
		Ok.click();
	}

	//Method for Enter the no pf Passenger 
	public void EnterMaxPassenger(String Passenger) {
		MaxNo.sendKeys(Passenger);
	}

	//Method for Click on Journey Type Proceed
	public void ClickProceed() {
		ProceedButton.click();
	}

	//Method for Click on Local Type Proceed
	public void ClickLocalProceed() {
		Proceed.click();
	}

	//------------------------Here we are declaring the locator for AirPot  journey Type----------------
	@FindBy(how = How.XPATH, using = "//input[@id='locationTextFieldLocal']")
	public WebElement AirPotDestination;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'gorakhpur')]")
	public WebElement SearchDestination;

	@FindBy(how = How.XPATH, using = "//div[@id='AirporLeadGen_SelectCity']")
	public WebElement SelectCity;

	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div[4]/div[3]")
	public WebElement SelectAirPot;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Bangalore')]")
	public WebElement City;

	@FindBy(how = How.XPATH, using = "//div[@id='AirporLeadGen_DoJ']")
	public WebElement AirpotDate;

	@FindBy(how = How.XPATH, using = "//button[@id='proceedButtonAirport']")
	public WebElement proceedButtonAirport;

	//Method for Click on AirPot Journey Type
	public void ClickAirPot() throws InterruptedException {
		driver.switchTo().frame(driver.findElement(By.tagName("Object")));
		SelectAirPot.click();
		Thread.sleep(5000);
	}

	//Method for Select Source City
	public void SelectCity(String Dest) {
		SelectCity.click();
		City.click();
		AirPotDestination.sendKeys(Dest);
		SearchDestination.click();
	}

	//Method for Select the Desination Date
	public void EnterDate() {
		Actions a = new Actions(driver);
		// scroll down a page
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		AirpotDate.click();
		Date.click();
		Ok.click();
	}

	//Method for Click on AirPot Proceed
	public void ClickAirPotProceed() {
		proceedButtonAirport.click();
	}
}

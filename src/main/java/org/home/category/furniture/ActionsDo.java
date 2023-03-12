package org.home.category.furniture;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActionsDo {

	WebDriver chromedriver;

	public ActionsDo(WebDriver chromedriver) {
		this.chromedriver = chromedriver;
		PageFactory.initElements(chromedriver, this);
	}

	@FindBy(xpath = "//span[@data-cy ='handleSnackbarClose']")
	private WebElement downloadAppToast;

	@FindBy(xpath = "//ul[@class ='makeFlex font12']")
	private WebElement Links;

	@FindBy(xpath = "//li[@data-cy = \"mulitiCityTrip\"]")
	private WebElement multiTrip;

	@FindBy(xpath = "//label[@for=\"fromAnotherCity0\"]")
	private WebElement cityFrom1;

	@FindBy(xpath = "//input[@aria-autocomplete = \"list\"]")
	private WebElement optionsCityFrom1;

	@FindBy(xpath = "//p[text() =\"Jaipur, India\"]")
	private WebElement cityFromDone1;

	@FindBy(xpath = "//input[@aria-autocomplete =\"list\"]")
	private WebElement optionsCityTo1;

	@FindBy(xpath = "//p[text() =\"Dehradun, India\"]")
	private WebElement cityTo1;

	@FindBy(xpath = "//div[@aria-label =\"Mon Mar 13 2023\"]")
	private WebElement choiceDateGoing;

	@FindBy(xpath = "//label[@for =\"anotherDeparture 1\"]")
	private WebElement comingDate;
	@FindBy(xpath = "//div[@aria-label=\"Mon Mar 20 2023\"]")
	private WebElement choiceDateComing;

	@FindBy(xpath = "//p[text() =\"Armed Forces \"]")
	private WebElement armedForce;

	@FindBy(xpath = "//a[text() = \"Search\"]")
	private WebElement selectFight;

	public void cutAppToast() {
		downloadAppToast.click();
	}

	public void selectMultitrip() {
		multiTrip.click();
	}

	public void selectCityFrom() {
		cityFrom1.click();
	}

	public void typeCityFrom1(String name) {
		optionsCityFrom1.sendKeys(name);
	}

	public void clickChoiceCityFrom1() {
		cityFromDone1.click();
	}

	public void typeCityTo1(String name) {
		optionsCityTo1.sendKeys(name);
	}

	public void clickChoiceCityTo1() {
		cityTo1.click();
	}

	public void clickDateGoing() {
		choiceDateGoing.click();
	}

	public void selectComingDate() {
		comingDate.click();
	}

	public void clickDateComing() {
		choiceDateComing.click();
	}

	public void choiceArmedForce() {
		armedForce.click();
	}

	public void clickSelect() {
		selectFight.click();
	}
}

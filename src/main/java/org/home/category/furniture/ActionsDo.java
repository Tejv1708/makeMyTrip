package org.home.category.furniture;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActionsDo {

	WebDriver chromedriver ; 
	public ActionsDo(WebDriver chromedriver){
		this.chromedriver = chromedriver ;
		PageFactory.initElements(chromedriver, this);
	}
	
	@FindBy(xpath ="//span[@data-cy ='handleSnackbarClose']")
	private WebElement downloadAppToast ;
	
	@FindBy(xpath = "//ul[@class ='makeFlex font12']")
	private WebElement Links ;
	
	
	public void cutAppToast() {
		downloadAppToast.click();
	}
	
	public void countLinks() {
		List<WebElement> links = Links.findElements(By.tagName("a"));
		System.out.println(links.size());
	}
}

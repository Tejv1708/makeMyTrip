package org.home.category.furniture;

import org.testng.annotations.Test;

public class BaseClass extends Configration {

	@Test
	public void someActions() throws InterruptedException {
		ActionsDo makeActions = new ActionsDo(chromedriver) ;
		makeActions.cutAppToast();
		makeActions.selectMultitrip();
		makeActions.selectCityFrom();
		makeActions.typeCityFrom1("Jaipur");
		makeActions.clickChoiceCityFrom1();
		makeActions.typeCityTo1("Dehradun");
		makeActions.clickChoiceCityTo1();
		makeActions.clickDateGoing();
		makeActions.selectComingDate();
		makeActions.clickDateComing();
		makeActions.choiceArmedForce();
		makeActions. clickSelect();
		Thread.sleep(3000);
	}
}

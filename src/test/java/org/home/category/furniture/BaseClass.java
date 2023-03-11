package org.home.category.furniture;

import org.testng.annotations.Test;

public class BaseClass extends Configration {

	@Test
	public void someActions() throws InterruptedException {
		ActionsDo makeActions = new ActionsDo(chromedriver) ;
		makeActions.cutAppToast();
		makeActions.countLinks();
		Thread.sleep(3000);
	}
}

package com.rotunda.app;

import org.testng.Assert;
import org.testng.annotations.Test;
import static com.codeborne.selenide.CollectionCondition.size;

public class googleHomeIT {
	
	
	final String TERMS_PAGE_URL = "https://policies.google.com/terms?hl=en&fg=1";

	@Test(priority = 1)
	public void pageImFeelingLuckyButton() {
		Assert.assertEquals(GoogleHome.imFeelingLuckyButtonExists(), true);
	}
	
	@Test(priority = 2)
	public void userCanSearchKeywordWithGoogle() {
		GoogleResult googleResult; 
		GoogleHome.SINGLETON.setSearch("Rotunda Solutions");
		googleResult = GoogleHome.SINGLETON.clickSearchButton();
		googleResult.getResultList().shouldHave(size(10));
		GoogleHome.visitPage();
	}
	
	  
	@Test(priority = 2)
	public void userCanGoToTermsPage() {
		GoogleTerms googleTerms;
		googleTerms = GoogleHome.SINGLETON.clickTermsButton();

		String currentUrl = googleTerms.getPageUrl();
		Assert.assertEquals(currentUrl, TERMS_PAGE_URL);
		GoogleHome.visitPage();
	}
}

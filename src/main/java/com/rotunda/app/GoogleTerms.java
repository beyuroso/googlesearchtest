package com.rotunda.app;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

public class GoogleTerms {
	SelenideElement pageElement;

	public GoogleTerms() {
		
	}
	
	public static GoogleTerms fromHomeFooter() {
		GoogleTerms termsPage = new GoogleTerms();
		return termsPage;
	}
	
	public String getPageUrl() {
		return WebDriverRunner.getWebDriver().getCurrentUrl();
	}
}

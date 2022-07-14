package com.rotunda.app;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

public class GoogleHome {
	SelenideElement searchValue;
	
	public GoogleHome() {
		
	}
	 
	public void openGoogleHome() {
		open("http://google.com");
	}
	
	public void setSearch() {
		searchValue = $(By.name("q")).setValue("Rotunda Solutions");
	}
	
	public GoogleResult clickSearchButton() {
		searchValue.pressEnter();
		return GoogleResult.fromSearch();
	}
	
	public GoogleTerms clickTermsButton() {
		$$(By.className("pHiOh")).findBy(text("Terms")).pressEnter();
		GoogleTerms result = GoogleTerms.fromHomeFooter();
		return result;
	}
}

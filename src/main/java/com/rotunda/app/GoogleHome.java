package com.rotunda.app;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import com.codeborne.selenide.SelenideElement;

import org.openqa.selenium.By;

public class GoogleHome {
	public static final GoogleHome SINGLETON = new GoogleHome();
	SelenideElement searchValue;
	
	private static final String SEARCH_BAR_CSS_SELECT = "q";
	private static final String IM_FEELING_LUCKY_CSS_SELECT = "#gbqfbb";
	
	private GoogleHome() {
		open("http://google.com");
	}

	public void setSearch(String searchString) {
		searchValue = $(By.name(SEARCH_BAR_CSS_SELECT)).setValue(searchString);
	}
	
	public static void visitPage() {
		open("http://google.com");
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
	
	public static boolean imFeelingLuckyButtonExists() {
		return $(IM_FEELING_LUCKY_CSS_SELECT).exists();
	}
}

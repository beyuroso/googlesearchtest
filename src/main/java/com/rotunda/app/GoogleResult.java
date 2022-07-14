package com.rotunda.app;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ElementsCollection;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;

public class GoogleResult {
	SelenideElement pageElement;
	ElementsCollection listOfResultElements;
	
	public GoogleResult() {
		pageElement = null;
	}
	
	public static GoogleResult fromSearch() {
		GoogleResult result = new GoogleResult();
		return result; 
	}
	
	public void setResultList() {
		listOfResultElements = $$("#rso div.g");
	}
	
	public void verifyResultListSize() {
		listOfResultElements.shouldHave(size(10));
	}
	
	public void verifyFirstResult() {
		$("#rso div.g").shouldHave(text("Rotunda Solutions | Rotunda Solutions"));
	}
}

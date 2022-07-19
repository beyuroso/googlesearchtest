package com.rotunda.app;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ElementsCollection;
import static com.codeborne.selenide.Selenide.$$;

public class GoogleResult {
	SelenideElement pageElement;
	ElementsCollection listOfResultElements;
	public GoogleResult() {
		pageElement = null;
		setResultList();
	}
	
	public static GoogleResult fromSearch() {
		GoogleResult result = new GoogleResult();
		return result; 
	}
	
	public void setResultList() {
		listOfResultElements = $$("#rso div.g");
	}
	
	public ElementsCollection getResultList() {
		return listOfResultElements;
	}
}

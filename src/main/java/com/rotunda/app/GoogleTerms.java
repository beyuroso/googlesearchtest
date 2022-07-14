package com.rotunda.app;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.SelenideElement;

import org.openqa.selenium.By;

public class GoogleTerms {
	SelenideElement pageElement;

	public GoogleTerms() {
		
	}
	
	public static GoogleTerms fromHomeFooter() {
		GoogleTerms termsPage = new GoogleTerms();
		return termsPage;
	}
	
	public void verifyIsTermsPage() {
		$(By.className("IzKDNd")).shouldHave(text("What’s covered in these terms"));
	}
}

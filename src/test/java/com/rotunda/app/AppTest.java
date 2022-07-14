package com.rotunda.app;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;

public class AppTest {

  @Test
  public void userCanSearchKeywordWithGoogle() {
	  
	  open("http://google.com");
	  
	  // "q" is the name of the input field on google hompage
	  $(By.name("q")).setValue("Rotunda Solutions").pressEnter();
	  
	  // Using css selector to get relevant elements
	  $$("#rso div.g").shouldHave(size(10));
	  
	  
	  // Confirm that first result displays proper text.
	  $("#rso div.g").shouldHave(text("Rotunda Solutions | Rotunda Solutions"));
  }
  
  @Test
  public void userCanGoToTermsPage() {
	  open("http://google.com");
	  
	  $$(By.className("pHiOh")).findBy(text("Terms")).click();
	  
	  $(By.className("IzKDNd")).shouldHave(text("What’s covered in these terms"));
	  
  }
}

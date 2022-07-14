package com.rotunda.app;

import org.testng.annotations.Test;

public class AppTest {

  @Test
  public void userCanSearchKeywordWithGoogle() {
	  
	  GoogleHome googleHome = new GoogleHome();
	  GoogleResult googleResult;
	  
	  googleHome.openGoogleHome(); 
	  googleHome.setSearch();
	  googleResult = googleHome.clickSearchButton();
	  googleResult.setResultList();
	  googleResult.verifyResultListSize();
	  googleResult.verifyFirstResult();
  }
  
  @Test
  public void userCanGoToTermsPage() {
	  
	  GoogleHome googleHome = new GoogleHome();
	  GoogleTerms googleTerms;
	  googleHome.openGoogleHome();
	  googleTerms = googleHome.clickTermsButton();
	  googleTerms.verifyIsTermsPage();
	  
  }
}

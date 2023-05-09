package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.customlisteners.CustomListeners;
import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class TopMenuTest extends BaseTest {
  HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){

        homePage = new HomePage();
    }
    @Test(groups={"sanity","regression"})
    public void verifyPageNavigation() {
        homePage.selectMenu("computer");

    }

}

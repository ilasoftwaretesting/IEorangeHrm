package org.example;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class MyStepDef extends BasePage {
    LoginPage loginpage = new LoginPage();

    @When("^I enter username \"([^\"]*)\"$")
    public void i_enter_username(String username) {
        loginpage.enterUsername(username);

    }

    @When("^I enter password \"([^\"]*)\"$")
    public void i_enter_password(String password) {
        loginpage.enterPassword(password);

    }

    @When("^I click on login button$")
    public void i_click_on_login_button() {
        loginpage.clickonloginButton();
    }

    @Then("^I am not able to log in successfully and  i should see error \"([^\"]*)\"$")
    public void i_am_not_able_to_log_in_successfully_and_i_should_see_error(String errormessage) {
        Assert.assertEquals(driver.findElement(By.id("spanMessage")).getText(),errormessage);
        System.out.println("error message should be display successfully");
    }


}

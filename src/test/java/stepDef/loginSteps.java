package stepDef;

import base.config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class loginSteps extends config {
    @Given("user in Amazon Homepage")
    public void userInAmazonHomepage() {
    }
    @And("user click on Account & list section")
    public void userClickOnAccountListSection() {
        driver.findElement(By.id("nav-link-accountList")).click();
    }
    @And("user enter valid email address")
    public void userEnterValidEmailAddress() {
        driver.findElement(By.name("email")).sendKeys(PERSONAL_EMAIL);
    }

    @And("user click on continue button")
    public void userClickOnContinueButton() { 
            driver.findElement(By.id("continue")).click();
    }

    @And("user enter valid password")
    public void userEnterValidPassword() {
        driver.findElement(By.name("email")).sendKeys(PERSONAL_PASSWORD);
    }

    @When("user clicks on Sign in button")
    public void userClicksOnSignInButton() {  
        driver.findElement(By.id("signInSubmit")).click();
    }

    @Then("the user should be able to login successfully")
    public void theUserShouldBeAbleToLoginSuccessfully() {
        String expText = "Hello, Umme";
        String developerCodeExp = driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText();
        Assert.assertEquals(expText, developerCodeExp);
    }
}

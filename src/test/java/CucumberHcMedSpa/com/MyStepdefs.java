package CucumberHcMedSpa.com;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

/**
 * Created by DIPAK on 4/25/2017.
 */
public class MyStepdefs extends BaseTest
{
    @Given("^user already on homepage$")
    public void userAlreadyOnHomepage() {
    openBrowser();
    }
    @When("^I click on Beauty$")
    public void I_click_on_Beauty() {
    Utiles.mouseHover(By.xpath("//a[contains(text(),'Beauty')]"));
    }

    @Then("^I see beauty treatment list$")
    public void I_see_beauty_treatment_list() {
    Utiles.assertByGetText(By.xpath("//li[@id='menu-item-205']/span"),"Beauty Treatments","user not in beauty treatment list");
    }

    @When("^I click on threading treatment$")
    public void I_click_on_threading_treatment() {
    driver.findElement(By.xpath("//a[contains(text(),'Threading')]")).click();
    }

    @Then("^I see threading price$")
    public void I_see_threading_price() {
    assertByGetText(By.xpath("//h2[@class='border-xs']"),"PRICING","user not on pricing page");
    }

    @Then("^I enter fullname$")
    public void I_enter_fullname() {
    typeText(By.xpath("//div[2]/span/input"),"Raj");
    }

    @Then("^I enter telephone number$")
    public void I_enter_telephone_number() {
        typeText(By.xpath("//input[@name='phone']"),"07924853135");

    }

    @Then("^I enter email address$")
    public void I_enter_email_address() {
   typeText(By.xpath("//input[@name='email']"),"raj"+dateStamp()+"Malhotra@yahoo.com");
    }

    @When("^I select threading treatment$")
    public void I_select_threading_treatment() {
    selectValue(By.xpath("(//select[@name='treatment'])[2]"),"Threading");
    }

    @When("^when I slecte prefered clinic$")
    public void when_I_slecte_prefered_clinic() {
     selectValue(By.xpath("//select[@name='clinic']"),"Mill Hill");
    }

    @When("^I click on submit$")
    public void I_click_on_submit() {
        // Create instance of Javascript executor
        JavascriptExecutor je = (JavascriptExecutor) driver;
       //Identify the WebElement which will appear after scrolling down
        WebElement element = driver.findElement(By.xpath("//input[@name='phone']"));
       // now execute query which actually will scroll until that element is not appeared on page.
        je.executeScript("arguments[0].scrollIntoView(true);",element);

        clickOnElement(By.xpath("//div[7]/input"));
    }

    @Then("^I see booking done sucessfully$")
    public void I_see_booking_done_sucessfully() {
    assertByGetText(By.xpath("//h1[contains(text(),'Thank you')]"),"Thank you","Booking not done");
    }
}


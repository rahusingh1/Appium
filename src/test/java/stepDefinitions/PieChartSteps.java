package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utilities.GenericKeywords;
import utilities.ObjectRepository;

public class PieChartSteps extends GenericKeywords {

    @Given("I launch the application")
    public void app_launch() throws Throwable {
        executeDriver();
    }

    @Then("user is on home page")
    public void userIsOnHomePage(){
        WebElement element = getElement(ObjectRepository.wlcm);
        Assert.assertTrue("The element should be displayed", element.isDisplayed());
        Assert.assertEquals("Welcome!", element.getText());
    }

	@And("user opens menu list")
	public void userOpensMenuList(){
        getElement(ObjectRepository.menu_btn).click();
	}

	@When("Click on chart option to open it")
	public void open_chart(){
        getElement(ObjectRepository.chart_btn).click();
	}

	@And("Click on pie chart")
	public void click_pieChart(){
        getElement(ObjectRepository.pie_btn).click();
	}

    @Then("I verify the bar title of pie chart")
    public void verifyBarTitle() {
        WebElement element = getElement(ObjectRepository.pie_bar_title);
        Assert.assertTrue("The element should be displayed", element.isDisplayed());
        Assert.assertEquals("Pie Chart", element.getText());
    }
}
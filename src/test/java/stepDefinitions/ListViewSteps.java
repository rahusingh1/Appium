package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utilities.GenericKeywords;
import utilities.ObjectRepository;

public class ListViewSteps extends GenericKeywords {
    @Given("user opens the application")
    public void app_launch() throws Throwable {
        executeDriver();
    }

    @Then("user navigates to ListView page")
    public void userNavigatesToListViewPage() {
        getElement(ObjectRepository.listView_btn).click();
    }

    @And("user is on ListView page")
    public void userIsOnListViewPage() {
        WebElement element = getElement(ObjectRepository.listView_title);
        Assert.assertEquals("ListView", element.getText());
    }

    @When("user clicks on Searchable ListView button")
    public void userClicksOnSearchableListViewButton() {
        getElement(ObjectRepository.searchableListView_btn).click();
    }

    @And("user enter <country> name")
    public void userEnterCountryName() {
        getElement(ObjectRepository.inputCountry).sendKeys("India");
    }

    @Then("user check the searched result")
    public void userCheckTheSearchedResult() {
        WebElement element = getElement(ObjectRepository.india);
        Assert.assertTrue("The element should be displayed", element.isDisplayed());
        Assert.assertEquals("India", element.getText());
    }

    @When("user clicks on Pull To Refresh button")
    public void userClicksOnPullToRefreshButton() {
        getElement(ObjectRepository.pull2Refresh_btn).click();
    }

    @And("User pull to refresh the list on the page")
    public void userPullToRefreshTheListOnThePage() {
        pullToRefresh();
    }

    @Then("user check the NEW ITEM ADDED text")
    public void userCheckTheNEWITEMADDEDText() {
        WebElement element = getElement(ObjectRepository.newItem);
        Assert.assertTrue("The element should be displayed", element.isDisplayed());
        Assert.assertEquals("NEW ITEM ADDED", element.getText());
    }
}

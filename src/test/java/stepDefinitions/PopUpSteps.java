package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utilities.GenericKeywords;
import utilities.ObjectRepository;

public class PopUpSteps extends GenericKeywords {

    @And("user navigates to pop up screen")
    public void userNavigatesToPopUpScreen() {
        getElement(ObjectRepository.popUp_btn).click();
    }

    @Then("user is on popUp screen")
    public void userIsOnPopUpScreen() {
        WebElement element = getElement(ObjectRepository.popUp_title);
        Assert.assertEquals("PopUp", element.getText());
    }


    @And("user clicks on popUp Menu button")
    public void userClicksOnPopUpMenuButton() {
        getElement(ObjectRepository.popUpMenu_btn).click();
    }

    @And("user clicks on show popUp Menu button")
    public void userClicksOnShowPopUpMenuButton() {
        getElement(ObjectRepository.showPopUpMenu_btn).click();
    }

    @Then("user checks the popUp menu action buttons")
    public void userChecksThePopUpMenuActionButtons() {
        WebElement play = getElement(ObjectRepository.play_btn);
        Assert.assertEquals("Play", play.getText());
        WebElement addPlaylist = getElement(ObjectRepository.addToPlaylist_btn);
        Assert.assertEquals("Add to Playlist", addPlaylist.getText());
        WebElement search = getElement(ObjectRepository.search_btn);
        Assert.assertEquals("Search", search.getText());

    }
}

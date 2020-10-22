package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import screens.BasketPageScreen;

public class BasketPageStep {

    BasketPageScreen basketPageScreen = new BasketPageScreen();

    @And("i click BasketPage : Order")
    public void iClickBasketPageOrder() {
        basketPageScreen.iClickBasketPageOrder();
    }

    @Then("i click BasketPage : Popup : ContinueWithoutMember")
    public void iClickBasketPagePopupContinueWithoutMember() {
        basketPageScreen.iClickBasketPagePopupContinueWithoutMember();
    }

    @And("i select the BasketPage : Popup  : Address")
    public void iSelectTheBasketPagePopupAddress() {
        basketPageScreen.iSelectTheBasketPagePopupAddress();

    }

    @And("i click BasketPage : Popup : Save")
    public void iClickBasketPagePopupSave() {
        basketPageScreen.iClickBasketPagePopupSave();

    }

    @And("i click BasketPage : Popup : ContinueSelectedAddress")
    public void iClickBasketPagePopupContinueSelectedAddress() {
        basketPageScreen.iClickBasketPagePopupContinueSelectedAddress();
    }
}

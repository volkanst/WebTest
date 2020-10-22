package steps;

import io.cucumber.java.en.Then;
import screens.BasketScreen;

public class BasketStep {

    BasketScreen basketScreen = new BasketScreen();

    @Then("i click Basket : GoToBasketPage")
    public void iClickBasketGoToBasketPage() throws InterruptedException {
        basketScreen.iClickBasketGoToBasketPage();

    }
}

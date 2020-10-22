package steps;

import io.cucumber.java.en.And;
import screens.RandomCampPageScreen;

public class RandomCampPageStep {

    RandomCampPageScreen randomCampPageScreen = new RandomCampPageScreen();

    @And("i click RandomCampaign : AddToBasket")
    public void iClickRandomCampaignAddToBasket() throws InterruptedException {
        randomCampPageScreen.iClickRandomCampaignAddToBasket();

    }
}

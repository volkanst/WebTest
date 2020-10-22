package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import screens.BasePageScreen;

public class BasePageStep {

    BasePageScreen basePageScreen = new BasePageScreen();

    @When("i am on the BasePage {string}")
    public void iAmOnTheBasePage(String url) {
        basePageScreen.iAmOnTheBasePage(url);
    }

    @And("i chosee BasePage : ServiceType : HomeDelivery : Region")
    public void iChoseeBasePageServiceTypeHomeDeliveryRegion() throws InterruptedException {
        basePageScreen.iChoseeBasePageServiceTypeHomeDeliveryRegion();
    }


    @And("i click BasePage : AllCampaigns")
    public void iClickBasePageAllCampaigns() {
        basePageScreen.iClickBasePageAllCampaigns();

    }


}

package steps;

import io.cucumber.java.en.And;
import screens.AllCampPageScreen;

public class AllCampStep {

    AllCampPageScreen allCampPageScreen = new AllCampPageScreen();

    @And("i click AllCampaigns : RandomCampaign")
    public void iClickAllCampaignsRandomCampaign() {
        allCampPageScreen.iClickAllCampaignsRandomCampaign();

    }
}

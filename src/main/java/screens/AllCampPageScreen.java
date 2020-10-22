package screens;

import org.junit.Assert;
import org.openqa.selenium.By;

public class AllCampPageScreen extends Base {

    private static final By RANDOM_CAMP_BTN_ID = By.id("DPE_TR_CAMPAIGNS_TAB0_CARD5");

    public void iClickAllCampaignsRandomCampaign() {
        Assert.assertTrue("Aradığınız Kampanya Bulunamadı.",isElementPresent(RANDOM_CAMP_BTN_ID));
        scroll(RANDOM_CAMP_BTN_ID);
        waitAndClick(RANDOM_CAMP_BTN_ID);
    }
}

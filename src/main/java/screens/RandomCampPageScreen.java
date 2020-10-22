package screens;

import org.junit.Assert;
import org.openqa.selenium.By;

public class RandomCampPageScreen extends Base{

    private static final By CLOSE_EXTRAS_POPUP_ID = By.xpath("//*[@class='ins-close-button ins-pointer-cursor']");
    private static final String CONTENT_DESC_LBL_ID = "/html//div[@class='styled__ContentThumbnailsDescription-kipobh-11 dUxrJp']";
    private static final By ADD_TO_BASKET_BTN_ID = By.xpath(CONTENT_DESC_LBL_ID + "//a[@id='DPE_TR_COUPONDETAIL_BUTTON_ADDTOBASKET']");
    private static final By FAST_POPUP_ID = By.xpath("//*[@class='icon-times-dp alert__CloseButton-v13nzi-10 dmIfpJ']");

    public void iClickRandomCampaignAddToBasket() throws InterruptedException {
        Thread.sleep(3600);
        Assert.assertTrue("Sepete Ekle Butonu Bulunamadı.", isElementPresent(ADD_TO_BASKET_BTN_ID));
        waitAndClick(ADD_TO_BASKET_BTN_ID);
        Assert.assertTrue("POPUP Bulunamadı.",isElementPresent(CLOSE_EXTRAS_POPUP_ID));
        waitAndClick(CLOSE_EXTRAS_POPUP_ID);
    }
}

package screens;

import org.junit.Assert;
import org.openqa.selenium.By;

public class BasketScreen extends  Base {

    private static final By BASKET_ICON_BTN_ID = By.id("DPE_TR_HOME_BUTTON_BASKET");
    private static final By GO_TO_BASKET_BTN_ID = By.xpath("//div[@class='styled__CartTotalContianer-sc-126ws66-29 jOkfmy']//*[contains(text(),'Sepete Git')]");


    public void iClickBasketGoToBasketPage() throws InterruptedException {
        Thread.sleep(3600);
        Assert.assertTrue("Sepet Iconu Bulunamadı.",isElementPresent(BASKET_ICON_BTN_ID));
        waitAndClick(BASKET_ICON_BTN_ID);
        Assert.assertTrue("Sepete Git Butonu Bulunamadı.",isElementPresent(GO_TO_BASKET_BTN_ID));
        waitAndClick(GO_TO_BASKET_BTN_ID);
    }
}

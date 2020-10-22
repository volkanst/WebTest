package screens;

import org.junit.Assert;
import org.openqa.selenium.By;
import utils.PropertiesReader;
import utils.SeleniumDriver;

public class BasePageScreen extends Base {

    PropertiesReader propertiesReader = new PropertiesReader();
    private static String BASE_CITY_ID="//div[@id='DPE_TR_STOREFILTERFORMDELIVERY_DROPDOWN_CITY']";
    private static String BASE_COUNTY_ID="//div[@id='DPE_TR_STOREFILTERFORMDELIVERY_DROPDOWN_COUNTY']";
    private static final By HOMEDELIVERY_BTN_ID = By.xpath("//div[contains(text(),'Adrese Teslim')]");
    private static final By CITY_ID = By.xpath(BASE_CITY_ID + "//div[contains(text(),'Seçiniz...')]");
    private static final By SELECT_CITY_ID = By.xpath(BASE_CITY_ID + "//div[.=' İstanbul']");
    private static final By COUNTY_ID = By.xpath(BASE_COUNTY_ID + "//div[contains(text(),'Seçiniz...')]");
    private static final By SELECT_COUNTY_ID = By.xpath(BASE_COUNTY_ID + "//div[.=' Adalar']");
    private static final By ADDRESS_SELECT_BTN_ID = By.xpath("//*[@id='DPE_TR_STOREFILTERFORMDELIVERY_BUTTON_ADDRESSSELECT']");
    private static final By ALLCAMP_BTN_ID = By.linkText("Tüm Kampanyalar");
    private static final By CLOSE_COOKIE_BTN_ID = By.xpath("//button[@class='styled__CloseCookie-vl63gb-4 iZCykC']");



    public void iAmOnTheBasePage(String url) {
        url=propertiesReader.getBase_url();
        SeleniumDriver.openPage(url);
    }

    public void iChoseeBasePageServiceTypeHomeDeliveryRegion() throws InterruptedException {
        Assert.assertTrue("Adrese Teslim Butonu Bulunamadı.",isElementPresent(HOMEDELIVERY_BTN_ID));
        waitAndClick(HOMEDELIVERY_BTN_ID);
        clickCity();
        selectIstanbul();
        clickDistrict();
        selectAdalar();
        Thread.sleep(3600);
        Assert.assertTrue("Adres Kaydet Butonu Bulunamadı.",isElementPresent(ADDRESS_SELECT_BTN_ID));
        waitAndClick(ADDRESS_SELECT_BTN_ID);

    }



    public void iClickBasePageAllCampaigns() {
        closeCookiePol();
        Assert.assertTrue("Tüm Kampanyalar Butonu Bulunamadı.",isElementPresent(ALLCAMP_BTN_ID));
        waitAndClick(ALLCAMP_BTN_ID);
    }

    private void closeCookiePol() {
        Assert.assertTrue("Çerez Politikaları Kapatma Butonu Bulunamadı.",isElementPresent(CLOSE_COOKIE_BTN_ID));
        waitAndClick(CLOSE_COOKIE_BTN_ID);
    }

    private void clickDistrict() {
        Assert.assertTrue("İlçe Sekmesi Tıklanamadı.",isElementPresent(COUNTY_ID));
        waitAndClick(COUNTY_ID);
    }

    private void clickCity() {
        Assert.assertTrue("İl Sekmesi Tıklanamadı.",isElementPresent(CITY_ID));
        waitAndClick(CITY_ID);
    }


    private void selectIstanbul() {
        Assert.assertTrue("İstanbul Seçeneği Bulunamadı.",isElementPresent(SELECT_CITY_ID));
        waitAndClick(SELECT_CITY_ID);
    }

    private void selectAdalar() {
        Assert.assertTrue("Adalar Seçeneği Bulunamadı.",isElementPresent(SELECT_COUNTY_ID));
        waitAndClick(SELECT_COUNTY_ID);
    }
}

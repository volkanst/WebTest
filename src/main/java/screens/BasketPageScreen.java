package screens;

import org.junit.Assert;
import org.openqa.selenium.By;

public class BasketPageScreen extends Base{
   
    private static final By ORDER_BTN_ID = By.id("DPE_TR_BASKET_BUTTON_ORDER");
    private static final By WITHOUT_MEMBER_BTN_ID = By.xpath("//*[contains(text(),'Üye Olmadan Devam Et')]");

    private static String BASE_COUNTIES_ID="//div[@id='DPE_TR_ADDRESSADDMODAL_DROPDOWN_COUNTIES']";
    private static String BASE_STREETS_ID="//div[@id='DPE_TR_ADDRESSADDMODAL_DROPDOWN_STREETS']";
    private static final By COUNTIES_ID = By.xpath(BASE_COUNTIES_ID + "//div[contains(text(),'Seçiniz...')]");
    private static final By SELECT_COUNTIES_ID = By.xpath(BASE_COUNTIES_ID + "//div[.=' Burgazada Mh.']");
    private static final By STREETS_ID = By.xpath(BASE_STREETS_ID + "//div[contains(text(),'Seçiniz...')]");
    private static final By SELECT_STREETS_ID = By.xpath(BASE_STREETS_ID + "//div[.=' Ayışığı Sk.']");
    private static final By APART_NUM_INPUT_ID = By.id("DPE_TR_ADDRESSADDMODAL_DROPDOWN_APARTMENTNUMBER");
    private static final By DOOR_NUM_INPUT_ID = By.id("DPE_TR_ADDRESSADDMODAL_INPUT_DOORNUMBER");
    private static final By PHONE_NUM_INPUT_ID = By.xpath("/html//input[@id='DPE_TR_ADDRESSADDMODAL_INPUT_PHONE']");
    private static final By SAVE_ADDRESS_BTN_ID = By.id("DPE_TR_ADDRESSADDMODAL_BUTTON_SAVE");
    private static final By CONT_W_SELECTED_ADD_BTN_ID = By.id("DPE_TR_ADDRESSLISTDELIVERY_BUTTON_SELECTADDRESS");
    String apartNum = "1";
    String doorNum = "1";
    String phoneNum = "111111111";


    public void iClickBasketPageOrder() {
        Assert.assertTrue("Sipariş Ver Butonu Bulunamadı.",isElementPresent(ORDER_BTN_ID));
        waitAndClick(ORDER_BTN_ID);
    }

    public void iClickBasketPagePopupContinueWithoutMember() {
        waitAndClick(WITHOUT_MEMBER_BTN_ID);

    }

    public void iSelectTheBasketPagePopupAddress() {
        clickCounties();
        selectCounties();
        clickStreets();
        selectStreets();
        fillApartNum(apartNum);
        fillDoorNum(doorNum);
        fillPhoneNum(phoneNum);
    }

    private void fillPhoneNum(String phoneNum) {
        waitAndClick(PHONE_NUM_INPUT_ID);
        sendText(PHONE_NUM_INPUT_ID,phoneNum);
    }

    private void fillDoorNum(String doorNum) {
        sendText(DOOR_NUM_INPUT_ID,doorNum);
    }

    private void fillApartNum(String apartNum) {
        sendText(APART_NUM_INPUT_ID,apartNum);

    }

    private void clickStreets() {
        waitAndClick(STREETS_ID);
    }

    private void clickCounties() {
        waitAndClick(COUNTIES_ID);
    }

    private void selectStreets() {
        waitAndClick(SELECT_STREETS_ID);
    }

    private void selectCounties() {
        waitAndClick(SELECT_COUNTIES_ID);
    }

    public void iClickBasketPagePopupSave() {
        waitAndClick(SAVE_ADDRESS_BTN_ID);
    }

    public void iClickBasketPagePopupContinueSelectedAddress() {
        waitAndClick(CONT_W_SELECTED_ADD_BTN_ID);
    }
}

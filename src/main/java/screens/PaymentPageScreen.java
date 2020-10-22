package screens;

import org.openqa.selenium.By;

public class PaymentPageScreen extends Base{



    private static final By SELECT_CREDIT_CARD_ID = By.xpath("//*[@class='styled__Header-sc-9iecht-5 ipRoCX']//div[contains(text(),'Kapıda Kredi Kartı')]");
    private static final By PAYMENT_CONT_BTN_ID = By.id("DPE_TR_PAYMENTOPTIONS_BUTTON_CONTINUE-D");

    public void iClickPaymentPageCreditCardContinune() {
        waitAndClick(SELECT_CREDIT_CARD_ID);
        waitAndClick(PAYMENT_CONT_BTN_ID);
    }
}

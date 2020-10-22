package steps;

import io.cucumber.java.en.Then;
import screens.PaymentPageScreen;

public class PaymentPageStep {

    PaymentPageScreen paymentPageScreen = new PaymentPageScreen();

    @Then("i click PaymentPage : CreditCard : Continune")
    public void iClickPaymentPageCreditCardContinune() {
        paymentPageScreen.iClickPaymentPageCreditCardContinune();

    }
}

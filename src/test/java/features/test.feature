Feature: Web Test
  @WebTest
  Scenario: Web Test
    When i am on the BasePage "dominos.com.tr"
    And i chosee BasePage : ServiceType : HomeDelivery : Region
    And i click BasePage : AllCampaigns
    And i click AllCampaigns : RandomCampaign
    And i click RandomCampaign : AddToBasket
    Then i click Basket : GoToBasketPage
    And i click BasketPage : Order
    Then i click BasketPage : Popup : ContinueWithoutMember
    And i select the BasketPage : Popup  : Address
    And i click BasketPage : Popup : Save
    And i click BasketPage : Popup : ContinueSelectedAddress
    Then i click PaymentPage : CreditCard : Continune



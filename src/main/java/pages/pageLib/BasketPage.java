package pages.pageLib;

import com.codeborne.selenide.SelenideElement;
import pages.PageManager;

public class BasketPage extends HomePageLoggedIn {
  // Constructor
  public BasketPage(){
    addElement("checkoutButton", "button[id='checkoutButton']");
    addElement("checkout", "button[id='checkoutButton']");
  }
  // Methods
  @Override
  public SelenideElement getMainElement() {
    return getElement("checkoutButton");
  }
  @Override
  public void navigate(String element) {
    switch (element){
      case "checkoutButton":
      case "checkout":
        PageManager.setCurrentPage(PageManager.getSelectAddressPage()); break;
    }
  }
}

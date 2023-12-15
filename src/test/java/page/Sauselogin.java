package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sauselogin {
    WebDriver d;

    @FindBy(id = "user-name")   
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "login-button")
    WebElement login_button;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement backpack;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement backlight;

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement tshirt;

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    WebElement jacket;

    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    WebElement onesie;

    @FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    WebElement redtshirt;

    @FindBy(id = "shopping_cart_container")
    WebElement carticon;

    @FindBy(id = "checkout")
    WebElement checkout;

    @FindBy(id = "first-name")
    WebElement firstname;

    @FindBy(id = "last-name")
    WebElement lastname;

    @FindBy(id = "postal-code")
    WebElement postalcode;

    @FindBy(id = "continue")
    WebElement cont;

    @FindBy(id = "finish")
    WebElement finish;

    @FindBy(id = "back-to-products")
    WebElement backhome;

    @FindBy(id = "react-burger-menu-btn")
    WebElement menu;

    @FindBy(xpath = "//*[@id=\"logout_sidebar_link\"]")
    WebElement logout;

    public Sauselogin(WebDriver d) {
        this.d = d;
        PageFactory.initElements(d, this);
    }

    public void setvalues(String Username, String Password) {
        username.sendKeys(Username);
        password.sendKeys(Password);
    }

    
    public void login() throws InterruptedException {
        login_button.click();
        Thread.sleep(3000);
    }

    public void addtocart() {
        backpack.click();
        backlight.click();
        tshirt.click();
        jacket.click();
        onesie.click();
        redtshirt.click();
        carticon.click();
    }

    public void checkout() throws InterruptedException {
        checkout.click();
        
        firstname.sendKeys("abc");
        lastname.sendKeys("cxz");
        postalcode.sendKeys("123456");
        cont.click();
        finish.click();
        backhome.click();
        menu.click();
    }
}

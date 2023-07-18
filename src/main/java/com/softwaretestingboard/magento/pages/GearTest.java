package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class GearTest extends Utility {

    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'Gear')]" )
    WebElement hoverOnGear;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Gear')]")
    WebElement clickGear;

    @CacheLookup
    @FindBy(xpath ="//a[normalize-space()='Overnight Duffle']")
    WebElement clickOvernightDuffle;

    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'Overnight Duffle')]" )
    WebElement textOvernightDuffel;

    @CacheLookup
    @FindBy(xpath ="//input[@id='qty']" )
    WebElement change3;

    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'Add to Cart')]" )
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath ="//body/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]" )
    WebElement verifyCart;

    @CacheLookup
    @FindBy(xpath ="//a[contains(text(),'shopping cart')]" )
    WebElement clickShoppingCart;

    @CacheLookup
    @FindBy(xpath ="//input[@title='Qty']" )
    WebElement verify3;

    @CacheLookup
    @FindBy(xpath = "//span[@data-bind='text: getValue()']")
    WebElement verify$135;

    @CacheLookup
    @FindBy(xpath ="//input[@class='input-text qty']" )
    WebElement change5;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Update Shopping Cart')]")
    WebElement clickUpdate;

    @CacheLookup
    @FindBy(xpath ="//td[@class='col subtotal']//span[text()='$225.00']" )
    WebElement verify$225;


    public void mouseHoverOnGear(){
        mouseHoverToElement(hoverOnGear);
    }
    public void clickOnGear(){
        clickOnElement(clickGear);
    }
    public void clickOnOvernightDuffle(){
        clickOnElement(clickOvernightDuffle);
    }
    public String verifyOvernightDuffle(){
        return getTextFromElement(textOvernightDuffel);
    }
    public void enter3 (String number){
        sendTextToElement(change3,number);
    }
    public void addOnCart (){
        clickOnElement(addToCart);
    }
    public String verifyByCart(){
        return getTextFromElement(verifyCart);
    }
    public void clickCart(){
        clickOnElement(clickShoppingCart);
    }
    public String verifyBy3(){
        return getTextFromElement(verify3);
    }
    public String verifyBy$135(){
        return getTextFromElement(verify$135);
    }
    public void changeBy5(String number){
        sendTextToElement(change5,number);
    }
    public void clickOnUpdate(){
        clickOnElement(clickUpdate);
    }
    public String verifyBy$225(){
        return getTextFromElement(verify$225);
    }







}

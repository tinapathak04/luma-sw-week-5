package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MenTest extends Utility {

    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'Men')]" )
    WebElement menMenu;

    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'Men')]" )
    WebElement clickingMenu;
    @CacheLookup
    @FindBy(linkText ="Bottoms" )
    WebElement mouseHoverBottoms;

    @CacheLookup
    @FindBy(linkText ="Pants" )
    WebElement hoverPants;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement clickPants;

    @CacheLookup
    @FindBy(xpath ="//a[contains(text(),'Cronus Yoga Pant')]" )
    WebElement hoverCronusYogaPant;

    @CacheLookup
    @FindBy(xpath ="//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]" )
    WebElement clickSize32;

    @CacheLookup
    @FindBy(xpath ="//body[1]/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]" )
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath ="//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]" )
    WebElement clickBlackColour;

    @CacheLookup
    @FindBy(xpath ="//body/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]" )
    WebElement verifyTextProductName;

    @CacheLookup
    @FindBy(xpath ="//a[contains(text(),'shopping cart')]" )
    WebElement clickCart;

    @CacheLookup
    @FindBy(xpath ="//body/div[1]/main[1]/div[1]/h1[1]/span[1]" )
    WebElement textShoppingCart;

    @CacheLookup
    @FindBy(xpath ="//tbody/tr[1]/td[1]/div[1]/strong[1]/a[1]" )
    WebElement textCronusYogaPant;

    @CacheLookup
    @FindBy(xpath ="//dd[contains(text(),'32')]" )
    WebElement verifyProduct32;
    @CacheLookup
    @FindBy(xpath ="//dd[contains(text(),'Black')]" )
    WebElement verifyProductBlack;


    public void mouseHoverOnMenMenu(){
        mouseHoverToElement(menMenu);
    }
    public void clickingOnMenu(){
        clickOnElement(clickingMenu);
    }
    public void hoverOnBottoms(){
        mouseHoverToElement(mouseHoverBottoms);
    }
    public void hoverOnPants(){
        mouseHoverToElement(hoverPants);
    }
    public void clickOnPants(){
        clickOnElement(clickPants);
    }
    public void hoverOnCronusYogaPant(){
        mouseHoverToElement(hoverCronusYogaPant);
    }
    public void clickOnSize32(){
        clickOnElement(clickSize32);
    }
    public void addToShoppingCart(){
        clickOnElement(addToCart);
    }
    public void clickOnBlackColour(){
        clickOnElement(clickBlackColour);
    }
    public String verifyByText(){
        return getTextFromElement(verifyTextProductName);
    }
    public void clickOnCart(){
        clickOnElement(clickCart);
    }
    public String verifyTextOnShoppingCart(){
        return getTextFromElement(textShoppingCart);
    }
    public String verifyCronusYogaPant(){
        return getTextFromElement(textCronusYogaPant);
    }
    public String verifyOn32(){
        return getTextFromElement(verifyProduct32);
    }
    public String verifyOnBlack(){
        return getTextFromElement(verifyProductBlack);
    }
}

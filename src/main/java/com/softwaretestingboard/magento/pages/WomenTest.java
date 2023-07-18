package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WomenTest extends Utility {

    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'Women')]" )
    WebElement womenMenu;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Women')]")
     WebElement clickMenu;
    @CacheLookup
    @FindBy(linkText ="Tops" )
    WebElement hoverTop ;

    @CacheLookup
    @FindBy(linkText ="Jackets" )
    WebElement hoverJackets;
    //By clickJackets = By.xpath("//strong[contains(text(),'Jackets')]");

    @CacheLookup
    @FindBy(xpath ="//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]" )
     WebElement selectProduct;

    @CacheLookup
    @FindBy(xpath ="//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/a[1]" )
    WebElement clickElement;

    @CacheLookup
    @FindBy(xpath ="//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/a[1]" )
    WebElement verifyProductName;

    @CacheLookup
    @FindBy(linkText ="Tops" )
    WebElement mouseHoverTops;

    @CacheLookup
    @FindBy(linkText ="Jackets" )
    WebElement mouseHoverJackets;

    @CacheLookup
    @FindBy(xpath ="//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]" )
    WebElement sortPrice;

    @CacheLookup
    @FindBy(xpath ="//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/a[1]" )
    WebElement verifyByLowToHigh;







    public void mouseHoverOnWomenMenu(){
        mouseHoverToElement(womenMenu);
    }
    public void clickOnMenu(){
        clickOnElement(clickMenu);
    }
    public void mouseHoverOnTop(){
        mouseHoverToElement(hoverTop);
    }
    public void mouseHoverToJackets(){
        clickOnElement(hoverJackets);
    }

    //public void clickOnJackets(){
        //mouseHoverToElement(clickJackets);
   // }

    public void sortByProductName(String productName){
        selectByValueFromDropDown(selectProduct,productName);
    }
    public void clickOnElement(){
        clickOnElement(clickElement);
    }
    public String verifyProductInAlphabeticalOrder(){
        return getTextFromElement(verifyProductName);
    }
    public void mouseHoverOnTops(){
        mouseHoverToElement(mouseHoverTops);
    }
    public void mouseHoverOnJackets(){
        mouseHoverToElement(mouseHoverJackets);
    }
    public void sortByPrice(String Price){
        selectByValueFromDropDown(sortPrice,Price);
    }
    public String verifyLowToHigh(){
        return getTextFromElement(verifyByLowToHigh);
    }


}

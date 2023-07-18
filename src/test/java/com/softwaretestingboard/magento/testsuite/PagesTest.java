package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.pages.GearTest;
import com.softwaretestingboard.magento.pages.MenTest;
import com.softwaretestingboard.magento.pages.WomenTest;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class PagesTest extends BaseTest {


    WomenTest women;
    MenTest men;
    GearTest gear;

    @BeforeMethod(alwaysRun = true)
    public void init(){
        women = new WomenTest();
        men = new MenTest();
        gear = new GearTest();
    }



    @Test(groups = {"sanity","regression"})
    public void verifyTheSortByProductNameFilter(){
        //Mouse Hover on Women Menu
        women.mouseHoverOnWomenMenu();
        women.clickOnMenu();
        //Mouse Hover on Tops
        women.mouseHoverOnTop();
        //Click on Jackets
        women.mouseHoverToJackets();
        //women. clickOnJackets();

        //Select Sort By filter “Product Name”
        women.sortByProductName("name");
        women.clickOnElement();

        //Verify the products name display in alphabetical order
        String expectedText = "Set Ascending Direction";
        String actualText =women.verifyProductInAlphabeticalOrder();
        Assert.assertEquals(actualText,expectedText,"Message not displayed");
    }
    @Test(groups = {"sanity","smoke","regression"})
     public void verifyTheSortByPriceFilter(){
        //Mouse Hover on Women Menu
        women.mouseHoverOnWomenMenu();
        women.clickOnMenu();
        //Mouse Hover on Tops
        women.mouseHoverOnTops();
        //Click on Jackets
        //women.clickOnJackets();
        women.mouseHoverToJackets();
        //Select Sort By filter “Price”
        women.sortByPrice("price");
        women.clickOnElement();
        //Verify the products price display in Low to High
        String expectedText = "Set Ascending Direction";
        String actualText =women.verifyLowToHigh();
        Assert.assertEquals(actualText,expectedText,"Message not displayed");
    }
    @Test(groups = {"smoke","regression"})
    public void userShouldAddProductSuccessFullyToShoppingCart(){
        //Mouse Hover on Men Menu
        men.mouseHoverOnMenMenu();
        men.clickingOnMenu();
        //Mouse Hover on Bottoms
        men.hoverOnBottoms();
        men.hoverOnPants();
        //Click on Pants
        men.clickOnPants();
        //Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32.
        men.hoverOnCronusYogaPant();
        men.clickOnSize32();
        //Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
        men.hoverOnCronusYogaPant();
        men.clickOnBlackColour();
        //Mouse Hover on product name‘Cronus Yoga Pant’ and click on‘Add To Cart’ Button.
        men.hoverOnCronusYogaPant();
        men.addToShoppingCart();
        //Verify the text‘You added Cronus Yoga Pant to your shopping cart.’
        String expectedText = "You added Cronus Yoga Pant to your shopping cart.";
        String actualText = men.verifyByText();
        Assert.assertEquals(actualText,expectedText,"Message not displayed");
        //Click on ‘shopping cart’ Link into message
        men.clickOnCart();
        //Verify the text ‘Shopping Cart.’
        String expectedText1 = "Shopping Cart.";
        String actualText1 = men.verifyTextOnShoppingCart();
        Assert.assertEquals(actualText1,expectedText1,"Message not displayed");
        //Verify the product name ‘Cronus Yoga Pant’
        String expectedText2 = "Cronus Yoga Pant";
        String actualText2 = men.verifyCronusYogaPant();
        Assert.assertEquals(actualText2,expectedText2,"Message not displayed");
        //Verify the product size ‘32’
        String expectedText3 = "32";
        String actualText3 = men.verifyOn32();
        Assert.assertEquals(actualText3,expectedText3,"Message not displayed");
        //Verify the product colour ‘Black’
        String expectedText4 = "Black";
        String actualText4 = men.verifyOnBlack();
        Assert.assertEquals(actualText4,expectedText4,"Message not displayed");

    }
    @Test(groups = {"regression"})
    public void userShouldAddProductSuccessFullyToFinalShoppingCart(){
        //Mouse Hover on Gear Menu
        gear.mouseHoverOnGear();
        gear.clickOnGear();
        //Click on Bags

        //Click on Product Name ‘Overnight Duffle’
        gear.clickOnOvernightDuffle();
        //Verify the text ‘Overnight Duffle’
        String expectedText = "Overnight Duffle";
        String actualText = gear.verifyOvernightDuffle();
        Assert.assertEquals(actualText,expectedText,"Message not displayed");
        //Change Qty 3
        gear.enter3("3");
        //Click on ‘Add to Cart’ Button.
        gear.addOnCart();
        //Verify the text ‘You added Overnight Duffle to your shopping cart.’
        String expectedText1 = "You added Overnight Duffle to your shopping cart.";
        String actualText1 = gear.verifyByCart();
        Assert.assertEquals(actualText1,expectedText1,"Message not displayed");
        //Click on ‘shopping cart’ Link into message
        gear.clickCart();
        //Verify the Qty is ‘3’
        String expectedText2 = "3";
        String actualText2 = gear.verifyBy3();
        Assert.assertEquals(actualText2,expectedText2,"Message not displayed");
        //Verify the product price ‘$135.00’
        String expectedText3 = "$135.00";
        String actualText3 = gear.verifyBy$135();
        Assert.assertEquals(actualText3,expectedText3,"Message not displayed");
        //Change Qty to ‘5’
        gear.changeBy5("5");
        //Click on ‘Update Shopping Cart’ button
        gear.clickOnUpdate();
        //Verify the product price ‘$225.00’
        String expectedText4 = "$225.00";
        String actualText4 = gear.verifyBy$225();
        Assert.assertEquals(actualText4,expectedText4,"Message not displayed");

    }


}

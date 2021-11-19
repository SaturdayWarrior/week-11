package x_path;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Google extends BaseUrl {
    String base = " https://www.google.com/";

    /*In Google search type "demo nopCommerce store" and click search
Click on the link "nopCommerce demo store"
Click on Computers and Verify that the user successfully navigated to the Computers page.
Navigate to google https://www.google.com/
In Google search type "demo nopCommerce store" and click search
Click on the link "nopCommerce demo store"
Click on Electronics and Verify that the user successfully navigated to the Electronics page.
Above same test do for Apparel, Digital downloads, Books, Jewelry, Gift Cards.
     */
/*Navigate to google https://www.google.com/
In Google search type "demo nopCommerce store" and click search
Click on the link "nopCommerce demo store"
Click on Computers and Verify that the user successfully navigated to the Computers page.
Navigate to google https://www.google.com/
In Google search type "demo nopCommerce store" and click search
Click on the link "nopCommerce demo store"
Click on Electronics and Verify that the user successfully navigated to the Electronics page.
Above same test do for Apparel, Digital downloads, Books, Jewelry, Gift Cards.
 */
    @Before
    public void auto1() {
        openBrowser(base);
        WebElement one = driver.findElement(By.xpath("//input[@name='q']"));
        driver.findElement(By.xpath("//div[contains(text(),'I agree')]")).click();
        one.sendKeys("demo nopCommerce store");
        one.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//h3[contains(text(),'nopCommerce demo store')]")).click();
    }

    @Test
    public void google() {

        driver.findElement(By.linkText("Computers")).click();
        String expectedResult = "Computers";
        WebElement two = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));
        String actualResult = two.getText();
        Assert.assertEquals("Your are not on Page", expectedResult, actualResult);
        google1();

        auto1();
        driver.findElement(By.linkText("Electronics")).click();
        String expectedResult1 = "Electronics";
        WebElement three = driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]"));
        String actualResuls1 = three.getText();
        Assert.assertEquals("You are not on Page", expectedResult1, actualResuls1);
        google1();

        auto1();
        driver.findElement(By.linkText("Apparel")).click();
        String expxtedResult = "Apparel";
        WebElement four = driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        String actualResult2 = four.getText();
        Assert.assertEquals("You are not on Page", expxtedResult, actualResult2);
        google1();

        auto1();
        driver.findElement(By.linkText("Digital downloads")).click();
        String expectedResult2 = "Digital downloads";
        WebElement five = driver.findElement(By.xpath("//h1[contain(text(),'Digital downloads')]"));
        String actualResult3 = five.getText();
        Assert.assertEquals("You are not on Page",expectedResult2,actualResult3);
        google1();

        auto1();
        driver.findElement(By.linkText("Books")).click();
        String expectedResult4 = "Books";
        WebElement six = driver.findElement(By.xpath("//h1[contain(text(),'Books')]"));
        String actualResult4 =six.getText();
        Assert.assertEquals("You are not on Page",expectedResult4,actualResult4);
        google1();

        auto1();
        driver.findElement(By.linkText("Jewelry")).click();
        String expectedResult5 = "Jewelry";
        WebElement seaven = driver.findElement(By.xpath("//h1[contain(text(),'Jewelry')]"));
        String actualResult5 =seaven.getText();
        Assert.assertEquals("You are not on Page",expectedResult5,actualResult5);
        google1();

        auto1();
        driver.findElement(By.linkText("Gift Cards")).click();
        String expectedResult7 = "Gift Cards";
        WebElement eight = driver.findElement(By.xpath("//h1[contain(text(),'Gift Cards')]"));
        String actualResult7 =seaven.getText();
        Assert.assertEquals("You are not on Page",expectedResult7,actualResult7);
        google1();


    }

    @After
    public void google1() {
        closeBrowser();

    }
}


package x_path;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Nop_commerce extends BaseUrl {
    String webUrl11 = "https://demo.nopcommerce.com/";
    /*
    Navigate to website "https://demo.nopcommerce.com/"
Click on the register link.
Fill in all the fields.
Click on the register button.
Verify that the user registered successfully.
     */

    @Before
    public void before() {
        openBrowser(webUrl11);
        //WebElement seach = driver.findElement(By.xpath("//input[@name='q']"));
        // seach.sendKeys("demo.nopcommerce.com");
        //seach.click();
        //driver.findElement(By.xpath("//h3[contains(text(),'nopCommerce demo store')]")).click();
    }
    @Test
    public void one() {
        driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
        driver.findElement(By.xpath("//input[@id='gender-male']")).click();
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Sunil");
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Patel");
        driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).click();
        driver.findElement(By.xpath("//option[contains(text(),'6')]")).click();
        driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).click();
        driver.findElement(By.xpath("//option[contains(text(),'March')]")).click();
        driver.findElement(By.xpath("//option[contains(text(),'1996')]")).click();
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("sunilpatel46@gmail.com");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Sunil@133");
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Sunil@133");
        driver.findElement(By.xpath("//button[@id='register-button']")).click();
        String expectedResult = "Your registration completed";
        WebElement two = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]"));
        String actualResult = two.getText();
        Assert.assertEquals("Your are already Register", expectedResult, actualResult);
    }
    @After
    public void after() {
        closeBrowser();
    }

}


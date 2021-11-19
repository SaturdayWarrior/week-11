package x_path;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AutomationPractice extends BaseUrl {
    /*Open url : http://automationpractice.com/index.php
Click on Sign In
Enter correct Email in Email field
Enter wrong Password in Password field
Click on the Sign In button.
Expected Result:
Error Message “There is 1 error”
     */
    String webUrl1 = "http://automationpractice.com/index.php";
    @Before
    public void auto (){
        openBrowser(webUrl1);
    }
    @Test
    public void automationPractice(){
      /*driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
      WebElement p = driver.findElement(By.xpath("//input[@id='email']"));
      p.sendKeys("priyank123@gmail.com");
      driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("123344567");
      driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
        String expectedResult8 = "There is 1 error";
        String actualResult8 =p.getText();
        Assert.assertEquals("User is not in login page ",actualResult8,expectedResult8);*/
        WebElement element =driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]"));
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
    }
}

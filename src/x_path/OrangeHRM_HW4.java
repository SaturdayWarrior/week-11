package x_path;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*Homework – 4
https://opensource-demo.orangehrmlive.com/
( Username : Admin | Password : admin123 )
Enter username
Enter password
Click login
Verify that the text “Welcome Paul”
After Paul one symbol there so click on the symbol for logout.
Verify the below text.
LOGIN Panel
 */
public class OrangeHRM_HW4 extends BaseUrl {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList";
    @Before
    public void first(){
        openBrowser(baseUrl);
    }
    @Test
    public void verifyUserNavigatePageSuccessful(){
        WebElement id = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        id.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("admin123");
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginButton.click();
        //WebElement forgot = driver.findElement(By.linkText("//a[contains(text(),'Forgot your password?')]"));
       // forgot.click();
        driver.findElement(By.xpath("//a[@id='welcome']")).click();
       driver.findElement(By.xpath("//a[@href=/index.php/auth/logout]")).click();
       String expectedMessage = "LOGIN Panel";
       WebElement message = driver.findElement(By.xpath("logInPanelHeading,logInPanelHeading"));
        Assert.assertEquals("LOGIN Panel",expectedMessage);


    }@After
    public void tearDown(){
        //driver.close();
    }







    }


package web.testing;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTesting {

    public static void main(String[] args) {
//      Creating an object of WebDriver for the Firefox browser
        WebDriver driver = new FirefoxDriver();
        
//      Navigating to the specified URL
        driver.navigate().to("https://app.logyxps.com/");

//      Selecting input elements and entering user data 
        WebElement userid = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/form/div[1]/input"));
        userid.sendKeys("demomail@gmail.com");
       
        WebElement password = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/form/div[2]/input"));
        password.sendKeys("demomail");
        
//      Performing the login by clicking on the LOGIN button
        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/form/button")).click();

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        
//      Clicking on the confirmation button after login
        driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
        
//      Navigating to the user profile section
        driver.get("https://app.logyxps.com/my-profile");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        
//      Collecting data using their XPath and printing the data
        String name = driver.findElement(By.xpath("//*[@id=\":r0:\"]")).getAttribute("value");
        String email = driver.findElement(By.xpath("//*[@id=\":r1:\"]")).getAttribute("value");
        String phone = driver.findElement(By.xpath("//*[@id=\":r2:\"]")).getAttribute("value");
        System.out.println("User data:\nname  : " + name + "\nemail : " + email + "\nphone : " + phone);
    }
}

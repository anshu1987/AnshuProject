package seleniumcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop{

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/anshu.khandelwal/Documents/Setup/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        //Element which needs to drag.
        WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));

        //Element on which need to drop.
        WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));
        Actions act = new Actions(driver);
       act.dragAndDrop(From,To).build().perform();
       Thread.sleep(50000);
        System.out.println("Operation Successful");
      //  driver.close();
        driver.quit();

        //Action act = new Action() ;



    }





}



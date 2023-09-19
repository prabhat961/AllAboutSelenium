package myCodes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class handleXPaths {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","E:/Software/Drivers/Browser Drivers/chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.setBinary("E:/Software/Drivers/chrome-win64/chrome-win64/chrome.exe");
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(co);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        WebElement searchBar = driver.findElement(By.xpath("//input[@id ='twotabsearchtextbox']"));
        searchBar.sendKeys("iphone14");

    }

}

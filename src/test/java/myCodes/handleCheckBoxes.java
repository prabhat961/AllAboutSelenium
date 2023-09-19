package myCodes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class handleCheckBoxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","E:/Software/Drivers/Browser Drivers/chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.setBinary("E:/Software/Drivers/chrome-win64/chrome-win64/chrome.exe");
        WebDriver driver = new ChromeDriver(co);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

    }
}

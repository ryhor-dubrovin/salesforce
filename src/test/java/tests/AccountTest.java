package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import model.Account;
import model.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AccountTest {

    @Test
    public void createAccountTest() {
        User user = new User("https://tms-ba.my.salesforce.com/","ryhordubrovin-vfqa@force.com","TMSAQA20onl");
        Account account = new Account("AccountAQA","www.google.com","Apparel");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-popup-blocking");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(user.getUrl());
    }
}

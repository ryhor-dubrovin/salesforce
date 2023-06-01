package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import model.Account;
import model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;
import pages.NewAccountPage;

import java.util.concurrent.TimeUnit;

public class AccountTest extends BaseTest {

    @Test
    public void createAccountTest() {
        User user = new User("https://tms-ba.my.salesforce.com/","ryhordubrovin-vfqa@force.com","TMSAQA20onl");
        Account account = new Account("AccountAQA","www.google.com","Apparel");
        driver.get(user.getUrl());
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginUser(user);

        NewAccountPage newAccountPage = new NewAccountPage(driver);
        newAccountPage.openPage()
                .create(account);
        // добавить ассерт
    }
}

package pages;

import model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public static final By USERNAME_INPUT = By.xpath("//input[@id='username']");
    public static final By PASSWORD_INPUT = By.xpath("//input[@id='password']");
    public static final By LOGIN_BUTTON = By.xpath("//input[@id='Login']");
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void loginUser(User user) {
        driver.findElement(USERNAME_INPUT).sendKeys(user.getLogin());
        driver.findElement(PASSWORD_INPUT).sendKeys(user.getPassword());
        driver.findElement(LOGIN_BUTTON).click();
    }
}

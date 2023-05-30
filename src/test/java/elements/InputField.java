package elements;

import org.openqa.selenium.WebDriver;

public class InputField {

    private static final String INPUT_XPATH = "";
    private WebDriver driver;
    private String label;

    public InputField(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }


}

package context;

import org.openqa.selenium.WebDriver;

public class TestContext {
    private WebDriver driver;
    public TestContext(WebDriver driver) {
        System.out.println("textContext");
        this.driver = driver;

    }



    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}

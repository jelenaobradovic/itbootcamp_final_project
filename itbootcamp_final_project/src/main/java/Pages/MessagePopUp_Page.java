package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MessagePopUp_Page {

    private WebDriver driver;

    public MessagePopUp_Page(WebDriver driver) {
        this.driver = driver;
    }


    public void waitForPopUpToBeVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.
                until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//div[contains(@class, 'v-snack__content')]")));

    }

    public WebElement getElementWithPopUpMsgText() {
        return driver.
                findElement(
                        By.xpath("//div[contains(@class,'v-snack__content')]/ul/li"));
    }


}

package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.SeleniumDriver;

import java.util.List;

public class Base {

    protected WebDriver driver = SeleniumDriver.getDriver();
    protected WebDriverWait waitDriver = new WebDriverWait(driver, 40);


    protected void waitAndClick(By by) {
        waitDriver.until(ExpectedConditions.visibilityOfElementLocated(by)).click();
    }

    public boolean isElementPresent(By by) {
        try {
            waitDriver.until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }



    protected void sendText(By by, String text) {
        waitAndFindElement(by).sendKeys(text);
    }

    protected void clearText(By by){
        waitAndFindElement(by).clear();
    }

    protected WebElement waitAndFindElement(By by) {
        return waitDriver.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    protected List<WebElement> waitAndFindListElements(By by) {
        return waitDriver.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }

    protected void scroll(By by) {
        WebElement element = waitAndFindElement(by);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}

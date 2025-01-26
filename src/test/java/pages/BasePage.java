package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BasePage {


    public static final String TITLE = "com.test.calc:id/title";
    public static final String ADD = "com.test.calc:id/add";
    public static final String SUBTRACT = "com.test.calc:id/subtract";
    public static final String SQRT = "com.test.calc:id/sqrt";
    public static final String DIVIDE = "com.test.calc:id/divide";
    public static final String MULTIPLY = "com.test.calc:id/multiply";
    public static final String POWER = "com.test.calc:id/power";
    public static final String RESULT = "com.test.calc:id/result";






    public String getTitle (AndroidDriver driver){

        return driver.findElement(By.id(TITLE)).getText();
    }


    public void add (AndroidDriver driver){

        driver.findElement(By.id(ADD)).click();
    }

    public void subtract(AndroidDriver driver) {
        driver.findElement(By.id(SUBTRACT)).click();
    }

    public void squareRoot(AndroidDriver driver) {

            driver.findElement(By.id(SQRT)).click();
    }

    public void divideByTwo(AndroidDriver driver) {
        driver.findElement(By.id(DIVIDE)).click();
        }


    public void multiplyByTwo(AndroidDriver driver) {
        driver.findElement(By.id(MULTIPLY)).click();
    }

    public void powerByTwo(AndroidDriver driver) {
        driver.findElement(By.id(POWER)).click();
    }

    public String getResult(AndroidDriver driver) {
       return driver.findElement(By.id(RESULT)).getText();
    }


    public String getRawValue(String rawValue) {
       return rawValue.substring(8, rawValue.length());
    }


    public void quitDriver(WebDriver driver) {
        driver.quit();
    }

}

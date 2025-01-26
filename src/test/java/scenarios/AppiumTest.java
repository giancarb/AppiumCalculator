package scenarios;

import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import pages.BasePage;

import java.net.MalformedURLException;

import static org.testng.Assert.assertEquals;

public class AppiumTest extends AndroidSetup {

    BasePage basePage = new BasePage();

    @Test
    public void smokeTest() throws InterruptedException, MalformedURLException {

        prepareAndroidForAppium();

        String title = basePage.getTitle(driver);


        assertEquals(
                title, "Wonky calculator app",
                "Verify ADD");


        basePage.add(driver);
        String result = basePage.getResult(driver);

        assertEquals(
                basePage.getRawValue(result), "1",
                "Verify ADD");

        basePage.subtract(driver);
        result = basePage.getResult(driver);

        assertEquals(
                basePage.getRawValue(result), "0",
                "Verify SUBTRACT");

        driver.quit();
    }


    //Verify Integer Operations
    @Test
    public void UAT1() throws InterruptedException, MalformedURLException {

        prepareAndroidForAppium();

        SoftAssert softAssertion = new SoftAssert();

        //Verify "ADD"
        basePage.add(driver);
        basePage.add(driver);
        basePage.add(driver);
        basePage.add(driver);

        String result = basePage.getResult(driver);

        softAssertion.assertEquals(
                basePage.getRawValue(result), "4",
                "Verify 'ADD'");

        // Verify 'SUBTRACT'
        basePage.subtract(driver);
        basePage.subtract(driver);

        result = basePage.getResult(driver);

        softAssertion.assertEquals(
                basePage.getRawValue(result), "2",
                "Verify 'SUBTRACT'");

        //Verify 'MULTIPLY by 2'
        basePage.multiplyByTwo(driver);

        result = basePage.getResult(driver);

        softAssertion.assertEquals(
                basePage.getRawValue(result), "4",
                "Verify 'MULTIPLY by 2'");


        // Verify 'SQUARE ROOT'
        basePage.squareRoot(driver);


        result = basePage.getResult(driver);

        softAssertion.assertEquals(
                basePage.getRawValue(result), "2",
                " Verify 'SQUARE ROOT'");

        // Verify 'DIVIDE by 2'
        basePage.divideByTwo(driver);

        result = basePage.getResult(driver);

        softAssertion.assertEquals(
                basePage.getRawValue(result), "1",
                "Verify 'DIVIDE by 2'");

        // Verify 'POWER by 2'
        basePage.powerByTwo(driver);
        result = basePage.getResult(driver);

        softAssertion.assertEquals(
                basePage.getRawValue(result), "1",
                "Verify 'POWER by 2'");


        softAssertion.assertAll();
        driver.quit();


    }

    //Verify Float Operations
    @Test
    public void UAT2() throws InterruptedException, MalformedURLException {

        prepareAndroidForAppium();

        SoftAssert softAssertion = new SoftAssert();

        basePage.add(driver);
        basePage.divideByTwo(driver);
        basePage.add(driver);

        String result = basePage.getResult(driver);

        softAssertion.assertEquals(
                basePage.getRawValue(result), "1.5",
                "Verify 'ADD'");

        // Verify 'SUBTRACT'
        basePage.subtract(driver);
        result = basePage.getResult(driver);

        softAssertion.assertEquals(
                basePage.getRawValue(result), "0.5",
                "Verify 'SUBTRACT'");

        //Verify 'MULTIPLY by 2'
        basePage.multiplyByTwo(driver);

        result = basePage.getResult(driver);

        softAssertion.assertEquals(
                basePage.getRawValue(result), "1.0",
                "Verify 'MULTIPLY by 2'");


        //Verify 'DIVIDE by 2'
        basePage.divideByTwo(driver);
        basePage.divideByTwo(driver);

        result = basePage.getResult(driver);

        softAssertion.assertEquals(
                basePage.getRawValue(result), "0.25",
                "Verify 'DIVIDE by 2'");


        // Verify 'SQUARE ROOT'
        basePage.squareRoot(driver);

        result = basePage.getResult(driver);

        softAssertion.assertEquals(
                basePage.getRawValue(result), "0.5",
                " Verify 'SQUARE ROOT'");


        // Verify 'POWER by 2'
        basePage.powerByTwo(driver);

        result = basePage.getResult(driver);

        softAssertion.assertEquals(
                basePage.getRawValue(result), "0.25",
                " Verify 'POWER by 2'");


        softAssertion.assertAll();

        driver.quit();

    }

    //Verify Negative Operations
    @Test
    public void UAT3() throws InterruptedException, MalformedURLException {

        prepareAndroidForAppium();
        SoftAssert softAssertion = new SoftAssert();

        //Verify 'SUBTRACT'
        basePage.subtract(driver);
        basePage.subtract(driver);

        String result = basePage.getResult(driver);

        softAssertion.assertEquals(
                basePage.getRawValue(result), "-2",
                "Verify 'SUBTRACT'");

        //Verify 'ADD'
        basePage.add(driver);

        result = basePage.getResult(driver);

        softAssertion.assertEquals(
                basePage.getRawValue(result), "-1",
                "Verify 'ADD'");


        //Verify 'MULTIPLY by 2'
        basePage.multiplyByTwo(driver);

        result = basePage.getResult(driver);

        softAssertion.assertEquals(
                basePage.getRawValue(result), "-2",
                "'MULTIPLY by 2'");


        //Verify 'DIVIDE by 2'
        basePage.divideByTwo(driver);

        result = basePage.getResult(driver);

        softAssertion.assertEquals(
                basePage.getRawValue(result), "-1",
                "Verify 'DIVIDE by 2'");

        //Verify 'POWER by 2'
        basePage.subtract(driver);
        basePage.powerByTwo(driver);

        result = basePage.getResult(driver);

        softAssertion.assertEquals(
                basePage.getRawValue(result), "-4",
                "Verify 'POWER by 2'");

        softAssertion.assertAll();

        driver.quit();
    }

    //Verify FIRST Operation
    @Test
    public void UAT4() throws InterruptedException, MalformedURLException {

        prepareAndroidForAppium();
        SoftAssert softAssertion = new SoftAssert();

        //Verify 'ADD'
        basePage.add(driver);

        String result = basePage.getResult(driver);

        softAssertion.assertEquals(
                basePage.getRawValue(result), "1",
                "Verify 'ADD'");

        driver.quit();

        prepareAndroidForAppium();

        //Verify 'SUBTRACT'
        basePage.subtract(driver);

        result = basePage.getResult(driver);

        softAssertion.assertEquals(
                basePage.getRawValue(result), "-1",
                "Verify 'SUBTRACT'");

        driver.quit();

        prepareAndroidForAppium();


        // Verify 'SQUARE ROOT'
        basePage.squareRoot(driver);

        result = basePage.getResult(driver);

        softAssertion.assertEquals(
                basePage.getRawValue(result), "0",
                " Verify 'SQUARE ROOT'");

        driver.quit();

        prepareAndroidForAppium();


        // Verify 'DIVIDE by 2'
        basePage.divideByTwo(driver);

        result = basePage.getResult(driver);

        softAssertion.assertEquals(
                basePage.getRawValue(result), "0",
                "Verify 'DIVIDE by 2'");


        driver.quit();

        prepareAndroidForAppium();


        // Verify 'MULTIPLY by 2'
        basePage.multiplyByTwo(driver);

        result = basePage.getResult(driver);

        softAssertion.assertEquals(
                basePage.getRawValue(result), "0",
                "Verify 'MULTIPLY by 2'");

        driver.quit();

        prepareAndroidForAppium();


        // Verify 'POWER by 2'
        basePage.powerByTwo(driver);

        result = basePage.getResult(driver);

        softAssertion.assertEquals(
                basePage.getRawValue(result), "0",
                "Verify 'POWER by 2'");

        softAssertion.assertAll();

        driver.quit();


    }

    // Verify STREST test
    @Test
    public void UAT5() throws InterruptedException, MalformedURLException {

        prepareAndroidForAppium();

        for (int i = 0; i < 100; i++) {

            basePage.add(driver);
        }

        String result = basePage.getResult(driver);

        assertEquals(
                basePage.getRawValue(result), "100",
                "Verify 'ADD'");

        driver.quit();

    }


}



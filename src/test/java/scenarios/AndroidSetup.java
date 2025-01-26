package scenarios;



import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidSetup {

    public AndroidDriver driver;


    protected void prepareAndroidForAppium() throws MalformedURLException {

        UiAutomator2Options options = new UiAutomator2Options()
                .setUdid("emulator-5554")
                .setApp("/Users/gianlucacarbone/Dev/Appium/AppiumTestForCalculator/apps/app.apk")
                .setAppActivity("com.activities.CalculatorActivity")
                .setAppPackage("com.test.calc")
                .setDeviceName("")
                .setPlatformVersion("5.1")
                .setPlatformName("Android")
                .setAutomationName("UiAutomator2");

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723"), options);

    }
}

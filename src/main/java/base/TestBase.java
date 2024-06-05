package base;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class TestBase {

    public static AppiumDriver driver;

    public static void executeDriver() throws MalformedURLException {

        // Create instance of desired capability
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "8.1");
        capabilities.setCapability("appPackage", "com.boopathy.raja.tutorial");
        capabilities.setCapability("appActivity", "com.boopathy.raja.tutorial.Splash");
        capabilities.setCapability("deviceName", "Pixel 3");
        capabilities.setCapability("automationName", "UiAutomator2");
		capabilities.setCapability("app", "D:\\Eclipse\\NAGP2024\\AppiumTest\\src\\test\\resources\\apkFile\\Android_UI_Design-1.0 1.apk");


        try {
            System.out.println("Initializing Appium Driver...");
            driver = new AndroidDriver(new URL("http://localhost:4723"), capabilities);
            System.out.println("Appium Driver initialized successfully.");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        } catch (Exception e) {
            System.err.println("Error initializing Appium Driver: " + e.getMessage());
            e.printStackTrace();
        }

    }

}

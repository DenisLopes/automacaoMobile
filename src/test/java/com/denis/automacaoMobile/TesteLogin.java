package com.denis.automacaoMobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class TesteLogin {

    private static ScreenLogin screenLogin;
    private static AppiumDriver driver;

    @Before
    public void caps() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", new File("apps/app-debug.apk"));
        capabilities.setCapability("deviceName", ("emulator-5554"));
        capabilities.setCapability("platformName", ("Android"));
        capabilities.setCapability("unicodekeyboard", true);
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
        screenLogin = new ScreenLogin(driver);
    }

    @Test
    public void testLogin(){
        screenLogin.login();
    }


}

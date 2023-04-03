package com.denis.automacaoMobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

public class ScreenLogin {

    public ScreenLogin(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id="login_username")
   // @iosFindBy(accessibility="")
    private RemoteWebElement campoEmail;

    @AndroidFindBy(id="login_password")
   // @iosFindBy(accessibility="")
    private RemoteWebElement campoPassword;

    @AndroidFindBy(id="login_button")
   // @iosFindBy(accessibility="")
    private RemoteWebElement botaoLogar;

    public void login(){
        campoEmail.sendKeys("denis@teste.com");
        campoPassword.sendKeys("1234");
        botaoLogar.click();
    }
}

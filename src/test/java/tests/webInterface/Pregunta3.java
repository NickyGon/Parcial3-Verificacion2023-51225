package tests.webInterface;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class Pregunta3 extends TestBaseP3 {

    @Test
    public void verifyPregunta3Sucess() throws InterruptedException {

        String name="Luke Black";
        String email="coonandfriends"+new Date().getTime()+"@gmail.com";
        String pwd="samosisespava";

        signup(name,email,pwd);

        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR!! Sign Up was not successfully, review data!");

        menuSection.logoutButton.click();

        Thread.sleep(2000);

        signup(name,email,pwd);

        Assertions.assertFalse(menuSection.logoutButton.isControlDisplayed(),
                "ERROR!! The user with the same data should not register again!!");
    }

    public void signup(String nam, String ema, String pass){
        mainPage.signupButton.click();

        signUpSection.nameTxtBox.setText(nam);
        signUpSection.emailTxtBox.setText(ema);
        signUpSection.pwdTxtBox.setText(pass);
        signUpSection.termsCheckBox.click();
        signUpSection.signUpButton.click();
    }

}

package mobile.activities.clockApp;

import mobile.controls.Button;
import mobile.controls.Label;
import org.openqa.selenium.By;

public class MainActivity {



    public Button createButton= new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"Add alarm\"]"));
    public Label name= new Label(By.xpath("(//android.widget.TextView[contains(@text,'Skillzy')])[last()]"));

    public void setLabel(String nameAdd){
        name= new Label(By.xpath("(//android.widget.TextView[contains(@text,'"+nameAdd+"')])[last()]"));
    }

}

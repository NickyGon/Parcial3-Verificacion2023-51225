package mobile.activities.calendarApp;


import mobile.controls.Button;
import mobile.controls.Label;
import org.openqa.selenium.By;

public class MainActivity {
    public Button addButton= new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"New Event\"]"));

    public Button addEvent= new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"New Event\"]"));

    public Label event= new Label(By.xpath("//android.widget.LinearLayout//android.widget.TextView[@text='Skillzy']"));

    public void setEvent(String name, String mode){
        event = new Label(By.xpath("(//android.widget.LinearLayout[contains(@resource-id,'event_item_holder')]//android.widget.TextView[@text='"+name+"']//following-sibling::android.widget.TextView[contains(@text,'"+mode+"')])[last()]"));
    }

}

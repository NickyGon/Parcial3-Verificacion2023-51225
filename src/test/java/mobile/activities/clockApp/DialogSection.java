package mobile.activities.clockApp;


import mobile.controls.Button;
import mobile.controls.Textbox;
import org.openqa.selenium.By;

public class DialogSection {
    public Textbox labelBox= new Textbox(By.id("com.android.deskclock:id/alarm_label"));
    public Button accept= new Button(By.xpath("//android.widget.Button[@text='OK']"));
}

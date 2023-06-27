package mobile.activities.clockApp;


import mobile.controls.Button;
import mobile.controls.Label;
import org.openqa.selenium.By;

public class AlarmActivity {

    public Label label= new Label(By.id("com.android.deskclock:id/edit_label"));

    public Button confirm= new Button(By.xpath("//android.widget.Button[@content-desc=\"Confirm\"]"));




}

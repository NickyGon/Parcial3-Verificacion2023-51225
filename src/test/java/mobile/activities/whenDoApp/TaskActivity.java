package mobile.activities.whenDoApp;

import mobile.controls.Button;
import mobile.controls.Textbox;
import org.openqa.selenium.By;

public class TaskActivity {
    public Textbox nameTextBox= new Textbox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));

    public Button saveButton= new Button(By.xpath("//android.widget.TextView[@content-desc=\"Save\"]"));

    public Button deleteButton= new Button(By.xpath("//android.widget.TextView[@content-desc=\"Delete\"]"));



}

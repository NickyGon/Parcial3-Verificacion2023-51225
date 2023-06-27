package mobile.activities.calendarApp;


import mobile.controls.Button;
import mobile.controls.Textbox;
import org.openqa.selenium.By;

public class EventActivity {
    public Textbox event= new Textbox(By.id("com.eventmanager.task.calendar:id/event_title"));

    public Button checkAllDay= new Button(By.id("com.eventmanager.task.calendar:id/event_all_day"));

    public Button save= new Button(By.xpath("//android.widget.TextView[@text='Save']//parent::node()"));


}

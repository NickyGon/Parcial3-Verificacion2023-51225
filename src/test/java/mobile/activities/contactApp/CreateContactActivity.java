package mobile.activities.contactApp;


import mobile.controls.Button;
import mobile.controls.Textbox;
import org.openqa.selenium.By;

public class CreateContactActivity {
    public Textbox name=new Textbox(By.xpath("//android.widget.EditText[@text='First name']"));
    public Textbox phone= new Textbox(By.xpath("//android.widget.EditText[@text='Phone']"));

    public Button save= new Button(By.xpath("//android.widget.Button[@text='Save']"));

}

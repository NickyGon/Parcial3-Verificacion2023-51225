package mobile.activities.whenDoApp;


import mobile.controls.Button;
import mobile.controls.Label;
import org.openqa.selenium.By;

public class MainActivity {
    public Button addButton= new Button(By.id("com.vrproductiveapps.whendo:id/fab"));

    public Label task= new Label(By.xpath("((//android.widget.TextView[@text='Skillzy']//parent::node()//parent::node())[1])[last()]"));

    public void setTask(String name){
        task= new Label(By.xpath("((//android.widget.TextView[@text='"+name+"']//parent::node()//parent::node())[1])[last()]"));
    }

}

package mobile.activities.contactApp;

import mobile.controls.Button;
import mobile.controls.Label;
import mobile.controls.Textbox;
import org.openqa.selenium.By;

public class MainActivity {

    public Button contactButton=new Button(By.xpath("//android.widget.FrameLayout[@content-desc=\"Contacts\"]"));
    public Button createButton= new Button(By.xpath("//android.widget.LinearLayout//android.widget.TextView[@text='Create new contact']"));

    public Textbox search= new Textbox(By.xpath("//android.widget.EditText[contains(@text,'Search')]"));
    public Label contactCard= new Label(By.xpath("(//android.widget.TextView[contains(@text,'Nicknoo')])[last()]"));

    public Label phoneCard=new Label(By.xpath("(//android.widget.TextView[contains(@text,'Mobile')])[last()]"));


    public Label cardContact= new Label(By.xpath("//androidx.cardview.widget.CardView//android.widget.TextView[contains(@text,\"Azucena\")]//following-sibling::android.widget.TextView[contains(@text,\"77750001\")]//parent::node()"));

    public void setLabel(String name,String phone){
        contactCard= new Label(By.xpath("(//androidx.cardview.widget.CardView//android.widget.TextView[contains(@text,'"+name+"')])[last()]"));
        phoneCard= new Label(By.xpath("(//androidx.cardview.widget.CardView//android.widget.TextView[contains(@text,'Mobile') and contains(@text,'"+phone+"')])[last()]"));
        cardContact= new Label(By.xpath("(//androidx.cardview.widget.CardView//android.widget.TextView[contains(@text,'"+name+"')]//following-sibling::android.widget.TextView[contains(@text,'"+phone+"')]//parent::node())[last()]"));
    }

}

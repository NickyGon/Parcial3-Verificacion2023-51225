package mobile.activities.calculatorApp;


import mobile.controls.Button;
import mobile.controls.Label;
import org.openqa.selenium.By;

public class MainActivity {

    public Label mainFrame= new Label(By.xpath("/hierarchy/android.widget.FrameLayout"));
    public Button fourButton= new Button(By.id("com.miui.calculator:id/btn_4_s"));
    public Button addButton= new Button(By.id("com.miui.calculator:id/btn_plus_s"));
    public Button threeButton= new Button(By.id("com.miui.calculator:id/btn_3_s"));
    public Button equalButton= new Button(By.id("com.miui.calculator:id/btn_equal_s"));

    public Label resultLabel= new Label(By.id("com.miui.calculator:id/result"));
}

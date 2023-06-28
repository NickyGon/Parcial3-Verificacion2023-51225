package tests.mobileTest;

import mobile.activities.whenDoApp.DialogSection;
import mobile.activities.whenDoApp.MainActivity;
import mobile.activities.whenDoApp.TaskActivity;
import mobile.session.Session;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class WhenDoTest {

    MainActivity mainActivity= new MainActivity();
    TaskActivity taskActivity= new TaskActivity();
    DialogSection dialogSection= new DialogSection();

    @Test
    public void verifyAdditionTest() throws InterruptedException {
        String taskName="Task"+new Date().getTime();
        String newTaskName="Tasker"+new Date().getTime();
        mainActivity.addButton.click();
        Thread.sleep(500);
        taskActivity.nameTextBox.setText(taskName);
        mainActivity.setTask(taskName);
        Thread.sleep(500);
        taskActivity.saveButton.click();


        Assertions.assertTrue(mainActivity.task.isControlDisplayed(),
                "ERROR! Task not created");

        Thread.sleep(500);

        mainActivity.task.click();
        Thread.sleep(500);
        taskActivity.nameTextBox.clearSetText(newTaskName);
        mainActivity.setTask(newTaskName);
        Thread.sleep(500);
        taskActivity.saveButton.click();

        Assertions.assertTrue(mainActivity.task.isControlDisplayed(),
                "ERROR! Task not updated");

        Thread.sleep(500);

        mainActivity.task.click();
        Thread.sleep(500);
        taskActivity.deleteButton.click();

        dialogSection.accept.click();

        Assertions.assertFalse(mainActivity.task.isControlDisplayed(),
                "ERROR! Task not deleted");

        Thread.sleep(500);

    }

    @AfterEach
    public void close(){
        Session.getSession().closeSession();
    }
}

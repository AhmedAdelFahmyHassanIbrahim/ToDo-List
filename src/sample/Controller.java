package sample;

import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    public DatePicker datepicker;
    public TextField task;
    public TextArea alltask;


    public void buttonclicked()
    {



        alltask.appendText("" + datepicker.getValue() + "\t" + task.getText() + "\n" );
    }
}

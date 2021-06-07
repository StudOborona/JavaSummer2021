package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.JUnitCore;

import javax.xml.transform.Result;
import java.awt.event.ActionEvent;

public class Controller {

    @FXML
    private Button btt;

    @FXML
    private Label outpt;

    @FXML
    private TextField text_here;

    @FXML
    void continu(ActionEvent event) {

        int n = Integer.parseInt(text_here.getText().toString());
        System.out.println(n);
        double res = 1;
        for(int i=2; i<=n; i++)
        {
            res =res+ 1/i;
            i++;
        }
        System.out.println(res);
        String total2 = String.valueOf(res);
        outpt.setText(total2);
    }

    @Test
    public void continu(javafx.event.ActionEvent actionEvent) {

        //Result result = (Result) JUnitCore.runClasses(TestJunit.class);

        int n = Integer.parseInt(text_here.getText().toString());
        System.out.println(n);
        double res = 1;
        for(int i=2; i<=n; i++)
        {

            res =res+2*i-1;
        }
        System.out.println(res);
        String total2 = String.valueOf(res);
        outpt.setText(total2);

        int da = (int) res;
        Assert.assertEquals(da,25);
        Assert.assertEquals(da,9);
        Assert.assertEquals(da,1);
    }
}

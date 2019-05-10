package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import mathOperation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.text.AbstractDocument;

public class ViewController {
    @FXML
    private TextField inputNumber1;

    @FXML
    private TextField inputNumber2;

    @FXML
    private TextField outputField;

    @Autowired
    Addition addition;

    @Autowired
    Division division;

    @Autowired
    Multiplication multiplication;

    @Autowired
    Subtraction subtraction;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("Work!");

        // вытянуть данные
        try {
            float number1 = Float.valueOf(inputNumber1.getText().trim()).floatValue();
            float number2 = Float.valueOf(inputNumber2.getText().trim()).floatValue();

            // испольщовать Autowired как-то не срослось
            ApplicationContext context =
                    new AnnotationConfigApplicationContext("mathOperation");
            MathOperation mathOperation = (MathOperation) context.getBean(((Button)event.getSource()).getText().toLowerCase());

            outputField.setText(String.valueOf(mathOperation.oparate(number1,number2)));
        } catch (NumberFormatException ex) {
            outputField.setText("Invalid numbers");
        }
        //inputNumber1.setText("");
        //inputNumber2.setText("");
    }
}

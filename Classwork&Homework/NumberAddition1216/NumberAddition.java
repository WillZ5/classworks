import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberAddition {
    private JTextField textField1;
    private JPanel panel1;
    private JTextField textField2;
    private JButton addButton;
    private JButton clearButton;
    private JButton quitButton;
    private JLabel Result;
    private JButton subtractionButton;
    private JButton multiplicationButton;
    private JButton divisionButton;
    private JComboBox comboBox1;

    public NumberAddition() {
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                Result.setText("");
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1, num2, result;
                num1 = Float.parseFloat(textField1.getText());
                num2 = Float.parseFloat(textField2.getText());
                result = num1+num2;
                Result.setText(String.valueOf(result));
            }
        });
        subtractionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1, num2, result;
                num1 = Float.parseFloat(textField1.getText());
                num2 = Float.parseFloat(textField2.getText());
                result = num1-num2;
                Result.setText(String.valueOf(result));
            }
        });
        multiplicationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1, num2, result;
                num1 = Float.parseFloat(textField1.getText());
                num2 = Float.parseFloat(textField2.getText());
                result = num1*num2;
                Result.setText(String.valueOf(result));
            }
        });
        divisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1, num2, result;
                num1 = Float.parseFloat(textField1.getText());
                num2 = Float.parseFloat(textField2.getText());
                result = num1/num2;
                Result.setText(String.valueOf(result));
            }
        });
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selection = comboBox1.getSelectedItem()+"";
                if (selection.equals("Addition")){
                    float num1, num2, result;
                    num1 = Float.parseFloat(textField1.getText());
                    num2 = Float.parseFloat(textField2.getText());
                    result = num1+num2;
                    Result.setText(String.valueOf(result));
                }else if(selection.equals("Subtraction")) {
                    float num1, num2, result;
                    num1 = Float.parseFloat(textField1.getText());
                    num2 = Float.parseFloat(textField2.getText());
                    result = num1 - num2;
                    Result.setText(String.valueOf(result));
                }else if(selection.equals("Multiplication")){
                    float num1, num2, result;
                    num1 = Float.parseFloat(textField1.getText());
                    num2 = Float.parseFloat(textField2.getText());
                    result = num1*num2;
                    Result.setText(String.valueOf(result));
                }else if(selection.equals("Division")){
                    float num1, num2, result;
                    num1 = Float.parseFloat(textField1.getText());
                    num2 = Float.parseFloat(textField2.getText());
                    result = num1/num2;
                    Result.setText(String.valueOf(result));
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame app = new JFrame();
        app.setContentPane(new NumberAddition().panel1);
        app.setSize(800,600);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}

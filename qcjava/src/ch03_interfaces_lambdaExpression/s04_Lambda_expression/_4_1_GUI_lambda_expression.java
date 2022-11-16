package ch03_interfaces_lambdaExpression.s04_Lambda_expression;

import javax.swing.*;
import java.awt.*;

public class _4_1_GUI_lambda_expression {
    public static void main(String[] args) {
        //If we don't use event queue, it's still ok
        EventQueue.invokeLater(//call a new runnable
                () -> {
                    var frame = new JFrame();
                    var button = new JButton("Click me!");
                    button.addActionListener(event -> System.out.println("Thanks for clicking"));
                    frame.add(button);
                    frame.pack();
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                }
        );

    }
}

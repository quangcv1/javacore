package ch03_interfaces_lambdaExpression.s03_Interfaces_examples;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @usecase: in a GUI, u have to specify actions to be carried out when the user clicks a button, selects a menu option, drags a slider, and so on. These actions are often called callbacks because some code gets called back when a user action occurs.
 * @GUI-lib: interfaces are used for callbacks. Ex: in the Swing lib, the following interface is used for reporting events - Actionlistener
 * @code:
 * <pre>
 * public interface ActionListener {
 *     void actionPerformed(ActionEvent event);
 * }
 * </pre>
 */
class ClickAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Thanks for clicking");
    }
}
public class _3_4_User_interface_callbacks {
    public static void main(String[] args) {
        var frame = new JFrame();
        var button = new JButton("Click me!");
        button.addActionListener(new ClickAction());
        frame.add(button);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

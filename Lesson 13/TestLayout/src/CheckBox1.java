import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBox1 implements ItemListener{

    JCheckBox check;

    public static void main(String[] args){
        CheckBox1 gui = new CheckBox1();
        gui.go();
    }

    public void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        check = new JCheckBox("Goes to l1");
        check.addItemListener(this);
        check.setSelected(false);


        panel.add(check);

        frame.getContentPane().add(BorderLayout.NORTH, check);


        frame.setSize(350,350);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void itemStateChanged(ItemEvent ev){
        String omOrOff = "off";
        if (check.isSelected()) omOrOff = "on";
        System.out.println("Check box is " + omOrOff);
    }
}

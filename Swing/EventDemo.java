package Swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import java.awt.*;
import java.awt.event.*;

public class EventDemo {
    JLabel jlab;
    
    EventDemo(){
        JFrame jframe = new JFrame("An Event Example");
        jframe.setLayout(new FlowLayout());

        jframe.setSize(220, 100);

        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jbtnAlpha = new JButton("Alpha");

        JButton jbtnBeta = new JButton("Beta");

        jbtnAlpha.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                jlab.setText("Alpha was pressed");
            }
        });

        jbtnBeta.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                jlab.setText("Beta was pressed");
            }
        });

        jframe.add(jbtnAlpha);
        jframe.add(jbtnBeta);

        jlab = new JLabel("Press a Button");

        jframe.add(jlab);

        jframe.setVisible(true);

       

    }
     public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run(){
                    new EventDemo();
                }
            });
        }
}

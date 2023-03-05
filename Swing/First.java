package Swing;

//first swing program
import javax.swing.*;
public class First{
    First(){
        JFrame jfrm = new JFrame("A simple swing application");
        jfrm.setSize(275, 100);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jlab = new JLabel("Swing means powerful GUI");
        jfrm.add(jlab);
        jfrm.setVisible(true);
    }
    public static void main(String[] args) {
        new First();
    }
}

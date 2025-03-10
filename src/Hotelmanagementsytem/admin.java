package Hotelmanagementsytem;

import javax.swing.*;
import java.awt.*;

public class admin extends JFrame {
    admin(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(280,5,1238,820);
        panel.setBackground(new Color(3 , 45 , 48));
        add(panel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,5,270,820);
        panel1.setBackground(new Color(3 , 45 , 48));
        add(panel1);

        setSize(1950,1098);
        setLayout(null);
        setVisible(true);


        JButton button1 = new JButton("New Room");
        button1.setBounds(30 , 30 , 230 ,90);
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
        panel1.add(button1);

        JButton button2 = new JButton("New Room");
        button2.setBounds(30 , 200 , 230 ,90);
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.WHITE);
        panel1.add(button2);

        JButton button3 = new JButton("New Room");
        button3.setBounds(30 , 400 , 230 ,90);
        button3.setBackground(Color.BLACK);
        button3.setForeground(Color.WHITE);
        panel1.add(button3);



    }
     public static void main (String[] args){
         new admin();
     }
}

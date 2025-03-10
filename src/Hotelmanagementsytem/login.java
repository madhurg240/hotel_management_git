package Hotelmanagementsytem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class login extends JFrame {

    JTextField username;
    JPasswordField password;

    login() {

        getContentPane().setBackground(new Color(3 , 125 , 98));
        setLayout(null);
       setSize(600, 300);
       setVisible(true);
       setLocation(480, 270);

       JLabel l1 = new JLabel("Username");
       l1.setBounds(40 , 20 , 100 , 30);
       l1.setFont(new Font("Times New Roman", Font.BOLD, 20));
       add(l1);

        JLabel l2 = new JLabel("Password");
        l2.setBounds(40 , 20 , 100 , 120);
        l2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(l2);

        JTextField username = new JTextField();
        username.setBounds(130, 20 , 160 , 30);
        username.setFont(new Font("Times New Roman", Font.BOLD, 20));
        username.setForeground(Color.black);
        add(username);

        JPasswordField password = new JPasswordField();
        password.setBounds(130, 70 , 160 , 30);
        password.setFont(new Font("Times New Roman", Font.BOLD, 20));
        password.setForeground(Color.black);
        add(password);

        JButton login = new JButton("Login");
        login.setBounds(100, 130 , 100 , 30);
        login.setFont(new Font("Times New Roman", Font.BOLD, 20));
        login.setForeground(Color.white);
        login.setBackground(Color.black);
        add(login);

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == login)
                try{
                    con c = new con();
                    String u = username.getText();
                    String p = new String(password.getPassword());
                    String q = "select * from login where username= '"+u+"' and password= '"+p+"'";
                    ResultSet resultSet = c.statement.executeQuery(q);
                    if(resultSet.next())
                    {

                        JOptionPane.showMessageDialog(null, "Welcome "+u);
                        setVisible(false);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Wrong username or password");
                    }
                }

                catch(Exception E){
                    E.printStackTrace();
                }
            }

        });



        JButton cancel = new JButton("Cancel");
        cancel.setBounds(220, 130 , 100 , 30);
        cancel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        cancel.setForeground(Color.white);
        cancel.setBackground(Color.black);
        add(cancel);


    }

        public static void main(String []args){

        new login();
    }
}

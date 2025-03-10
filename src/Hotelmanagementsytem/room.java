package Hotelmanagementsytem;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class room extends JFrame {
    JTable table;
    room(){

        JPanel panel = new JPanel();
        panel.setBounds(5 , 5 , 890 , 590);
        panel.setBackground(new Color(3 , 45 , 48));
        panel.setLayout(null);
        add(panel);

        setLayout(null);
        setLocation(500 , 100);
         setSize(900,600);
         setVisible(true);

         table = new JTable();
         table.setBounds(10 , 40 , 500 , 400);
         table.setBackground(new Color(3 , 45 , 48));
         table.setForeground(Color.WHITE);
         panel.add(table);

         try{
             con c = new con();
             String roominfo = "select * from room";
             ResultSet resultSet = c.statement.executeQuery(roominfo);
             table.setModel(DbUtils.resultSetToTableModel(resultSet));
         }
         catch(Exception e){
             e.printStackTrace();
         }
    }

    public static void main(String[] args) {
        new room();
    }
}


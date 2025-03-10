package Hotelmanagementsytem;

import javax.swing.*;

public class splash extends JFrame
{


    splash(){
        setLayout(null);
        setSize(858,680);
        setVisible(true);
        setLocation(300,80);
        try {
            Thread.sleep(5000);
            new login();
            setVisible(false);
        }
        catch (Exception e){
          e.printStackTrace();

        }


    }
public static void main(String []args){

        new splash();
}
}

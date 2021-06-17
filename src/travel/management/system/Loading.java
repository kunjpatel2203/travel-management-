package travel.management.system;

import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame implements Runnable{
    
    JProgressBar p1;
    Thread t;
    String username;
    
    public void run(){
        try{
            for(int i = 1; i <= 101; i++){
                int m = p1.getMaximum();
                int n = p1.getValue();
                if(n < m){
                    p1.setValue(p1.getValue() + 1);
                }else{
                    i = 101;
                    setVisible(false);
                    new Dashboard(username).setVisible(true);
                }
                Thread.sleep(50);
            }
        }catch(Exception e){
            
        }
    }
    Loading(String user){
        
        t = new Thread(this);
        
        username = user;
        
        setBounds(480, 180, 550, 380);
        setLayout(null);
        
        JLabel l1 = new JLabel("Patel Travel And Tourism");
        l1.setBounds(100, 20, 550, 40);
        l1.setFont(new Font("Raleway", Font.BOLD, 30));
        l1.setForeground(Color.BLUE);
        add(l1);
        
        p1= new JProgressBar();
        p1.setBounds(120, 130, 300, 25);
        p1.setStringPainted(true);
        add(p1);
        
        JLabel l2 = new JLabel("Please Wait....");
        l2.setBounds(220, 160, 550, 25);
        l2.setFont(new Font("Tahoma", Font.BOLD, 14));
        l2.setForeground(Color.RED);
        add(l2);
        
        JLabel l3 = new JLabel("Welcome " + username);
        l3.setBounds(20, 300, 150, 30);
        l3.setFont(new Font("Raleway", Font.BOLD, 14));
        l3.setForeground(Color.BLUE);
        add(l3);
        
        t.start();
    }
    
    public static void main(String[] args){
        new Loading("").setVisible(true);
    }
}

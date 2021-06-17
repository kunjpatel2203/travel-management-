package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15;
    String username;
    
    Dashboard(String username){
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
//        setBounds(0, 0, 1920, 1080);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setBounds(0, 0, 1920, 60);
        p1.setBackground(new Color(0,0, 102));
        p1.setLayout(null);
        add(p1);
        
        JLabel l2 = new JLabel("DashBoard");
        l2.setFont(new Font("Tahoma", Font.BOLD, 30));
        l2.setForeground(Color.white);
        l2.setBounds(50, 10, 300, 40);
        p1.add(l2);
        
        JPanel p2 = new JPanel();
        p2.setBounds(0, 60, 300, 1080);
        p2.setBackground(new Color(0,0, 102));
        p2.setLayout(null);
        add(p2);
        
        b1 = new JButton("Add Personal  Details");
        b1.setBounds(0, 0, 300, 40);
        b1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b1.setBackground(new Color(0,0, 102));
        b1.setForeground(Color.WHITE);
        b1.setMargin(new Insets(0, 0, 0, 60));
        b1.addActionListener(this);
        p2.add(b1);
        
        b2 = new JButton("UPdate Personal  Details");
        b2.setBounds(0, 40, 300, 40);
        b2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b2.setBackground(new Color(0,0, 102));
        b2.setForeground(Color.WHITE);
        b2.setMargin(new Insets(0, 0, 0, 30));
        b2.addActionListener(this);
        p2.add(b2);
        
        b3 = new JButton("View Details");
        b3.setBounds(0, 80, 300, 40);
        b3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b3.setBackground(new Color(0,0, 102));
        b3.setForeground(Color.WHITE);
        b3.setMargin(new Insets(0, 0, 0, 130));
        b3.addActionListener(this);
        p2.add(b3);
        
        b4 = new JButton("Delete Personal Details");
        b4.setBounds(0, 120, 300, 40);
        b4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b4.setBackground(new Color(0,0, 102));
        b4.setForeground(Color.WHITE);
        b4.setMargin(new Insets(0, 0, 0, 35));
        b4.addActionListener(this);
        p2.add(b4);
        
        b5 = new JButton("Check Package");
        b5.setBounds(0, 160, 300, 40);
        b5.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b5.setBackground(new Color(0,0, 102));
        b5.setForeground(Color.WHITE);
        b5.setMargin(new Insets(0, 0, 0, 105));
        b5.addActionListener(this);
        p2.add(b5);
        
        b6 = new JButton("Book Pakage");
        b6.setBounds(0, 200, 300, 40);
        b6.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b6.setBackground(new Color(0,0, 102));
        b6.setForeground(Color.WHITE);
        b6.setMargin(new Insets(0, 0, 0, 120));
        b6.addActionListener(this);
        p2.add(b6);
        
        b7 = new JButton("View Package");
        b7.setBounds(0, 240, 300, 40);
        b7.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b7.setBackground(new Color(0,0, 102));
        b7.setForeground(Color.WHITE);
        b7.setMargin(new Insets(0, 0, 0, 110));
        b7.addActionListener(this);
        p2.add(b7);
        
        b8 = new JButton("View Hotel");
        b8.setBounds(0, 280, 300, 40);
        b8.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b8.setBackground(new Color(0,0, 102));
        b8.setForeground(Color.WHITE);
        b8.setMargin(new Insets(0, 0, 0, 135));
        b8.addActionListener(this);
        p2.add(b8);
        
        b9 = new JButton("Book Hotel");
        b9.setBounds(0, 320, 300, 40);
        b9.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b9.setBackground(new Color(0,0, 102));
        b9.setForeground(Color.WHITE);
        b9.setMargin(new Insets(0, 0, 0, 130));
        b9.addActionListener(this);
        p2.add(b9);
        
        b10 = new JButton("View Booked Hotel");
        b10.setBounds(0, 360, 300, 40);
        b10.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b10.setBackground(new Color(0,0, 102));
        b10.setForeground(Color.WHITE);
        b10.setMargin(new Insets(0, 0, 0, 60));
        b10.addActionListener(this);
        p2.add(b10);
        
        b11 = new JButton("Destination");
        b11.setBounds(0,400, 300, 40);
        b11.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b11.setBackground(new Color(0,0, 102));
        b11.setForeground(Color.WHITE);
        b11.setMargin(new Insets(0, 0, 0, 125));
        b11.addActionListener(this);
        p2.add(b11);
        
        b12 = new JButton("Payment");
        b12.setBounds(0, 440, 300, 40);
        b12.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b12.setBackground(new Color(0,0, 102));
        b12.setForeground(Color.WHITE);
        b12.setMargin(new Insets(0, 0, 0, 144));
        b12.addActionListener(this);
        p2.add(b12);
        
        b13 = new JButton("Calculator");
        b13.setBounds(0, 480, 300, 40);
        b13.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b13.setBackground(new Color(0,0, 102));
        b13.setForeground(Color.WHITE);
        b13.setMargin(new Insets(0, 0, 0, 135));
        b13.addActionListener(this);
        p2.add(b13);
        
        b14 = new JButton("Notepad");
        b14.setBounds(0, 520, 300, 40);
        b14.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b14.setBackground(new Color(0,0, 102));
        b14.setForeground(Color.WHITE);
        b14.setMargin(new Insets(0, 0, 0, 145));
        b14.addActionListener(this);
        p2.add(b14);
        
        b15 = new JButton("About");
        b15.setBounds(0, 560, 300, 40);
        b15.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b15.setBackground(new Color(0,0, 102));
        b15.setForeground(Color.WHITE);
        b15.setMargin(new Insets(0, 0, 0, 165));
        b15.addActionListener(this);
        p2.add(b15);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1920, 1080, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1920, 1080);
        add(l1);
        
        JLabel l3 = new JLabel("Patel Travel And Tourism");
        l3.setBounds(700, 90, 1080, 40);
        l3.setFont(new Font("Tahoma", Font.ITALIC, 40));
        l1.add(l3);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b13){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){  }
        }else if(ae.getSource() == b14){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){    }
        }else if(ae.getSource() == b1){
            new Addcustomer(username).setVisible(true);
        }else if(ae.getSource() == b2){
            new Updatecustomer(username).setVisible(true);
        }
    }
    
    public static void main(String[] args){
        new Dashboard("").setVisible(true);
    }
}

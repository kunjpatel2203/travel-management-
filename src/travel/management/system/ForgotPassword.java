package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ForgotPassword extends JFrame implements ActionListener{
    
    JTextField t1, t2, t3, t4, t5;
    JLabel l1, l2, l3, l4, l5;
    JButton b1, b2, b3;
    
    ForgotPassword(){
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/forgotpassword.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel l6 = new JLabel(i3);
        l6.setBounds(490, 60, 200, 200);
        l6.setLayout(null);
        add(l6);
        
        JPanel p1 =  new JPanel();
        p1.setBounds(30, 30, 450, 280);
        p1.setLayout(null);
        add(p1);
        
        l1 = new JLabel("Username");
        l1.setBounds(20, 20, 100, 25);
        l1.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(l1);
        
        t1 = new JTextField();
        t1.setBounds(185, 20, 150, 25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t1);
        
        b1 = new JButton("Search");
        b1.setBounds(340, 20, 100, 25);
        b1.setBackground(Color.gray);
        b1.setFont(new Font("Tahoma", Font.BOLD, 14));
        b1.addActionListener(this);
        p1.add(b1);
        
        l2 = new JLabel("Name");
        l2.setBounds(20, 60, 100, 25);
        l2.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(l2);
        
        t2 = new JTextField();
        t2.setBounds(185, 60, 150, 25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t2);
        
        l3 = new JLabel("Your Security Question");
        l3.setBounds(20, 100, 170, 25);
        l3.setFont(new Font("Tahoma", Font.BOLD, 13));
        p1.add(l3);
        
        t3 = new JTextField();
        t3.setBounds(185, 100, 200, 25);
        t3.setBorder(BorderFactory.createEmptyBorder()); 
        p1.add(t3);
        
        l4 = new JLabel("Answer");
        l4.setBounds(20, 140, 170, 25);
        l4.setFont(new Font("Tahoma", Font.BOLD, 13));
        p1.add(l4);
        
        t4 = new JTextField();
        t4.setBounds(185, 140, 150, 25);
        t4.setBorder(BorderFactory.createEmptyBorder()); 
        p1.add(t4);
        
        b2 = new JButton("Retrieve");
        b2.setBounds(340, 140, 100, 25);
        b2.setBackground(Color.gray);
        b2.setFont(new Font("Tahoma", Font.BOLD, 14));
        b2.addActionListener(this);
        p1.add(b2);
        
        l5 = new JLabel("Password");
        l5.setBounds(20, 180, 170, 25);
        l5.setFont(new Font("Tahoma", Font.BOLD, 13));
        p1.add(l5);
        
        t5 = new JTextField();
        t5.setBounds(185, 180, 150, 25);
        t5.setBorder(BorderFactory.createEmptyBorder()); 
        p1.add(t5);
        
        
        b3 = new JButton("Back");
        b3.setBounds(170, 230, 100, 25);
        b3.setBackground(Color.gray);
        b3.setFont(new Font("Tahoma", Font.BOLD, 14));
        b3.addActionListener(this);
        p1.add(b3);
        
        
        

        getContentPane().setBackground(Color.white);
        setBounds(450, 150, 730, 370);
        setLayout(null);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        Conn c = new Conn();
        if(ae.getSource() == b1){
            try{
                String Sql = "select * from account where username = '"+t1.getText()+"'";
                ResultSet rs = c.s.executeQuery(Sql);
                while(rs.next()){
                    t2.setText(rs.getString("name"));
                    t3.setText(rs.getString("security"));
                }
            }catch(Exception e){
                
            }
        }else if(ae.getSource() == b2){
             try{
                String Sql = "select * from account where answer = '"+t4.getText()+"' AND username = '"+t1.getText()+"'";
                ResultSet rs = c.s.executeQuery(Sql);
                while(rs.next()){
                    t5.setText(rs.getString("password"));
                }
            }catch(Exception e){
                
            }
        }else if(ae.getSource() == b3){
            new Login().setVisible(true);
            this.setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new ForgotPassword().setVisible(true);
    }
}

package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Addcustomer extends JFrame implements ActionListener{
    
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;
    JTextField t1, t2, t3, t4, t5, t6, t7;
    JComboBox c1;
    JRadioButton r1, r2;
    JButton b1, b2;
    
    Addcustomer(String username){
        setBounds(550, 190,700, 500);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        l1 = new JLabel("Username");
        l1.setBounds(30, 30, 150, 25);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(l1);
        
        t1 = new JTextField();
        t1.setBounds(200, 30, 150, 25);
        t1.addActionListener(this);
        add(t1);
        
        l2 = new JLabel("ID");
        l2.setBounds(30, 75, 150, 25);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(l2);
        
        c1 = new JComboBox(new String[] {"Passport", "Aadhar Card", "Pan Card", "Ration Card"});
        c1.setBounds(200, 75, 150, 25);
        c1.addActionListener(this);
        add(c1);
        
        l3 = new JLabel("Number");
        l3.setBounds(30, 120, 150, 25);
        l3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(l3);
        
        t2 = new JTextField();
        t2.setBounds(200, 120, 150, 25);
        t2.addActionListener(this);
        add(t2);
        
        l4 = new JLabel("Name");
        l4.setBounds(30, 165, 150, 25);
        l4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(l4);
        
        t3 = new JTextField();
        t3.setBounds(200, 165, 150, 25);
        t3.addActionListener(this);
        add(t3);
        
        l5 = new JLabel("Gender");
        l5.setBounds(30, 210, 150, 25);
        l5.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(l5);
        
        r1 = new JRadioButton("Male");
        r1.setBounds(200, 210, 70, 25);
        r1.setBackground(Color.white);
        r1.addActionListener(this);
        add(r1); 
        
        r2 = new JRadioButton("Female");
        r2.setBounds(280, 210, 70, 25);
        r2.setBackground(Color.white);
        r1.addActionListener(this);
        add(r2);
        
        l6 = new JLabel("Country");
        l6.setBounds(30, 255, 150, 25);
        l6.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(l6);
        
        t4 = new JTextField();
        t4.setBounds(200, 255, 150, 25);
        t4.addActionListener(this);
        add(t4);
        
        l7 = new JLabel("Address");
        l7.setBounds(30, 300, 150, 25);
        l7.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(l7);
        
        t5 = new JTextField();
        t5.setBounds(200, 300, 150, 25);
        t5.addActionListener(this);
        add(t5);
        
        l8 = new JLabel("Phone");
        l8.setBounds(30, 345, 150, 25);
        l8.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(l8);
        
        t6 = new JTextField();
        t6.setBounds(200, 345, 150, 25);
        t6.addActionListener(this);
        add(t6);
        
        l9 = new JLabel("Email");
        l9.setBounds(30, 390, 150, 25);
        l9.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(l9);
        
        t7 = new JTextField();
        t7.setBounds(200, 390, 150, 25);
        t7.addActionListener(this);
        add(t7);
        
        b1 = new JButton("Add");
        b1.setBounds(80, 430, 100, 25);
        b1.setForeground(Color.white);
        b1.setBackground(Color.black);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Back");
        b2.setBounds(200, 430, 100, 25);
        b2.setForeground(Color.white);
        b2.setBackground(Color.black);
        b2.addActionListener(this);
        add(b2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/newcustomer.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l10 = new JLabel(i3);
        l10.setBounds(350, 40, 400, 400);
        add(l10);
        
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from account where username = '"+username+"'");
            while(rs.next()){
                t1.setText(rs.getString("username"));
                t3.setText(rs.getString("name"));
            }
        }catch(Exception e){
           e.printStackTrace();
        }

    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            String username = t1.getText();
            String id = (String)c1.getSelectedItem();
            String number = t2.getText();
            String name = t3.getText();
            String radio = null;
            if(r1.isSelected()){
                radio = "Male";
            }else if(r2.isSelected()){
                radio = "Female";
            }
            String country = t4.getText();
            String address = t5.getText();
            String phone = t6.getText();
            String email = t7.getText();

            String q = "insert into cuctomer values('"+username+"', '"+id+"', '"+number+"', '"+name+"', '"+radio+"', '"+country+"', '"+address+"', '"+phone+"', '"+email+"')";
            try{
                Conn c = new Conn();
                c.s.executeUpdate(q);
                
                JOptionPane.showMessageDialog(null, "Customer Details Added Successfully ");
                this.setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource() == b2){
            this.setVisible(false);
        }
        
    }
    
    public static void main(String[] args){
        new Addcustomer("").setVisible(true);
    }
}

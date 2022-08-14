import java.awt.event.*;
import java.awt.*;
//import Customer.CustomerPage;

import javax.swing.*;
public class HomePage extends JFrame implements ActionListener{
    private JButton button_customer;
    private JButton button_Admin;
    //private CustomerPage customer;
    HomePage(){
        JLabel label = new JLabel();
        ImageIcon bgm = new ImageIcon("bg_image.png");
        button_customer = new JButton("Customer");
        button_Admin = new JButton("Admin");

        button_customer.setBounds(400,690, 100, 50);
        button_Admin.setBounds(800, 690, 100, 50);
        button_customer.addActionListener(this);
        button_Admin.addActionListener(this);
        
        ImageIcon bgImage = new ImageIcon("bg_image.png");
        label.setIcon(bgImage);
        label.setOpaque(false);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setLayout(null);
        label.setBounds(60,40 ,1200, 800);

        this.setTitle("IchiraKu Raman Shop");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1200,800);
        this.setLayout(null);
        this.add(label);
        this.add(button_customer);
        this.add(button_Admin);
        //customer = new CustomerPage(false);

    }
      public void actionPerformed(ActionEvent ae) {
            if(ae.getSource()==button_customer){
                System.out.println("Start");
            }else if(ae.getSource()==button_Admin){
                
                this.setVisible(false);
            }
        } 

    public static void main(String[] args){
        HomePage home = new HomePage();
        
}
}

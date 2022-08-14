import java.awt.event.*;
import java.awt.*;
//import Customer.CustomerPage;

import javax.swing.*;
public class Gui extends JFrame implements ActionListener{
    private JPanel homePage ;
    private JPanel customer ;
    private JButton button_customer ;
    private JButton button_Admin;
    Gui(){
        this.setTitle("IchiraKu Raman Shop");
        this.setVisible(true);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setSize(1200,800);
        this.setLayout(null);

        homePage = new JPanel();
        JLabel label = new JLabel();
        ImageIcon bgm = new ImageIcon("bg_image.png");
        button_customer = new JButton("Customer");
        button_Admin = new JButton("Admin");
        button_Admin.setFocusable(true);

        button_customer.setBounds(400,690, 100, 50);
        button_Admin.setBounds(800, 690, 100, 50);
        button_customer.addActionListener(this);
        button_Admin.addActionListener(this);
        
        ImageIcon bgImage = new ImageIcon("bg_image.png");
        label.setIcon(bgImage);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setLayout(null);
        label.setBounds(60,40 ,1200, 800);

        homePage.add(label);
        homePage.add(button_Admin);
        homePage.add(button_customer);
        homePage.setBounds(0,0,1200,800);
        homePage.setLayout(null);
        homePage.setVisible(true);

        

        this.add(homePage);
        this.add(customer);


    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==button_customer){
            homePage.setVisible(false);
        }
        else if(ae.getSource()==button_Admin){
            System.out.println("Start");
        }
    } 
    public static void main(String[] args){
        Gui obj = new Gui();
    }
}

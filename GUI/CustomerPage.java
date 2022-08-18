import javax.swing.JFrame;
import javax.swing.UIDefaults.LazyValue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CustomerPage extends JFrame implements ActionListener{
    private JPanel panel ;
    private JLabel label ;
    private JButton back_button ;
    private HomePage homepage ;

    
    CustomerPage(HomePage homepage){
        ImageIcon back_button_icon = new ImageIcon("rsz_back_button.png");
        this.homepage = homepage;

        back_button = new JButton();
        back_button.setBackground(new Color(126,130,192));
        back_button.setBounds(0, 0, 50, 50);
        back_button.setIcon(back_button_icon);
        back_button.setForeground(Color.GRAY);
        back_button.addActionListener(this);
         
     ///************** Label ************** */ 
        label = new JLabel();
        panel = new JPanel(); ;
        label.setOpaque(false);
        label.setText("Choose Your Food");
        label.setBounds(590,0 ,1200, 50);



        panel.setBounds(0,0,1200,50);
		panel.setLayout(null);
		panel.setBackground(new Color(126,130,192));
        panel.add(back_button);
        panel.setVisible(true);

        
        /// ******* Frame *************
        this.setTitle("Customer");
        this.setLayout(null);
        this.setSize(1200,800);
        panel.add(label);

        this.setResizable(true);
        //this.setVisible();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(255,255,255));
        this.setLocationRelativeTo(null);
        this.add(panel);
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==back_button){
            homepage.setVisible(true);
            this.setVisible(false);
        }
    } 
    public static void main(String[] args){
        HomePage homepage = new HomePage();
        CustomerPage obj = new CustomerPage(homepage);
    }
}

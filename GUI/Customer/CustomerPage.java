import javax.swing.JFrame;
import javax.swing.UIDefaults.LazyValue;
import javax.swing.*;
import java.awt.*;
public class CustomerPage extends JFrame{
    private JPanel panel ;
    private JLabel label ;

    CustomerPage(){

       

        ///************** Label ************** */ 
        label = new JLabel();
        panel = new JPanel(); ;
        label.setOpaque(false);
        label.setText("Choose Your Food");
        label.setBounds(590,0 ,1200, 50);



        panel.setBounds(0,0,1200,50);
		panel.setLayout(null);
		panel.setBackground(new Color(126,130,192));

        
        /// ******* Frame *************
        this.setTitle("Customer");
        this.setLayout(null);
        this.setSize(1200,800);
        panel.add(label);

        this.setResizable(true);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(255,255,255));
        this.add(panel);
    }
    public static void main(String[] args){
        CustomerPage obj = new CustomerPage();
    }
}

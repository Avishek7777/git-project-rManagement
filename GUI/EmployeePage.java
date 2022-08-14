import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


class EmployeePage extends JFrame implements ActionListener  {
    private JLabel label;
    private JLabel labelbgm;
    private JButton login ;
    private JButton Back ;
    private JPanel loginPanel;
    private JTextField username;
    private JPasswordField password;
    private HomePage homePage ;
    EmployeePage(HomePage homePage){
        this.homePage = homePage;

        login = new JButton("Log In");
        login.setBounds(160, 240,70, 30);
        Back = new JButton("Back");
        ImageIcon backimg = new ImageIcon("rsz_back_button.png");
        Back.setBounds(0,0,50,50);
        Back.addActionListener(this);
        Back.setIcon(backimg);
       

    username = new JTextField("User Name");
    username.setLayout(null);
    username.setBounds(120,180, 150 , 30);
    password = new JPasswordField("Password");
    password.setBounds(120 ,210, 150 , 30);

    label= new JLabel();
    label.setLayout(null);
    label.setText("Enter Your User name And Password");
    label.setBounds(80, 0, 600, 50);

    labelbgm = new JLabel();
    labelbgm.setLayout(null);
    labelbgm.setBounds(140,-140, 500,500);
    ImageIcon img = new ImageIcon("login.png");
    labelbgm.setIcon(img);


    loginPanel = new JPanel();
    loginPanel.setLayout(null);
    loginPanel.setBackground(new Color(126,130,192));
    loginPanel.setBounds(400, 200, 400, 300);
    loginPanel.add(username);
    loginPanel.add(password);
    loginPanel.add(label);
    loginPanel.add(labelbgm);
    loginPanel.add(login);
    loginPanel.setVisible(true);

    this.setVisible(false);
    this.setLayout(null);
    this.setSize(1200,800);
    this.add(loginPanel);
    this.add(Back);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Back){
            homePage.setVisible(true);
            this.setVisible(false);
        }
    }
   /*  public static void main(String[] args){
        EmployeePage obj = new EmployeePage();
    }*/

}

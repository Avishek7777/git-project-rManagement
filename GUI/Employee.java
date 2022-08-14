import javax.swing.*;
import java.awt.event.*;


class EmployeePage extends JFrame implements ActionListener  {
    private JLabel label;
    private JButton back_button ;
    private JPanel loginPanel;
    EmployeePage(){
    this.setVisible(true);
    this.setLayout(null);
    this.setSize(1200,800);
    this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae) {
    } 
    public static void main(String[] args){
        EmployeePage obj = new EmployeePage();
    }

}

import java.awt.event.ActionEvent.*;
import java.awt.*;

import javax.swing.*;
public class HomePage extends JFrame {// implements ActionListener {
    private JButton button;
    HomePage(){
        JLabel label = new JLabel();
        ImageIcon bgm = new ImageIcon("bg_image.png");
        button = new JButton("START");

        button.setBounds(630,690, 100, 50);
        //button.addActionListener(this);
        
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
        this.add(button);

    }
      /*  public void actionPerformed(ActionEvent ae) {
            if(ae.getSource()==button){
                System.out.println("Start");
            }
        } */

    public static void main(String[] args){
        HomePage home = new HomePage();
        
}
}

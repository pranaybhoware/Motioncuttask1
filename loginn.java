
package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginn extends JFrame implements ActionListener {
    JTextField text ;
    JButton next , back;
    public loginn(){
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel heading = new JLabel("QUIZ TEST");
        heading.setBounds(140,60,300,45);
        heading.setFont(new Font("vinerr mand",Font.BOLD,40));
        heading.setForeground(new Color(22,99,54));
        add(heading);

        JLabel name = new JLabel("Enter your name");
        name.setBounds(100,150,300,25);
        name.setFont(new Font("mongolian Baitai",Font.BOLD,18));
        name.setForeground(new Color(22,99,54));
        add(name);

        text = new JTextField();
        text.setBounds(80,200,300,25);
        name.setFont(new Font("Times new romain",Font.BOLD,18));
//        name.setForeground(new Color(22,99,54));
        add(text);

        next = new JButton("Next");
        next.setBounds(100,270,120,25);
        next.setBackground(new Color(22,99,54));
        next.setForeground(Color.white);
        next.addActionListener(this);
        add(next);

        back = new JButton("Back");
        back.setBounds(250,270,120,25);
        back.setBackground(new Color(22,99,54));
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);

        setSize(500,500);
        setVisible(true);
        setUndecorated(true);
        setLocation(1000,150);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == next){
String name = text.getText();
setVisible(false);
new Rule(name);
        } else if (e.getSource()==back) {
          System.exit(50);
        }
    }


    public static void main(String[] args) {
        new loginn();
    }
}

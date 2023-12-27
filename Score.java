package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame {
    Score(String name , int score ){
        setSize(750,550);
        setLocation(400,150);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);

        JLabel heading = new JLabel("thank you for playing ");
        heading.setBounds(100,80,700,30);
        heading.setFont(new Font("vinerr mand",Font.BOLD,26));
//        heading.setForeground(new Color(22,99,54));
        add(heading);

        JLabel Score = new JLabel("your score is "+ score );
        Score.setBounds(100,120,700,30);
        Score.setFont(new Font("vinerr mand",Font.BOLD,26));
        Score.setForeground(new Color(22,99,54));
        add(Score);

        JButton exit  = new JButton("exit");
        exit.setBounds(380,270,120,30);
        exit.setBackground(new Color(22,99,54));
        exit.setForeground(Color.WHITE);
        add(exit);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new loginn();
            }
        });
    }
    public static void main(String[] args) {
        new Score("user",0);
    }
}
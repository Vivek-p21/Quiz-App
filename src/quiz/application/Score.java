
package quiz.application;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class Score extends JFrame implements ActionListener {
    
    Score(String name, int score){
        setBounds(600, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i1);
        image.setBounds(0, 200, 300, 450);
        add(image);
        
        
        
        JLabel heading = new JLabel("Thank you " + name + " For playing this quiz");
        heading.setBounds( 45, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(heading);
        
        JLabel Fscore = new JLabel("Your score is " + score );
        Fscore.setBounds( 350, 200, 300, 30);
        Fscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(Fscore);
        
       
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login(); 
    }
    
    public static void main(String[] args) {
        new Score("User", 0);
    }
}

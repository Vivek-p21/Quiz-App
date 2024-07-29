
package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Rules extends JFrame implements ActionListener{
    String name;
    JButton start, back;
    Rules(String name){
        this.name = name;
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to Simple Minds");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground( Color.BLUE);
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Viner Hand ITC", Font.BOLD, 16));
        rules.setText(
       "<html>"+
               "1. Only team entries are allowed, and team shall consist of two persons. ." + "<br><br>" +
"2. The decision of the quiz-master will be final and will not be subjected to any change." + "<br><br>" +
"3. The participants shall not be allowed to use mobile or other electronic instruments during" + "<br><br>" +
"4. The questions shall be in the form of multiple choice, true/false statement, specific answer" + "<br><br>" +
"5. Audience/Supporters shall not give any hints or clues to the competitors."+ "<br><br>" +
"6. Replacement of any participant of a team is not allowed after registration."+ "<br><br>" +
                "<html>"
        );
        
        add(rules);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == start){
            setVisible(false);
            new Quiz2(name);
        }
        else{
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
    
}

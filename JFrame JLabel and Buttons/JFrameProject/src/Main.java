import javax.swing.*;

import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Main {
    public static void main(String[] args) {

        /*
        JFrame frame = new JFrame();
        frame.setSize(620, 550);
        frame.setTitle("Yohannis Bet");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //frame.setResizable(false);
        frame.setVisible(true);

        ImageIcon image = new ImageIcon("C:\\Users\\Alex\\Desktop\\Sheger.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(0x123456));


        ImageIcon innerImage = new ImageIcon("C:\\Users\\Alex\\Desktop\\Sheger.png");
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel();
        label.setText("I am writing on my own frame!!!");
        label.setIcon(innerImage);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(1, 51, 3, 237));
        label.setFont(new Font("MV Boli", Font.BOLD, 30));
        label.setIconTextGap(15);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setBorder(border);
        //label.setBounds(0, 0, 250, 250);

        MyFrame mine = new MyFrame();
        mine.add(label);
        mine.addImage(innerImage);
        mine.pack();
        */

        /*
        JLabel label = new JLabel();

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 0, 250, 500);

        greenPanel.setToolTipText("Prosperous Land");

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.yellow);
        yellowPanel.setBounds(250, 0, 250, 500);
        yellowPanel.setToolTipText("Hopeful and Honest People");

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(500, 0, 250, 500);
        redPanel.setToolTipText("Glory through Blood scarification");
        redPanel.setVisible(true);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(850, 650);
        frame.setVisible(true);
        frame.add(greenPanel);
        frame.add(yellowPanel);
        frame.add(redPanel);

         */

        //MyFrame a = new MyFrame();
        MyJPanel p = new MyJPanel();



    }

}

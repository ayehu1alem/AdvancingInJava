import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());


        button = new JButton("Send...");
        button.addActionListener(this);


        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Consolas", Font.PLAIN, 25));
        textField.setForeground(new Color(0x00FF00));
        textField.setBackground(new Color(0, 0, 0));
        textField.setCaretColor(new Color(0x00FF00));
        textField.setText("Write here");

        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == button){
            System.out.println("Welcome! " + textField.getText());
            button.setEnabled(false);                   // After sending, the user no longer send the same message again
            textField.setEnabled(false);
        }
    }
}

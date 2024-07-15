import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JCheckBox checkBox;
    ImageIcon xIcon;
    ImageIcon checkIcon;

    public MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        xIcon = new ImageIcon("E:\\BoxIcon Documents\\error.png");
        checkIcon = new ImageIcon("E:\\BoxIcon Documents\\like.png");

        button = new JButton();
        button.setText("Submit...");
        button.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("I am not a robot");
        checkBox.setFocusable(true);
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 15));
        checkBox.setIcon(xIcon);
        checkBox.setSelectedIcon(checkIcon);
        checkBox.setBorderPaintedFlat(false);

        this.add(button);
        this.add(checkBox);

        this.pack();
        this.setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == button){
            System.out.println(checkBox.isSelected());
        }
    }
}

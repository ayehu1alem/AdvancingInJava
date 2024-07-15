import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJPanel extends JPanel implements ActionListener {

    private MyFrame frame;
    private JButton button;

    MyJPanel(){
        this.button = new JButton();
        button.setBounds(200, 100, 100, 50);
        button.setText("Next ... ");

        int count = 0;
        while(count < 3){
            switch(count){
                case 0 -> this.frame.add(setGreen());
                case 1 -> this.frame.add(setYellow());
                case 2 -> this.frame.add(setRed());

            }
            count++;
        }

        this.frame.add(button);
    }

    private MyFrame setGreen(){
        this.frame = new MyFrame();
        frame.setBackground(Color.green);
        frame.setBounds(0, 0, 250, 500);
        frame.add(this);


        return frame;
    }

    private MyFrame setYellow(){
        this.frame = new MyFrame();
        frame.setBackground(Color.yellow);
        frame.setBounds(250, 0, 250, 500);
        frame.add(this);
        frame.add(button);

        return frame;
    }

    private MyFrame setRed(){
        this.frame = new MyFrame();
        frame.setBackground(Color.red);
        frame.setBounds(500, 0, 250, 500);
        frame.add(this);

        return frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == button){
            System.out.println("This button is working as intended");
            button.addActionListener(a -> System.out.println("Off course, this button is working"));
        }

    }
}

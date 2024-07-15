import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderDemo implements ChangeListener{
    JFrame frame;
    JPanel panel;
    JLabel lable;
    JSlider slider;

    public SliderDemo(){
        this.frame = new JFrame();
        this.panel = new JPanel();
        this.lable = new JLabel();
        this.slider = new JSlider();
    }
    @Override
    public void stateChanged(ChangeEvent e) {

    }
}

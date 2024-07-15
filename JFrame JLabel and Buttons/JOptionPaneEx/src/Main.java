import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*System.out.println(JOptionPane.showConfirmDialog(null,
                "Hi, Have you ever code before? ",
                "No Title",
                JOptionPane.YES_NO_CANCEL_OPTION));*/
        //acceptActionDialog();
        createJTextField();

    }
    private static void acceptShowMessageDialog(int nums){
        switch (nums){
            case 1 -> JOptionPane.showMessageDialog(null,
                    "Welcome to our trail programing page", "Title",
                    JOptionPane.INFORMATION_MESSAGE);
            case 2 -> JOptionPane.showMessageDialog(null,
                    "This is useless Messaage", "Title",
                    JOptionPane.PLAIN_MESSAGE);

            case 3 -> JOptionPane.showMessageDialog(null,
                    "Please, tell us what you want to do with us? ", "Title",
                    JOptionPane.QUESTION_MESSAGE);
            case 4 -> JOptionPane.showMessageDialog(null,
                    "Warning Message", "Title",
                    JOptionPane.WARNING_MESSAGE);
            default -> JOptionPane.showMessageDialog(null,
                    "Error Message", "Title",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void acceptShowConfirmDialog(){
        int nums = JOptionPane.showConfirmDialog(null,
                "Hi, Have you ever code before? ",
                "No Title",
                JOptionPane.YES_NO_CANCEL_OPTION);
    }

    private static void acceptActionDialog(){
        String name = JOptionPane.showInputDialog("What is your name? ");
        if(name != null){
            ImageIcon icon = new ImageIcon("C:\\Users\\Alex\\Desktop\\Sheger.png");
            String[] responces = {"Yohannis is Alcoholic", "Alemayehu is Yohannis's friend", "So, Alemayehu is Alcoholic"};

            int nums = JOptionPane.showOptionDialog(null,
                    "You are doing well. Keep up good work!",
                    "Yohannis Kuru",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    icon,
                    responces,
                    0);
        }

    }

    private static void createJTextField(){
        MyFrame myFrame = new MyFrame();

    }
}

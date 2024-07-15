import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException, FileNotFoundException {

        Scanner scanner = new Scanner(System.in);

        File file = new File("E:\\TimBuchalka\\Eyob.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();

        String response = "";
        System.out.println("P = play, 'S' = Stop, 'R' = reset, 'Q' = quit.");
        while(!response.equals("Q")){
            System.out.println("Enter your choice: ");
            response = scanner.nextLine().toUpperCase();

            switch(response){
                case "P": clip.start();
                    break;
                case "R": clip.setMicrosecondPosition(0);
                    break;
                case "S": clip.stop();
                    break;
                case "Q": clip.close();
                    break;
                default: System.out.println("It is not valid choice. \nP = play, 'S' = Stop, 'R' = reset, 'Q' = quit.");
            }

        }
        System.out.println("Byeeeee!!");
        scanner.close();
    }
}

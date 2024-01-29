package CreatingAPdf;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.*;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file=new File("music.wav");
        AudioInputStream stream= AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        Scanner enter =new Scanner(System.in);
        clip.open(stream);
        int n=1;

        String responce="";



        while(!responce.equals("Q")){
            System.out.println("P=Play $ S=Stop $R=Reset $ Q=Quit");
            System.out.print("Enter your Choice");

            responce=enter.next();
            responce=responce.toUpperCase();

            switch (responce){
                case ("P"):clip.start();
                break;
                case ("S"):clip.stop();
                break;
                case ("R"):clip.setMicrosecondPosition(0);
                break;
                case ("Q"):clip.close();
                default:
                    System.out.println("invalid Response");
            }

        }
        System.out.println("Application.closed");

    }
}

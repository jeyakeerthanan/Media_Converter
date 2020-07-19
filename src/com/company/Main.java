package com.company;

import it.sauronsoftware.jave.EncoderException;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static String l_path;
    public static String path;
    public static void main(String[] args) throws EncoderException {
      //input the path of the file that need to convert
        System.out.println("Enter the path of the file that you want to convert?");
        Scanner ins=new Scanner(System.in);
        path=ins.nextLine();


        //get the format that the user want to format
        System.out.println("Enter the converting format!");
        System.out.println("[mp4 to mp3]-enter mp3 or [mp4 to wav]-enter wav or [mp4 to FLV]-enter flv");
        Scanner format=new Scanner(System.in);
        String num=format.nextLine();

        // change the location of the converted file
        System.out.println("If you want to change the location  of the converted file press 5 otherwise press 6 it will be store on D:\\convert/1.mp3/D:\\convert/1.wav");
       Scanner location=new Scanner(System.in);
        int Location_change=location.nextInt();



       if (Location_change==5 ){
            System.out.println("please enter the location path ......");
            Scanner l_ans=new Scanner(System.in);
            l_path=l_ans.nextLine();}

       if (Location_change==6 && num=="y" ){
           l_path="D:\\convert/1.mp3";
      }
     else if (Location_change==6 && num=="w" ){
          l_path.equalsIgnoreCase("D:\\convert/1.wav");
      }

        //System.out.println(l_path);
        MediaFactory factory=new MediaFactory();

        Converter converter=factory.getConType(num);
        converter.convert();

    }
}

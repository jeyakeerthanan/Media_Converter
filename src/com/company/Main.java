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
        System.out.println("mp3 or wav or flv or mkv ?");
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
        if (Location_change==6 && num=="mkv" ) {
            l_path = "D:\\convert/abc.mkv";
        }

        if (Location_change==6 && num=="mp3" ){
           l_path="D:\\convert/abc.mp3";
       }
       else if (Location_change==6 && num=="wav" ){
           l_path.equalsIgnoreCase("D:\\convert/abc.wav");
       }

        System.out.println(l_path);
        MediaFactory factory=new MediaFactory();

        Converter converter=factory.getConType(num);
        converter.convert();

    }
}

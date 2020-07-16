package com.company;

import java.util.Scanner;

public class Main {
    public static String l_path;
    public static void main(String[] args) {
      //input the path of the file that need to convert
        System.out.println("Enter the path of the file that you want to convert?");
        Scanner ins=new Scanner(System.in);
        String path=ins.nextLine();


        //get the format that the user want to format
        System.out.println("Enter the converting format!");
        System.out.println("[mp4 to mp3]-press 1 or [mp4 to wav]-press 2");
        Scanner format=new Scanner(System.in);
        int num=format.nextInt();

        // change the location of the converted file
        System.out.println("If you want to change the location  of the converted file press 5 otherwise press 6 it will be store on D:\\convert/Mp4_To_Mp3.mp3");
        Scanner location=new Scanner(System.in);
        int Location_change=location.nextInt();

        if (Location_change==5){
            System.out.println("please enter the location path ......");
            Scanner l_ans=new Scanner(System.in);
            l_path=l_ans.nextLine();
        }
        else if (Location_change==5 && num==1)
            l_path="D:\\converted.mp3";
        else if (Location_change==5 && num==2)
            l_path="D:\\converted.wav";

    }
}

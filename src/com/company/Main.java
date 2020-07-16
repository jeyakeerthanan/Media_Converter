package com.company;

import java.util.Scanner;

public class Main {

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

    }
}

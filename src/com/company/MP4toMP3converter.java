package com.company;

import it.sauronsoftware.jave.*;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class MP4toMP3converter extends Converter {

    //String path="C:\\Users\\Nishanthan\\Desktop\\Integrative_Assignment\\Media\\mp4tomp3/a.mp4";
   // static String pathout="C:\\Users\\Nishanthan\\Desktop\\Integrative_Assignment\\Converted_Media\\mp4tomp3-converted/c.mp3";


    @Override
    void convert()throws IllegalArgumentException,EncoderException {
        String   f_path=Main.l_path+"Mp4ToMp3";
        File file = new File(f_path);
        //Creating the directory
        boolean bool = file.mkdir();
        System.out.println(f_path+"Folder created");
        String D_path=f_path+"/"+Main.num1;
        File vid= new File(Main.path);
        File target = new File(D_path);
        System.out.println("Converting.....");
        AudioAttributes audio = new AudioAttributes();
        audio.setCodec("libmp3lame");
        audio.setBitRate(new Integer(128000));
        audio.setChannels(new Integer(2));
        audio.setSamplingRate(new Integer(44100));
        EncodingAttributes attrs = new EncodingAttributes();
        attrs.setFormat("mp3");
        attrs.setAudioAttributes(audio);
        Encoder encoder = new Encoder();
        //encoder.encode(vid, target, attrs);
        try {
            encoder.encode(vid, target, attrs, null);
            System.out.println("Successfully Converted!! mp3 file is opening.....");

            //Creating a File object
            File file1 = new File(D_path);
            //Creating the directory
            boolean bool1 = file.mkdir();

            Desktop desktop = Desktop.getDesktop();
            desktop.open(file);

            File file2 = new File(Main.path);
            //delete the source
            file2.delete();
            System.out.println("Source file successfully deleted");
        } catch (IllegalArgumentException e) {

            e.printStackTrace();
        } catch (InputFormatException e) {

            e.printStackTrace();
        } catch (EncoderException e) {

            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

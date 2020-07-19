package com.company;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import it.sauronsoftware.jave.*;

public class MP4toWAVconverter extends Converter{



    @Override
    void convert()throws IllegalArgumentException,EncoderException {
        File Audio = new File(Main.path);
        File target = new File(Main.l_path);
        AudioAttributes audio = new AudioAttributes();
        audio.setCodec("libmp3lame");
        audio.setBitRate(new Integer(128000));
        audio.setChannels(new Integer(2));
        audio.setSamplingRate(new Integer(44100));
        EncodingAttributes attrs = new EncodingAttributes();
        attrs.setFormat("wav");
        attrs.setAudioAttributes(audio);
        Encoder encoder = new Encoder();
        //encoder.encode(vid, target, attrs);
        try {
            encoder.encode(Audio, target, attrs, null);
            System.out.println("Successfully Converted!! wav file is opening.....");
            File file = new File (Main.l_path);
            Desktop desktop = Desktop.getDesktop();
            desktop.open(file);
            File file1 = new File(Main.path);
            //delete the source
            file1.delete();
            System.out.println("Source file successfully deleted");
        }
        catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        catch (InputFormatException e) {
            e.printStackTrace();
        }
        catch (EncoderException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}


//String path="C:\\Users\\Nishanthan\\Desktop\\Integrative_Assignment\\Media\\mp4towav/a.mp4";
// static String pathout="C:\\Users\\Nishanthan\\Desktop\\Integrative_Assignment\\Converted_Media\\mp4towav-converted/c.wav";

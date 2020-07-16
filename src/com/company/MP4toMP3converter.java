package com.company;

import it.sauronsoftware.jave.*;

import java.io.File;
import java.io.IOException;

public class MP4toMP3converter extends Converter {

    //String path="C:\\Users\\Nishanthan\\Desktop\\Integrative_Assignment\\Media\\mp4tomp3/a.mp4";
    File vid= new File(Main.path);
   // static String pathout="C:\\Users\\Nishanthan\\Desktop\\Integrative_Assignment\\Converted_Media\\mp4tomp3-converted/c.mp3";


    @Override
    void convert()throws IllegalArgumentException,EncoderException {

        File target = new File(Main.l_path);
        AudioAttributes audio = new AudioAttributes();
        audio.setCodec("libmp3lame");
        audio.setBitRate(new Integer(128000));
        audio.setChannels(new Integer(2));
        audio.setSamplingRate(new Integer(44100));
        EncodingAttributes attrs = new EncodingAttributes();
        attrs.setFormat("mp3");
        attrs.setAudioAttributes(audio);
        Encoder encoder = new Encoder();
        encoder.encode(vid, target, attrs);

    }
}

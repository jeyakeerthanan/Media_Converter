package com.company;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import it.sauronsoftware.jave.*;

public class MP4toWAVconverter extends Converter{

    File Audio = new File(Main.l_path);

    @Override
    void convert()throws IllegalArgumentException,EncoderException {

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
            System.out.println("Successfully Converted!! mp3 file is opening.....");
            File file = new File (Main.l_path);
            Desktop desktop = Desktop.getDesktop();
            desktop.open(file);
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

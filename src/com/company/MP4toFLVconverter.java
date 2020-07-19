package com.company;

import it.sauronsoftware.jave.*;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class MP4toFLVconverter extends Converter {

    @Override
    void convert() throws EncoderException {
        File source = new File(Main.path);
        File target = new File(Main.l_path);
        AudioAttributes audio = new AudioAttributes();
        audio.setCodec(AudioAttributes.DIRECT_STREAM_COPY);
        audio.setBitRate(new Integer(128000));
        audio.setSamplingRate(new Integer(44100));
        audio.setChannels(new Integer(2));
        VideoAttributes video = new VideoAttributes();
        video.setBitRate(new Integer(160000));
        video.setFrameRate(new Integer(15));
        video.setCodec("flv");
        video.setCodec(VideoAttributes.DIRECT_STREAM_COPY);
        EncodingAttributes attrs = new EncodingAttributes();
        attrs.setFormat("mp4");
        attrs.setAudioAttributes(audio);
        attrs.setVideoAttributes(video);
        Encoder encoder = new Encoder();
        try {
            encoder.encode(source, target, attrs);
            System.out.println("Successfully Converted!! flv file is opening.....");
            File file = new File (Main.l_path);
            Desktop desktop = Desktop.getDesktop();
            desktop.open(file);
            File file1 = new File(Main.path);
            //delete the source
            file1.delete();
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

//String path="C:\\Users\\Nishanthan\\Desktop\\Integrative_Assignment\\Media\\mp4toflv/a.mp4";
// static String pathout="C:\\Users\\Nishanthan\\Desktop\\Integrative_Assignment\\Converted_Media\\mp4toflv-converted/c.flv";

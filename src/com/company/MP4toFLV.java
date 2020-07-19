package com.company;

import it.sauronsoftware.jave.*;

import java.io.File;
import java.io.IOException;

public class MP4toFLV {
    public static void ConversionMp4ToFlv() throws IOException {
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
        video.setCodec("mpeg4");
        video.setCodec(VideoAttributes.DIRECT_STREAM_COPY);
        EncodingAttributes attrs = new EncodingAttributes();
        attrs.setFormat("mp4");
        attrs.setAudioAttributes(audio);
        attrs.setVideoAttributes(video);
        Encoder encoder = new Encoder();
        try {
            encoder.encode(source, target, attrs);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InputFormatException e) {
            e.printStackTrace();
        } catch (EncoderException e) {
            e.printStackTrace();
        }

    }
}

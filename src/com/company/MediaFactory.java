package com.company;

public class MediaFactory {

    public Converter getConType(String conversiontype){



        if("mp4tomp3".equals(conversiontype)){
            return  new MP4toMP3converter();
        }
        if("mp4tomkv".equals(conversiontype)){
            return  new MP4toMKVconverter();
        }

        return null;
    }
}

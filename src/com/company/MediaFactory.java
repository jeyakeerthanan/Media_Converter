package com.company;

public class MediaFactory {

    public Converter getConType(String conversiontype){



        if("mp3".equals(conversiontype)){
            return  new MP4toMP3converter();
        }
        if("wav".equals(conversiontype)){
            return  new MP4toWAVconverter();
        }
        if("flv".equals(conversiontype)){
            return  new MP4toFLVconverter();
        }
        return null;
    }
}

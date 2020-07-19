package com.company;

public class MediaFactory {

    public Converter getConType(String conversiontype){


        if("y".equals(conversiontype)){
            return  new MP4toMP3converter();
        }
        if("n".equals(conversiontype)){
            return  new MP4toWAVconverter();
        }
       if("flv".equals(conversiontype)){
            return  new MP4toFLVconverter();
        }
        if("mkv".equals(conversiontype)){
            return  new MP4toMKVconverter();
        }

        return null;
    }
}

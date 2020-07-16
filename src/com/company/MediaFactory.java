package com.company;

public class MediaFactory {

    public Converter getConType(String conversiontype){



        if("y".equals(conversiontype)){
            return  new MP4toMP3converter();
        }
       // if("mp4tomkv".equals(conversiontype)){
           // return  new MP4toMKVconverter();
       // }

        return null;
    }
}

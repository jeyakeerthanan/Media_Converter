package com.company;

import com.xuggle.mediatool.IMediaReader;
import com.xuggle.mediatool.IMediaViewer;
import com.xuggle.mediatool.IMediaWriter;
import com.xuggle.mediatool.ToolFactory;
import it.sauronsoftware.jave.EncoderException;

public class MP4toMKVconverter extends Converter {

    private static final String inputFilename = "C:\\Users\\Nishanthan\\Desktop\\Integrative_Assignment\\Media\\mp4tomp3/a.mp4";
    private static final String outputFilename = "C:\\Users\\Nishanthan\\Desktop\\Integrative_Assignment\\Converted_Media\\mp4tomp3-converted/c.flv";

    @Override
    void convert() throws EncoderException {
        // create a media reader

        IMediaReader mediaReader =

                ToolFactory.makeReader(inputFilename);

        // create a media writer

        IMediaWriter mediaWriter =

                ToolFactory.makeWriter(outputFilename, mediaReader);

        // add a writer to the reader, to create the output file

        mediaReader.addListener(mediaWriter);

        // create a media viewer with stats enabled

        IMediaViewer mediaViewer = ToolFactory.makeViewer(true);

        // add a viewer to the reader, to see the decoded media

        mediaReader.addListener(mediaViewer);

        // read and decode packets from the source file and

        // and dispatch decoded audio and video to the writer

        while (mediaReader.readPacket() == null) ;


    }
}
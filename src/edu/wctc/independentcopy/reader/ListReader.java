package edu.wctc.independentcopy.reader;

import java.util.ArrayList;
import java.util.List;

public class ListReader implements Reader{
    @Override
    public String readln() {
        List<String> readerOutput = new ArrayList<String>();
        readerOutput.add("Moog");
        readerOutput.add("Korg");
        readerOutput.add("Roland");
        readerOutput.add("Oberheim");
        readerOutput.add("Sequential Circuits");

        return readerOutput.toString();
    }
}

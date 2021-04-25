package edu.wctc.independentcopy.writer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListWriter implements Writer{
    @Override
    public void writeln(String line) {
        System.out.println("Here is your text as an array list.");
        List<String> myList = new ArrayList<>(Arrays.asList(line.split(",")));
        System.out.println(myList);

        //The above is probably more accurate to the desired output.
        //System.out.println(line.toCharArray());
    }
}

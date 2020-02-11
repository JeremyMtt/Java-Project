package edu.nyu.cs9053.homework3.oo;

import java.io.*;

public class AsciiArt{
    public static void main(String[] args){
        String Ascii = args[0];
	char value = args[0].toCharArray()[0];
	if(value<48|value>90|(value>=58&value<=64)){
		System.out.println("unknow characters");
	    }
	if(args.length>1) {
            System.out.println("unknown characters");
            }
        else {
	    Letter As = new Letter(args[0]);
	    As.print();
	}
    }

}

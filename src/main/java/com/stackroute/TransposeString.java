package com.stackroute;

public class TransposeString {
    public String StringTranspose(String InputString){
        if(InputString == "") return null;
        String[] StringArray = InputString.split(" ");
        String OutputString = "";
        for(String s: StringArray){
            StringBuffer sbf = new StringBuffer(s);
            OutputString = OutputString+sbf.reverse()+" ";
        }
        String TransposeString = OutputString.substring(0,OutputString.length()-1);
        OutputString = "";
        return TransposeString;
    }
}

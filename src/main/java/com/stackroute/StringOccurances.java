package com.stackroute;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringOccurances {
    private String InputString;
    public StringOccurances(String InputString){
        this.InputString = InputString;
    }

    public String MultipleOccurancePositionArray(String StringToMatch){
        if(this.InputString.length()==0) return null;
        String OutputString ="";
        Pattern p = Pattern.compile(StringToMatch);
        Matcher m = p.matcher(this.InputString);
        while(m.find()){
            OutputString = OutputString+"Found at: "+m.start()+" - "+m.end()+"\n";
        }
        OutputString = OutputString.substring(0,OutputString.length()-1);
        return OutputString;
    }
}

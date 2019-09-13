package com.stackroute;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSpecificWord {
    private String InputString;
    public RegexSpecificWord(String InputString){
        this.InputString = InputString;
    }

    public boolean IsWordExist(String regexExpression){
        Pattern pat = Pattern.compile(regexExpression);
        Matcher m = pat.matcher(this.InputString);
        if(m.find()) return true;
        else return false;
    }
}

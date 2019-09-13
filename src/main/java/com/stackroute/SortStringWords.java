package com.stackroute;

import java.util.Arrays;

public class SortStringWords {
    private String InputString;
    public SortStringWords(String InputString){
        this.InputString = InputString;
    }

    public String[] SortStringAlphabetically(){
        if(this.InputString.length()==0) return null;
        String[] stringArray = this.InputString.split("[ ,.\\n]+");
        Arrays.sort(stringArray);
        for(int i=0; i<stringArray.length;i++){
            System.out.println(stringArray[i]);
        }
        return stringArray;
    }
}

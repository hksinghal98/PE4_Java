package com.stackroute;

public class ReplaceCharacter {
    String target ="";
    public ReplaceCharacter(String InputString){
        this.target = InputString;
    }

    public String CharactersToReplace(char[] toReplace,char[] replaceBy){
        if(toReplace.length != replaceBy.length) return null;

        for(int i = 0;i<toReplace.length;i++){
           this.target = this.target.replace(toReplace[i],replaceBy[i]);
        }
        return this.target;
    }
}

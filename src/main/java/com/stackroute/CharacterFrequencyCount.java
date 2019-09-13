package com.stackroute;

/**
 * Hello world!
 *
 */
public class CharacterFrequencyCount
{
   public int CountFrequency(String InputString, char c){
       if(InputString == null) return 0;
       String target = Character.toString(c);
       int Frequency = InputString.length()-InputString.replace(target,"").length();
       return Frequency;
   }

}

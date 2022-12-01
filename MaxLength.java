// Write the java program which accept one word from user through commant line and display lenght of largest word

import java.util.*;

class MaxLength
{
    public static void main(String[] args) 
    {
        int i = 0;
        int iTemp = args[0].length();

        for(i = 0;i < args.length;i++)
        {
            if(iTemp <= args[i].length())
            {
                iTemp = args[i].length();
            }
        }
        System.out.println("Length of word is: "+iTemp);
    }
}
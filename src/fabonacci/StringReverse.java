package fabonacci;

import java.util.ArrayList;
import java.util.List;

public class StringReverse
{
    public String ReverseWord(String inString)
    {
        String s = inString;
        String outPut = "";
        String[] value = s.split(" ");
        List<String> holder = new ArrayList<>();
        int wordLen = value.length;
//        System.out.println(value[0]);

        for (int i = 0; i < wordLen; i++)
        {
            holder.add(value[i]);
        }

        for (int k = (value.length-1); k > -1; k--)
        {
            if(k == (value.length -1))
            {
                if(value[k].equals(" "))
                {
                    continue;
                }
                outPut +=  value[k];
            }
            else
            {
                if(value[k].equals(" "))
                {
                    continue;
                }
                outPut += " "+value[k];
            }
        }

        return outPut;
    }
}

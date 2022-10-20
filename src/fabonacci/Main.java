package fabonacci;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
//        System.out.println("test");
        //Get the number input
//        int numIn = 10;
//        int result = fabNumber(numIn);
//        System.out.println(result);
        //Server logs
        ServerIPFetch serverIPFetch = new ServerIPFetch();
        String IP = serverIPFetch.IpGet("/home/bug71c0/Projects/Movetech/Fabonacci/src/fabonacci/server_logs.csv");
        System.out.println(IP);

        //Word Reverse
//        StringReverse stringReverse = new StringReverse();
//        String OutVal = stringReverse.ReverseWord("James Collins Omondi");
//        System.out.println(OutVal);
    }


    private static int fabNumber(int number)
    {
        int numberIn = number;
        int previous = 0;
        int first = 0;
        int second = 1;
        List<Integer> outVal = new ArrayList<>();
//        if(number == 0)
//        {
//            return 0;
//        }
        for (int i = first; i < numberIn; i++)
        {
            if(i == 0)
            {
                previous = first + second;
                outVal.add(first);
                outVal.add(second);
            }
            else
            {
                try
                {
                    previous += outVal.get(i-1);
                    outVal.add(previous);
                }
                catch (Exception e)
                {
                    System.out.println("Invalid Value");
                }
            }
        }
        System.out.println(outVal);
        //Geting the number at the position
        try
        {
            System.out.println(outVal.get(numberIn-1));
            return outVal.get(numberIn-1);
        }
        catch (Exception e)
        {
            System.out.println("Invalid Value");
        }
        return 0;
    }
}

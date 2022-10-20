package fabonacci;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServerIPFetch
{
    public String IpGet(String fileDir)
    {
        Scanner logFileIn = null;
        try
        {
            logFileIn = new Scanner(new File("/home/bug71c0/Projects/Fabonacci/src/fabonacci/server_logs.csv"));
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        //sets the pattern
        logFileIn.useDelimiter(",");
        //returns a boolean value
        List<String> allIN = new ArrayList<>();
        List<String> logIPs = new ArrayList<>();
        List<String> logValuAccesed = new ArrayList<>();
        List<String> logID = new ArrayList<>();
        int row_counter = 0;
        while (logFileIn.hasNext())
        {
            //find and returns the next complete token from this scanner
            String Value = logFileIn.next();
//            if(row_counter < 3)
//            {
            allIN.add(Value.split(",")[0]);
//                logValuAccesed.add(Value)
//            }


//            String logID = Value[0];
//            String logValuAccesed = Value[1];
//            String logIP = Value[2];
        }
        //close file
        logFileIn.close();
        System.out.print(allIN);
        System.out.print("\n");

        ///Getting Values and perfing acctions
        for (int i = 0; i < allIN.size(); i++)
        {
//            if(i == (allIN.size()-2))
//            {
//                logIPs.add(allIN.get(i+2));
//                break;
//            }
//            else
//            {
            if(row_counter == 0)
            {
                logIPs.add(allIN.get(i+2));
                row_counter++;
                if(row_counter == 2)
                {
                    row_counter = 0;
                    logIPs.add(allIN.get(i+3));
                }
            }
            else
            {
                row_counter++;
                continue;
//                    logIPs.add(allIN.get(i+2));
//                    row_counter = 0;
            }
        }

        System.out.print(logIPs);

        //Find the most occuring
        String finalOut = "";
        String holder = "";
        int[] counts = new int[logIPs.size()];
        String hiestIP = "";
        for (int j = 0; j < logIPs.size(); j++)
        {
            if(logIPs.get(j).equals(holder))
            {
                counts[j] += 1;
            }
            else
            {
                counts[j] = 0;
            }
        }

        //Get the highest
        int hiHolder = 0;
        int position = 0;
        for (int k = 0; k < counts.length; k++)
        {
            if(counts[k] > hiHolder)
            {
                hiHolder = counts[k];
                position = k;
            }
        }

        System.out.println(""+logIPs.get(position));
        return logIPs.get(position);
    }
}

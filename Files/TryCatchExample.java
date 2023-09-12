package CSC1351_Fall2023.Files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args)  {

        try {
            File inputFile = new File("output.txt");
            Scanner in = new Scanner(inputFile);

            while( in.hasNextLine() )
            {
                String name = in.nextLine();
                System.out.println(name);
            }

            in.close();
        }

        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

}

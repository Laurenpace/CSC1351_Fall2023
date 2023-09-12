package CSC1351_Fall2023.Files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteToOutputFile {
    public static void main(String[] args) throws FileNotFoundException {

        PrintWriter outFile = new PrintWriter("test.txt");
        Scanner in = new Scanner(System.in);

        for ( int i = 1; i <= 5; i++ )
        {
            System.out.print("Please Enter name " + i + ": ");
            String name = in.nextLine();
            outFile.println(name);
        }

        outFile.close();
    }

}

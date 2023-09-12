package CSC1351_Fall2023.Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws FileNotFoundException {

        File inputFile = new File("output.txt");
        Scanner in = new Scanner(inputFile);

        while( in.hasNextLine() )
        {
            String name = in.nextLine();
            System.out.println(name);
        }

        in.close();
    }

}

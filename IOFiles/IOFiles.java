import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IOFiles{

    public static void main(String[] args) throws FileNotFoundException {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the name of the input file: ");
            String fileName = in.next();
            File numbers = new File(fileName);
            in.close();
            total(numbers);
        }
        catch (FileNotFoundException e) {
            System.out.println("This file does not exist.");
        }
    }

    public static void total(File inName) throws FileNotFoundException{
        double sum = 0;
        PrintWriter fileTotal = new PrintWriter("total.txt");
        Scanner in = new Scanner(inName);
        while(in.hasNext()) {
            sum += Double.parseDouble(in.nextLine());
        }
        in.close();
        fileTotal.println("Total Sum: " + sum);
        fileTotal.close();
    }

}

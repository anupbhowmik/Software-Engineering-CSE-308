package problem1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Calculator{
    private double sum;

    public Calculator() {
        sum = 0.0;
    }

    public double calculateSum(File inputFile) {
        try {
            Scanner myReader = new Scanner(inputFile);
            while (myReader.hasNextLine()) {
                sum += myReader.nextDouble();
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return sum;
    }
}

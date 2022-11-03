package problem1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CalculateSumAdapter implements CalculateSum{
    private Calculator basicCalculator;

    public CalculateSumAdapter() {
        basicCalculator = new Calculator();
    }

    @Override
    public double calculateSum(File inputFile) {
        // we will create a new file to modify the format and pass the new file
        // to the original calculateSum() method
        // the file is overwritten and reused every time this method gets called

        try {
            FileWriter myWriter = new FileWriter("src/problem1/modifiedInput.txt");
            Scanner myReader = new Scanner(inputFile);
            while (myReader.hasNextLine()) {
                myWriter.write(myReader.nextLine().replace('~', ' '));

            }
            myReader.close();
            myWriter.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        File modifiedFile = new File("src/problem1/modifiedInput.txt");
        return basicCalculator.calculateSum(modifiedFile);

    }
}

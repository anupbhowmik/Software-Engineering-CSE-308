package problem1;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        File inputFile = new File("src/problem1/input.txt");

        CalculateSum calculateSumAdapter = new CalculateSumAdapter();
        System.out.println("Sum is = " + calculateSumAdapter.calculateSum(inputFile));

    }
}
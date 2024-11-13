import java.util.Scanner;

public class AutoTest {

    // creates variables:
    private int count;
    private double durationSum;
    private double minValue;
    private double maxValue;

    public AutoTest() { // AutoTest class constructor
        this.count = 0;
        this.durationSum = 0.0;
        this.minValue = Double.MAX_VALUE;
        this.maxValue = Double.MIN_VALUE;
    }

    public void test() {

        RunTime run = new RunTime(); // creates an instance of the RunTime class
        Scanner scanner = new Scanner(System.in); // creates an instance of the Scanner class
        System.out.println("How many test runs do you need: ");
        int testsCount = scanner.nextInt(); // equals value of the testsCount variable to the integer from the input
        double[] stats = new double[testsCount]; // created new double array
        System.out.println("How many numbers should contain each array: ");
        int quantity = scanner.nextInt(); // equals value of the quantity variable to the integer from the input
        GenerateArray generateArray = new GenerateArray(); // creates an instance of the GenerateArray class

        double duration;
        for(int i = 0; i < testsCount; i++) {
            int[] array = generateArray.createIntegers(quantity); // equates the result of the calculations of createIntegers method within GenerateArray class to the variable array
            duration = run.runTimeBubbleSort(array, false); // equates the result of the calculations of runTimeBubbleSort method within RunTime class to the variable duration
            stats[i] = duration;
            if(duration < minValue) {
                minValue = duration;
            } else if (duration > maxValue) {
                maxValue = duration;
            }
        }

        for(int i = 0; i < stats.length; i++) {
            durationSum += stats[i];
            count++;
        }

        System.out.println("\nBubbleSort: " + testsCount + " runs are being done.");
        System.out.printf("Average runtime is %.5f", (durationSum / count));
        System.out.print(" ms.\n");
        System.out.println("Longest runtime is " + maxValue + " ms.");
        System.out.println("Fastest runtime is " + minValue + " ms.\n");

        count = 0;
        durationSum = 0;
        minValue = Double.MAX_VALUE;
        maxValue = Double.MIN_VALUE;
        for(int i = 0; i < testsCount; i++) {
            int[] array = generateArray.createIntegers(quantity); // equates the result of the calculations of createIntegers method within GenerateArray class to the variable array
            duration = run.runTimeCombSort(array, false, false); // equates the result of the calculations of runTimeCombSort method within RunTime class to the variable duration
            stats[i] = duration;
            if(duration < minValue) {
                minValue = duration;
            } else if (duration > maxValue) {
                maxValue = duration;
            }
        }

        for(int i = 0; i < stats.length; i++) {
            durationSum += stats[i];
            count++;
        }

        System.out.println("\nCombSort: " + testsCount + " runs are being done.");
        System.out.printf("Average runtime is %.5f", (durationSum / count));
        System.out.print(" ms.\n");
        System.out.println("Longest runtime is " + maxValue + " ms.");
        System.out.println("Fastest runtime is " + minValue + " ms.\n");
    }
}

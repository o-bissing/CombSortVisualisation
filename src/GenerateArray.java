import java.util.Random;
import java.util.Scanner;

public class GenerateArray {

    // creates variables:
    private int number;
    private int[] array;
    private int quantity;

    public GenerateArray() { // GenerateArray class constructor
        this.number = 0;
        this.array = new int[]{};
        this.quantity = 0;
    }

    public int[] getIntegers() {

        Scanner scanner = new Scanner(System.in); // creates an instance of the Scanner class
        System.out.println("How many numbers should contain your array: ");
        number = scanner.nextInt(); // equals value of the number variable to the integer from the input
        array = new int[number]; // creates an array with "number" count of integers
        System.out.println("Give me " + number + " integers please:\r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt(); // equals value of the i-th integer variable to the integer from the input
        }
        return array;
    }

    public int[] createIntegers() {

        Scanner scanner = new Scanner(System.in); // creates an instance of the Scanner class
        System.out.println("How many numbers should contain your array: ");
        quantity = scanner.nextInt(); // equals value of the quantity variable to the integer from the input
        Random rand = new Random(); // creates an instance of the Random class
        array = new int[quantity]; // creates an array with "quantity" count of integers
        for(int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(9999) / (rand.nextInt(99) + 1); // equals the i-th value of the array to the randomly created integer
        }
        return array;
    }

    public int[] createIntegers(int quantity) {
        Random rand = new Random(); // creates an instance of the Random class
        array = new int[quantity]; // creates an array with "quantity" count of integers
        for(int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(9999) / (rand.nextInt(99) + 1); // equals the i-th value of the array to the randomly created integer
        }
        return array;
    }
}

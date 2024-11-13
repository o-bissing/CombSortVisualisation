import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in); // creates an instance of the Scanner class
    // creates variables:
    int choice = 7;
    int[] array;
    boolean quit = false;
    GenerateArray generateArray = new GenerateArray(); // creates an instance of the GenerateArray class

    public Menu() {

        printMenu(); // launches printMenu method

        while(!quit) {
            System.out.println("Enter your choice: ");
            // checks whether value in input is an integer, if yes - changes the value of choice variable to this value:
            if(scanner.hasNextInt()) {
                choice = scanner.nextInt();
            }
            scanner.nextLine(); // clears the input buffer
            switch (choice) {
                case 1:
                    printMenu();
                    break;
                case 2:
                    array = generateArray.getIntegers(); // equates the result of the calculations of getIntegers method within generateArray class to the variable array
                    Output.output(array, true, true, false); // executes the output method within Output class with parameters given
                    break;
                case 3:
                    array = generateArray.createIntegers();
                    Output.output(array, false, false, false);
                    break;
                case 4:
                    array = generateArray.createIntegers();
                    Output.output(array, true, true, false);
                    break;
                case 5:
                    array = generateArray.createIntegers();
                    Output.output(array, true, true, true);
                    break;
                case 6:
                    AutoTest autoTest = new AutoTest(); // creates an instance of the AutoTest class
                    autoTest.test(); // executes the test method within AutoTest class
                    break;
                case 7: default:
                    System.out.println("Wrong number. Please try again.");
                    break;
                case 0:
                    System.out.println("Shutting down the program...");
                    quit = true;
                    scanner.close();
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("Press: \n" +
                "1 - to print menu;\n" +
                "2 - to give numbers to sort and print them sorted with the calculation time;\n" +
                "3 - to give a quantity of numbers to generate and print calculation time only;\n" +
                "4 - to give a quantity of numbers to generate and print them sorted with the calculation time;\n" +
                "5 - to give a quantity of numbers to generate and print all the steps of calculation for CombSort;\n" +
                "6 - to conduct an autotest;\n" +
                "0 - to quit.");
    }
}

public class Output {

    public static void output(int[] array, boolean isGiven, boolean info, boolean steps) {

        if(isGiven) {
            System.out.println("======================================================");
            System.out.println("Following array is given:");
            for(int i = 0; i < array.length; i++) {
                int n = i + 1;
                if(array.length < 10) {
                    System.out.println("Element " + (i + 1) + " contents " + array[i]);
                } else if(array.length < 100) {
                    System.out.printf("Element " + "%2d" + " contents " + array[i] + "\n", n);
                } else if(array.length < 1000) {
                    System.out.printf("Element " + "%3d" + " contents " + array[i] + "\n", n);
                } else if(array.length < 10000) {
                    System.out.printf("Element " + "%4d" + " contents " + array[i] + "\n", n);
                } else {
                    System.out.printf("Element " + "%5d" + " contents " + array[i] + "\n", n);
                }
            }
            System.out.println("======================================================");
        }

        double duration;
        RunTime run = new RunTime(); // creates an instance of the Runtime class

        if(!steps) {
            duration = run.runTimeBubbleSort(array, info); // equates the result of the calculations of runTimeBubbleSort method within RunTime class to the variable duration
            System.out.println("\n>>> BubbleSort execution time: " + duration + " ms.");
        }

        duration = run.runTimeCombSort(array, info, steps);
        System.out.println("\n>>> CombSort execution time: " + duration + " ms.\n");
    }

    public static void printArray(int[] array) {
        System.out.print("\n");
        for(int i = 0; i < array.length; i++) {
            int n = i + 1;
            if(array.length < 10) {
                System.out.println("Element " + (i + 1) + " contents " + array[i]);
            } else if(array.length < 100) {
                System.out.printf("Element " + "%2d" + " contents " + array[i] + "\n", n);
            } else if(array.length < 1000) {
                System.out.printf("Element " + "%3d" + " contents " + array[i] + "\n", n);
            } else if(array.length < 10000) {
                System.out.printf("Element " + "%4d" + " contents " + array[i] + "\n", n);
            } else {
                System.out.printf("Element " + "%5d" + " contents " + array[i] + "\n", n);
            }
        }
    }
}

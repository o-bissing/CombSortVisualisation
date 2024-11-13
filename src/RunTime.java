public class RunTime {

    // creates variables:
    private long startTime, endTime;
    private int[] result;
    private double duration;

    public RunTime() { // RunTime class constructor
        this.startTime = 0;
        this.endTime = 0;
        this.result = new int[]{};
        this.duration = 0.0;
    }

    public double runTimeBubbleSort(int[] array, boolean info) {
        BubbleSort bubbleSort = new BubbleSort(array); // creates an instance of the BubbleSort class
        startTime = System.nanoTime(); // equates the current time to the variable startTime
        result = bubbleSort.sortIntegers(); // equates the result of the calculations of sortIntegers method within BubbleSort class to the variable result
        endTime = System.nanoTime(); // equates the current time to the variable endTime
        duration = (double) (endTime - startTime) / 1000000;  // uses casting to double; divides by 1000000 to get milliseconds
        if(info) {
            Output.printArray(result); // executes the printArray method within Output class
        }
        return duration;
    }

    public double runTimeCombSort(int[] array, boolean info, boolean steps) {
        CombSort combSort = new CombSort(array);
        startTime = System.nanoTime();
        result = combSort.sortIntegers(steps);
        endTime = System.nanoTime();
        duration = (double) (endTime - startTime) / 1000000;
        if(info) {
            Output.printArray(result);
        }
        return duration;
    }
}

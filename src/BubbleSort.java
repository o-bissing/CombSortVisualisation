import java.util.Arrays;

public class BubbleSort {

    // creates variables:
    private int[] sortedArray;
    boolean flag;

    public BubbleSort(int[] array) { // BubbleSort class constructor
        this.sortedArray = Arrays.copyOf(array, array.length); // equals the inner created array of integers to the transmitted one
        this.flag = true;
    }

    // implementation of the bubble sort algorithm:
    public int[] sortIntegers() {
        while (flag) {
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++) {
                if(sortedArray[i] > sortedArray[i + 1]) {
                    int save = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = save;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}

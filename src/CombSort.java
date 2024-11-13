import java.util.Arrays;

public class CombSort {

    // creates variables:
    private int[] sortedArray;
    int gap;
    boolean flag;

    public CombSort(int[] array) { // CombSort class constructor
        this.sortedArray = Arrays.copyOf(array, array.length); // equals the inner created array of integers to the transmitted one
        this.gap = sortedArray.length; // equals the value of the gap variable to the length of the sorterArray array
        this.flag = true;
    }

    // implementation of the comb sort algorithm:
    public int[] sortIntegers(boolean steps) {

        int save;
        while(gap > 1 || flag) {
            gap = calculateGap(gap);
            flag = false;
            for(int i = 0; i < sortedArray.length - gap; i++) {
                if(sortedArray[i] > sortedArray[i + gap]) {
                    save = sortedArray[i];
                    sortedArray[i] = sortedArray[i + gap];
                    sortedArray[i + gap] = save;
                    flag = true;
                    // prints every step of the changes in the console:
                    if(steps) {
                        System.out.println("\nChanges in the next step:");
                        for(int j = 0; j < sortedArray.length; j++) {
                            System.out.print(" " + sortedArray[j] + " ");
                        }
                        System.out.print("\n");
                    }
                }
            }
        }
        return sortedArray;
    }

    private int calculateGap(int gap) {
        gap = (gap * 10) / 13;
        return Math.max(gap, 1);
    }
}

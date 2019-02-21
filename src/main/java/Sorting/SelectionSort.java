package Sorting;

/**
 * Created by vmishra on 4/26/2018.
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] result;
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {1, 5, 2, 100, 8, 7, 89};
        result = selectionSort.selectionSort(arr);
        for (int i = 0; i < 7; i++) {
            System.out.println(result[i] + " \n");
        }
    }

    private int[] selectionSort(int[] arr) {
        int temp;
        int i;
        for (int j = 1; j < arr.length; j++) {
            temp = arr[j];
            i = j - 1;
            while (i >= 0 && temp < arr[i]) {
                arr[i + 1] = arr[i];
                --i;
            }
            arr[i + 1] = temp;
        }
        return arr;
    }

}

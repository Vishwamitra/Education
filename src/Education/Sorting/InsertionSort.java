package Education.Sorting;

/**
 * Created by vmishra on 4/26/2018.
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] result;
        InsertionSort insertionSort = new InsertionSort();
        int[] arr = {1, 5, 2, 100, 8, 7, 89};
        result = insertionSort.insertionSort(arr);
        for (int i = 0; i < 7; i++) {
            System.out.println(result[i] + " \n");
        }
    }

    private int[] insertionSort(int[] arr) {
        int temp;
        for (int j = 0; j < arr.length; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[j] > arr[i]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

}

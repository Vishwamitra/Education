package Sorting;


public class ShellSort {

    public static void main(String[] args) {
        int[] result;
        ShellSort shellSort = new ShellSort();
        int[] arr = {99, 5, 2, 100, 8, 7, 89, 3, 5, 45, 11, 23, 45, 34, 50, 19, 21, 18, 22};
        result = shellSort.shellSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(result[i] + " \n");
        }
    }

    private int[] shellSort(int[] arr) {
        int n = arr.length;

        for (int part = n / 2; part > 0; part /= 2) {
            for (int i = part; i < n; i += 1) {
                int temp = arr[i];
                int j;
                for (j = i; j >= part && arr[j - part] > temp; j -= part) {
                    arr[j] = arr[j - part];
                }
                arr[j] = temp;
            }
        }
        return arr;
    }

}

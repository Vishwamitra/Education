package Education.Sorting;

class BubbleSort {

    // Accepts an array of integers and returns a
    // sorted array in ascending order
    // Read the commented line below for sorting
    // in descending order
    private static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                //to sorting in descending order change
                // the following statement : -
                // if (arr[j - 1] < arr[j]) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    //Main Function to test the bubble sorting function
    public static void main(String args[]) {

        int[] arr = {10, 20, 1, 2, 80, 40, 20, 30, 5};
        int[] result;
        result = bubbleSort(arr);
        System.out.println("Sorted array is here....  ");
        for (int item : result)
            System.out.println(item);
    }
}
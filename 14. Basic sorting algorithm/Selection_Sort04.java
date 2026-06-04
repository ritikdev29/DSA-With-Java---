public class Selection_Sort04 {
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_position = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min_position] > arr[j]) {
                    min_position = j;

                }
            }
            // swap
            int temp = arr[min_position];
            arr[min_position] = arr[i];
            arr[i] = temp;
        }
    }

    // array print ----> code
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        selectionSort(arr);
        printArr(arr);

    }

}

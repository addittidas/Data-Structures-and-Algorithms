import java.util.Arrays;

public class Merge_Sort {
    // Function to merge two sorted arrays
    void merge(int arr[], int beg, int mid, int end){
        int n1 = mid - beg + 1;
        int n2 = end - mid;

        int[] larr = new int[n1];
        int[] rarr = new int[n2];

        for(int i = 0; i < n1; i++){ // Copy data to larr
            larr[i] = arr[beg + i];
        }

        for(int j = 0; j < n2; j++){ // Copy data to rarr
            rarr[j] = arr[mid + 1 + j];
        }

        int i = 0; // Pointers for larr
        int j = 0; // Pointers for rarr
        int k = beg; // Pointer for the sorted array

        while(i < n1 && j < n2){
            if(larr[i] <= rarr[j]){
                arr[k] = larr[i];
                i++;
            }
            else{
                arr[k] = rarr[j];
                j++;
            }
            k++;
        }

        // For remaining elements
        while(i < n1){
            arr[k] = larr[i];
            i++;
            k++;
        }

        while(j < n2){
            arr[k] = rarr[j];
            j++;
            k++;
        }
    }

    // Merge sort function
    void mergesort(int[] arr, int beg, int end){
        if (beg < end){
            int mid = (beg + end)/2;
            mergesort(arr, beg, mid); // Recursive call for the left side
            mergesort(arr, mid + 1, end); // Recursive call for the right side
            merge(arr, beg, mid, end); // Merge the sorted halves to get the sorted array
        }
    }

    public static void main(String[] args) {
        int[] arr = {11, 55, 33, 66, 22};
        int n = arr.length;
        System.out.println("Original Array" + Arrays.toString(arr));

        Merge_Sort ms = new Merge_Sort();
        ms.mergesort(arr, 0, n - 1);

        System.out.println("Sorted Array" + Arrays.toString(arr));
    }
    
}

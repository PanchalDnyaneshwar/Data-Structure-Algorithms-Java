public class QuickSort {

    // Method to partition the array
    static int partition(int arr[], int low, int high) {

        int pivot = arr[high];     // choose last element as pivot
        int i = low - 1;           // index of smaller element

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot at correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;  // return pivot index
    }

    // Quick Sort method
    static void quickSort(int arr[], int low, int high) {

        if (low < high) {

            int pivotIndex = partition(arr, low, high);

            // sort left part
            quickSort(arr, low, pivotIndex - 1);

            // sort right part
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) {

        int nums[] = {8, 5, 9, 4, 6, 3, 2, 1, 7};

        System.out.print("Before Sorting : ");
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();

        quickSort(nums, 0, nums.length - 1);

        System.out.print("After Sorting : ");
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}


/*
# Quick Sort is a divide and conquer sorting algorithm.
# It selects a pivot element and partitions the array around the pivot.

* Pseudocode (With Explanation)

QuickSort(arr, low, high):
    if low < high
        pivotIndex = partition(arr, low, high)
        // pivot placed at correct position

        QuickSort(arr, low, pivotIndex - 1)
        // recursively sort left sub-array

        QuickSort(arr, pivotIndex + 1, high)
        // recursively sort right sub-array

Partition(arr, low, high):
    pivot = arr[high]
    // choose last element as pivot

    i = low - 1
    // boundary for elements smaller than pivot

    for j from low to high - 1
        if arr[j] < pivot
            i++
            swap arr[i] and arr[j]
            // move smaller element to left

    swap arr[i+1] and arr[high]
    // place pivot at correct position

    return i + 1
    // pivot index

* Time Complexity

| Case        | Complexity |
|------------|------------|
| Best       | O(n log n) |
| Average    | O(n log n) |
| Worst      | O(n²)      |

* Space Complexity
O(log n)   // recursion stack

* Important Interview Points

Fastest sorting algorithm in practice
Uses divide and conquer
Not a stable sorting algorithm
Worst case occurs when pivot is smallest or largest
In-place sorting

* Real-Life Example

Sorting files using a reference value (pivot) and grouping smaller and larger files
*/

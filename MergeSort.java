public class MergeSort {

    // Method to divide the array
    public static void mergeSort(int arr[], int left, int right) {

        // base condition: array has more than one element
        if (left < right) {

            // find middle index
            int mid = left + (right - left) / 2;

            // recursively sort left half
            mergeSort(arr, left, mid);

            // recursively sort right half
            mergeSort(arr, mid + 1, right);

            // merge both sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Method to merge two sorted subarrays
    public static void merge(int arr[], int left, int mid, int right) {

        // size of left and right subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // temporary arrays
        int leftArr[] = new int[n1];
        int rightArr[] = new int[n2];

        // copy data to left array
        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }

        // copy data to right array
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int i = 0;      // index for left array
        int j = 0;      // index for right array
        int k = left;   // index for merged array

        // merge the temp arrays back into arr[]
        while (i < n1 && j < n2) {

            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // copy remaining elements of leftArr (if any)
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // copy remaining elements of rightArr (if any)
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        int nums[] = {8, 5, 9, 4, 6, 3, 2, 1, 7};

        System.out.print("Before Sorting : ");
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();

        mergeSort(nums, 0, nums.length - 1);

        System.out.print("After Sorting : ");
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}


    /*
# Merge Sort is a divide and conquer sorting algorithm.
# It divides the array into halves, sorts them recursively,
# and then merges the sorted halves.

* Pseudocode (With Explanation)

MergeSort(arr, left, right):
    if left < right
        mid = (left + right) / 2
        // divide array into two halves

        MergeSort(arr, left, mid)
        // sort left half

        MergeSort(arr, mid + 1, right)
        // sort right half

        Merge(arr, left, mid, right)
        // merge both sorted halves

Merge(arr, left, mid, right):
    create leftArr and rightArr
    copy data into temp arrays

    while elements remain in both arrays
        compare and place smaller element into original array

    copy remaining elements (if any)

* Time Complexity

| Case        | Complexity |
|------------|------------|
| Best       | O(n log n) |
| Average    | O(n log n) |
| Worst      | O(n log n) |

* Space Complexity
O(n)   // extra temporary arrays

* Important Interview Points

Stable sorting algorithm
Uses divide and conquer
Guaranteed O(n log n) time
Requires extra memory
Used in external sorting

* Real-Life Example

Sorting large files by splitting them into smaller chunks and merging
*/

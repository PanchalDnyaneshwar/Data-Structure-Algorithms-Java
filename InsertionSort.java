public class InsertionSort {
    public static void main(String[] args) {

        int nums[] = {8, 5, 9, 4, 6, 3, 2, 1, 7};
        int size = nums.length;

        System.out.print("Before Sorting : ");
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();

        // Insertion Sort logic
        for (int i = 1; i < size; i++) {

            int key = nums[i];      // element to be inserted
            int j = i - 1;

            // shift elements greater than key to right
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }

            nums[j + 1] = key;      // insert key at correct position
        }

        System.out.print("After Sorting : ");
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}


/*
# Insertion Sort builds the sorted array one element at a time
# by inserting each element at its correct position.

* Pseudocode (With Explanation)

InsertionSort(arr):
    for i from 1 to n-1
        key = arr[i]
        // element to be placed at correct position

        j = i - 1
        // index of previous element

        while j >= 0 and arr[j] > key
            arr[j+1] = arr[j]
            // shift larger element to the right
            j--

        arr[j+1] = key
        // insert key at correct position

* Time Complexity

| Case        | Complexity |
|------------|------------|
| Best       | O(n)       |
| Average    | O(n²)      |
| Worst      | O(n²)      |

* Space Complexity
O(1)

* Important Interview Points

Stable sorting algorithm
Efficient for small or nearly sorted data
Uses shifting, not swapping
In-place sorting

* Real-Life Example

Sorting playing cards in hand
*/

public class BubbleSort {
    public static void main(String[] args) {

        int nums[] = {8, 5, 9, 4, 6, 3, 2, 1, 7};
        int temp;
        int size = nums.length;

        System.out.print("Before sorting : ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        // Bubble Sort logic
        for (int i = 0; i < size; i++) {
            // After each pass, the largest element moves to the end
            for (int j = 0; j < size - i - 1; j++) {

                if (nums[j] > nums[j + 1]) {
                    // swap adjacent elements
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        System.out.println();

        System.out.print("After sorting : ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}


/*
# Bubble Sort is a simple sorting algorithm that repeatedly compares
# adjacent elements and swaps them if they are in the wrong order.

* Pseudocode (With Explanation)

BubbleSort(arr):
    n = length of arr

    for i from 0 to n-1
        // number of passes through the array

        for j from 0 to n-i-2
            // compare adjacent elements in unsorted part

            if arr[j] > arr[j+1]
                swap arr[j] and arr[j+1]
                // larger element moves towards the end

    // after each pass, the largest element is placed at its correct position

* Time Complexity

| Case        | Complexity |
|------------|------------|
| Best       | O(n)       |
| Average    | O(n²)      |
| Worst      | O(n²)      |

* Space Complexity
O(1)

* Important Interview Points

Simple and easy to understand
Stable sorting algorithm
In-place sorting (no extra memory)
Not suitable for large datasets

* Real-Life Example

Arranging books by height by repeatedly swapping neighboring books
*/

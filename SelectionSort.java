public class SelectionSort {
    public static void main(String[] args) {

        int nums[] = {8, 5, 9, 4, 6, 3, 2, 1, 7};
        int size = nums.length;
        int minIndex;
        int temp;

        System.out.print("Before sorting : ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Selection Sort logic
        for (int i = 0; i < size - 1; i++) {

            minIndex = i;  // assume first element is minimum

            for (int j = i + 1; j < size; j++) {

                if (nums[j] < nums[minIndex]) {
                    minIndex = j;  // update minimum index
                }
            }

            // swap minimum element with first unsorted element
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

            // print array after each pass (for understanding)
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.print("After sorting : ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}


/*
# Selection Sort is a sorting algorithm that repeatedly selects the minimum
# element from the unsorted part and places it at the correct position.

* Pseudocode (With Explanation)

SelectionSort(arr):
    n = length of arr

    for i from 0 to n-2
        minIndex = i
        // assume first element of unsorted part is minimum

        for j from i+1 to n-1
            if arr[j] < arr[minIndex]
                minIndex = j
                // find the actual minimum element

        swap arr[i] and arr[minIndex]
        // place minimum element at correct position

* Time Complexity

| Case        | Complexity |
|------------|------------|
| Best       | O(n²)      |
| Average    | O(n²)      |
| Worst      | O(n²)      |

* Space Complexity
O(1)

* Important Interview Points

Not a stable sorting algorithm
In-place sorting (no extra memory)
Number of swaps is minimal
Slower than insertion sort for small data

“Why Selection Sort?”
“It minimizes the number of swaps, which is useful when write operations are costly.”
“Selection Sort places the smallest element at its correct position in every pass.”

* Real-Life Example

Selecting the smallest number repeatedly from a list
*/

public class BinarySearch_2 {

    public static int binarySearch(int arr[], int el) {

        int start = 0;                 // starting index of array
        int end = arr.length - 1;      // ending index of array

        while (start <= end) {

            // calculate middle index safely
            int mid = start + (end - start) / 2;

            if (arr[mid] == el) {
                return mid;            // element found at mid
            } 
            else if (arr[mid] < el) {
                start = mid + 1;       // search in right half
            } 
            else {
                end = mid - 1;         // search in left half
            }
        }
        return -1;                     // element not found
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Value found at index: " + binarySearch(arr, 6));
    }
}

    /*
# Binary Search is a searching algorithm that works on a sorted array.
# It repeatedly divides the search space into two halves until the element is found.

* Pseudocode (With Explanation)

BinarySearch(arr, element):
    start = 0                       // points to first index of array
    end = length of arr - 1         // points to last index of array

    while start <= end              // continue while search space is valid

        mid = start + (end - start) / 2
        // find middle index of current search range

        if arr[mid] == element
            return mid
            // element found at middle position

        else if arr[mid] < element
            start = mid + 1
            // element must be in right half, ignore left half

        else
            end = mid - 1
            // element must be in left half, ignore right half

    return -1
    // element not present in array

* Time Complexity

|     Case     | Complexity |
| ------------ | ---------- |
| Best Case    | O(1)       |
| Average Case | O(log n)   |
| Worst Case   | O(log n)   |

* Space Complexity
O(1)

* Important Interview Points

Works only on sorted arrays
Uses divide and conquer technique
Reduces search space by half every iteration
Much faster than linear search for large data

* Real-Life Example (Interview Favorite)

Searching a word in a dictionary
→ Open middle page, decide left or right → Binary Search
*/


public class LinearSearch_1 {

    public static int linearSearch(int arr[], int el) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el) {
                return i;   // element found
            }
        }
        return -1;  // element not found after full traversal
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 5, 8, 7};
        System.out.println("Value found at index: " + linearSearch(arr, 5));
    }
}


/*

# Linear Search is a searching algorithm that checks each element one by one until the target element is found or the list ends.

* Pseudocode

    LinearSearch(arr, element):
    for i from 0 to length of arr - 1
        if arr[i] == element
            return i
    return -1

* Time Complexity   

|     Case     | Complexity |
| ------------ | ---------- |
| Best Case    | O(1)       |
| Average Case | O(n)       |
| Worst Case   | O(n)       |

* Space Complexity - O(1)

* Important Interview Points

Works on sorted & unsorted arrays
Simple and easy to implement
Inefficient for large datasets
Used when data size is small or unsorted

* Real-Life Example (Interview Favorite)

Searching a contact name in an unsorted phone contact list
→ You check each contact one by one → Linear Search


*/
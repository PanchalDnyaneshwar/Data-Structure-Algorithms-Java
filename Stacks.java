public class Stacks {

    int stack[] = new int[4];   // initial capacity
    int top = 0;                // points to next free position

    // Push element into stack
    public void push(int el) {

        // if stack is full → expand
        if (top == stack.length) {
            expand();
        }

        stack[top] = el;
        top++;
    }

    // Expand stack size (double)
    private void expand() {

        int newStack[] = new int[stack.length * 2];

        // copy old elements
        for (int i = 0; i < stack.length; i++) {
            newStack[i] = stack[i];
        }

        stack = newStack;
    }

    // Pop element from stack
    public int pop() {

        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        top--;
        int data = stack[top];
        stack[top] = 0; // optional cleanup

        // if stack is under-utilized → shrink
        if (top > 0 && top == stack.length / 4) {
            shrink();
        }

        return data;
    }

    // Shrink stack size (half)
    private void shrink() {

        int newStack[] = new int[stack.length / 2];

        // copy elements
        for (int i = 0; i < top; i++) {
            newStack[i] = stack[i];
        }

        stack = newStack;
    }

    // Peek top element
    public int peek() {

        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return stack[top - 1];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == 0;
    }

    // Display stack
    public void show() {

        for (int i = 0; i < top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Stacks num = new Stacks();

        num.push(10);
        num.push(20);
        num.push(30);
        num.push(40);
        num.push(50); // expand happens

        num.pop();
        num.pop();
        num.pop();    // shrink may happen

        num.show();
    }
}


/*
# Stack is a linear data structure that follows LIFO (Last In First Out).

* Expand Logic
- When stack is full (top == capacity)
- Create new array of double size
- Copy old elements
- Update reference

* Shrink Logic
- When stack is only 25% used
- Create new array of half size
- Copy elements
- Save memory

* Pseudocode (With Explanation)

Push(element):
    if stack is full
        expand stack
    insert element at top
    increment top

Pop():
    if stack is empty
        return error
    decrement top
    if stack is under-utilized
        shrink stack
    return popped element

* Time Complexity

Push → O(1) amortized
Pop  → O(1) amortized
Peek → O(1)

* Space Complexity
O(n)

* Important Interview Points

Dynamic resizing avoids overflow and memory waste
Expand → capacity * 2
Shrink → capacity / 2
Shrink threshold usually at 25%
Used in real systems (ArrayList internally)

* Real-Life Example

Browser back button
Undo/Redo operations
Function call stack
*/

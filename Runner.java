class Node {
    int data;      // value stored in node
    Node next;     // reference to next node
}

class LinkList {
    Node head;     // head of linked list

    // Insert element at end
    public void insert(int data) {

        Node node = new Node();   // create new node
        node.data = data;
        node.next = null;

        // if list is empty
        if (head == null) {
            head = node;
        } 
        else {
            Node n = head;

            // traverse till last node
            while (n.next != null) {
                n = n.next;
            }

            // attach new node at end
            n.next = node;
        }
    }

    // Display linked list
    public void show() {

        Node node = head;

        // traverse till end
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public void deleteAt(int index)
    {
        if (index == 0) {
            head = head.next;
        }
        else{
            Node n = head;
            Node n1 = null;
            for(int i=0; i<index; i++){
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            // System.out.println("n1 " + n1.data);
            n1=null;
        }
    }
}

public class Runner {
    public static void main(String[] args) {

        LinkList list = new LinkList();

        list.insert(5);
        list.insert(9);
        list.insert(7);
        list.insert(3);
        list.deleteAt(2);
        list.show();
    }
}

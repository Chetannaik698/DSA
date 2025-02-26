package LinkedList;

public class DoubleLinkedList {

    public class Node {
        int data;
        Node next;
        Node prev;

        // constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // add last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode = tail.prev;
        tail = newNode;
    }

    // print
    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Size: " + size);
    }

    // remove
    public int removeFirst() {
        if (head == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        tail.next = head;
        tail.prev = null;
        size--;
        return val;
    }

    // remove
    public int removeLast() {
        if (head == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
    
        int val = tail.data;
        tail = tail.prev;  // Move tail to previous node
        tail.next = null;  // Disconnect the old tail
        size--;
        
        return val;
    }

    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next  = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addFirst(0);

        list.addLast(4);
        list.print();

        list.reverse();
        list.print();
        
    }
}

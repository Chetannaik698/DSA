package LinkedList;

public class Test {

    public static class LinkedList {

        public static class Node {
            int data;
            Node next;

            // constructor
            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public static Node head;
        public static Node tail;

        public static int size = 0;

        public void addFirst(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = tail = newNode;// here it will become both head and tail
                return;
            }

            newNode.next = head;

            head = newNode;

            size++;
        }

        public void addLast(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;

            tail = newNode;

            size++;
        }

        public void print() {
            if (head == null) {
                System.out.println("Lnked list is empty");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();

            System.out.println("size: " + size);
        }

        public void addMiddle(int idx, int data) {
            if (idx == 0) {
                addFirst(data);
                return;
            }
            Node newNode = new Node(data);
            Node temp = head;
            int i = 0;

            while (i < idx - 1) {
                temp = temp.next;
                i++;
            }

            newNode.next = temp.next;
            temp.next = newNode;

            size++;

        }

        public int removeFirst() {
            if (size == 0) {
                System.out.println("Linked list is empty");
                return Integer.MIN_VALUE;
            } else if (size == 1) {
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }

        public int removeLast() {
            if (size == 0) {
                System.out.println("Linked list is empty");
                return Integer.MIN_VALUE;
            } else if (size == 1) {
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }

            Node prev = head;
            for (int i = 0; i < size - 2; i++) {
                prev = prev.next;
            }
            int val = prev.next.data;
            prev.next = null;
            tail = prev;
            size--;
            return val;
        }

        public int itrSearch(int key) {
            Node temp = head;
            int i = 0;

            while (temp != null) {
                if (temp.data == key) {
                    return i;
                }
                temp = temp.next;
                i++;
            }
            return -1;
        }

        public int helper(Node head, int key) {
            if (head == null) {
                return -1;
            }
            if (head.data == key) {
                return 0;
            }
            int idx = helper(head.next, key);
            if (idx == -1) {
                return -1;
            }
            return idx + 1;
        }

        public int recSearch(int key) {
            return helper(head, key);
        }

        public void reverse() {
            Node prev = null;
            Node curr = tail = head;
            Node next;

            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }
      
        public void deleteNthfromEnd(int n) { //important
            //calculate size
            int size = 0;
            Node temp = head;
            while (temp != null) {
                temp = temp.next;
                size++;
            }
            if (n == size) {
                head = head.next;
            }
            //
            int i=1;
            int indToFnd = size - n;
            Node prev = head;
            while (i < indToFnd) {
                prev = prev.next;
                i++;
            }
            prev.next = prev.next.next;
            return;
        }

    } 

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(20);
        list.addFirst(10);
        list.addLast(30);
        list.addLast(40);
        list.addMiddle(3, 35);

        // list.removeFirst();
        // list.removeLast();

         list.print();
         list.deleteNthfromEnd(3);
         list.print();
    }
}

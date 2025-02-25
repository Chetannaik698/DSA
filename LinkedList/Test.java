package LinkedList;

import LinkedList.Test.LinkedList.Node;

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

        public void deleteNthfromEnd(int n) { // important
            // calculate size
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
            int i = 1;
            int indToFnd = size - n;
            Node prev = head;
            while (i < indToFnd) {
                prev = prev.next;
                i++;
            }
            prev.next = prev.next.next;
            return;
        }

        // slow fast approach
        public Node findMid(Node head) {
            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next; // +1
                fast = fast.next.next; // +2
            }
            return slow;
        }

        public boolean isPalindrome() {
            if (head == null || head.next == null) {
                return true;
            }
            // setp1 - find mid
            Node midNode = findMid(head);

            // step2 - reverse 2nd half
            Node prev = null;
            Node curr = midNode;
            Node next;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            Node right = prev; // right half head
            Node left = head;

            // ste3 - check left half and right half
            while (right != null) {
                if (left.data != right.data) {
                    return false;
                }
                left = left.next;
                right = right.next;
            }
            return true;
        }

        public static boolean isCycle() {
            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    return true;
                }
            }
            return false;
        }

        public static void removeCycle() {
            // detect cycle
            Node slow = head;
            Node fast = head;

            boolean cycle = false;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                   cycle = true;
                   return;
                }
            }
            if (cycle == false) {
                return;
            }

            // find meeting point
            slow = head;
            Node prev = null;
            while (slow != fast) {
                prev = fast;
                slow = slow.next;
                fast = fast.next;
            }

            // remove cycle -> last.next = null
            prev.next = null; 
        }

    }

    public static void main(String[] args) {
        // LinkedList list = new LinkedList();
        // list.addFirst(2);
        // list.addFirst(2);
        // list.addFirst(1);
        // list.addFirst(2);
        // list.addFirst(3);

        // list.print();
        // System.out.println(list.isPalindrome());

        // cycle in lined list
        LinkedList.head = new LinkedList.Node(1);
        Node temp = new Node(2);
        LinkedList.head.next = new LinkedList.Node(2);
        LinkedList.head.next.next = new LinkedList.Node(3);
        LinkedList.head.next.next.next = temp;

        System.out.println(LinkedList.isCycle());
        LinkedList.removeCycle();
        System.out.println(LinkedList.isCycle());
    }
}

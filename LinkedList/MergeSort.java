package LinkedList;

import java.util.LinkedList;

import LinkedList.Test.LinkedList.Node;

public class MergeSort {
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node head1, Node head2) {
        Node mergeAll = new Node(-1);
        Node temp = mergeAll;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergeAll.next;
    }

     public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        //find mid
        Node mid = getMid(head);
        //left and right Ms
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft, newRight);
     }

     //print
     public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();

        // Create linked list
        Node head = new Node(6);
        head.next = new Node(3);
        head.next.next = new Node(1);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(4);

        System.out.println("Original list:");
        ms.printList(head);

        // Sort the list
        head = ms.mergeSort(head);

        System.out.println("Sorted list:");
        ms.printList(head);
    }
}

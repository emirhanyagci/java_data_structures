package linked_list.node;

import linked_list.Node;

public class Main {
    public static void main(String[] args) {
        // single linked
//       BList list = new BList();
//       list.initalize(45);
//       list.addElementLast(60);
//       list.addElementLast(30);
//       list.printLinkedList();
        // doubly linked list
        AList list = new AList();
        list.initalize(30);
        list.addLast(45);
        list.addLast(15);
        Node head = new Node();
        head.data = 35;
        head.next = new Node();
        head.next.data =45;
        Node temp = head;
        temp = temp.next;
        System.out.println(temp.data);
        list.printList();
    }
}

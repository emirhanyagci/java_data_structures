package linked_list.node;

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

        list.printList();
    }
}

package linked_list.node;
// this is single linked list
public class BList {
    Node head = null;
    public void initalize(int data){
        head  = new Node();
        head.data = data;
        head.next = null;
    }
    public void addElementLast(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        Node temp  = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void addElementFront(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }
    public void printLinkedList(){
        Node temp = head;
        while(temp !=null){
            System.out.println(temp.data+"=>");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}

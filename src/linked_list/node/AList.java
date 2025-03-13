package linked_list.node;
// this is doubly linked list
public class AList {
    Node head = null;
    public void initalize(int data){
        head = new Node();
        head.prev = null;
        head.next = null;
        head.data = data;
    }
    public void addBegin(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.prev = null;
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node();
        newNode.data =data;
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;

    }
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data+"=>");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}

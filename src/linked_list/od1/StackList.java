package linked_list.od1;

import linked_list.Node;

import java.util.EmptyStackException;

public class StackList {
    Node[] arr;
    int size;
    int index;
    public StackList(int size){
        this.size = size;
        arr = new Node[size];
        index = -1;
    }
    public boolean isFull() {
        return index == size - 1;
    }

    public boolean isEmpty() {
        return index == -1;
    }

    public void push(Node value) {
        if (isFull()) {
            System.out.println("Stack is full!");
            return;
        }
        arr[++index] = value;
    }
    public Node peek(){
        if(isEmpty()){
            return null;
        }
        return arr[index];
    }
    public Node pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            throw new EmptyStackException();
        }
        return arr[index--];
    }
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
        }
        System.out.println("Stack elements:");
        for (int i = index; i >= 0; i--) {
            System.out.println(arr[i].data);
        }
    }

}

package linked_list.od1;

import linked_list.Node;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Node list = new Node();
        StackList listStack = new StackList(10);
        Node temp = list;
        Scanner reader = new Scanner(System.in);

        for (int i = 0; i < 10;i++){
            temp.next = new Node();
            temp = temp.next;
            temp.data = i+1;
            listStack.push(temp);
        }
        list = list.next;
        listStack.printStack();

        int start = reader.nextInt();
        int end = reader.nextInt();

        StackList tempTop = new StackList(9-end);
        StackList tempSearch = new StackList(end-start + 1);
        StackList tempReverse = new StackList(end-start + 1);

        for (int i = 0;i<9-end;i++){
            tempTop.push(listStack.pop());
        }
        for (int i = 0;i<end-start + 1;i++){
            tempSearch.push(listStack.pop());
        }
        while(!tempSearch.isEmpty()){
            tempReverse.push(tempSearch.pop());
        }
        for (int i = start; i < 10;i++){
            while(!tempReverse.isEmpty()){
                listStack.push(tempReverse.pop());
            }
            while(!tempTop.isEmpty()){
                listStack.push(tempTop.pop());
            }
        }

        listStack.printStack();

//        temp = list;
//        while(temp != null){
//            System.out.println(temp.data);
//            temp = temp.next;
//        }
    }
}

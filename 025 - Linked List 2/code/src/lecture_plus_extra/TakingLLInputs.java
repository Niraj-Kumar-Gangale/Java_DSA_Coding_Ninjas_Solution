package lecture_plus_extra;

import java.util.Scanner;

public class TakingLLInputs {

    public static Node<Integer> takingInput (){

        Node<Integer> head = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        while (data !=-1){
            Node<Integer> newNode = new Node<>(data);
            if (head ==null){
                head = newNode;
            }else{
                Node<Integer> temp = head ;
                while (temp.next != null){
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            data = sc.nextInt();
        }
        return head;
    }

}

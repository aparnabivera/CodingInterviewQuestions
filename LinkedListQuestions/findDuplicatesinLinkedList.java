package LinkedListQuestions;

import java.util.LinkedList;

import static LinkedListQuestions.LinkedList.createLinkedList;
import static LinkedListQuestions.LinkedList.display;

public class findDuplicatesinLinkedList {

    public static LinkedListNode removeDuplicates(LinkedListNode head) {
        LinkedListNode first = head;
        LinkedListNode second = head;
        LinkedListNode prev = head;
        while(first!=null && first.next!=null)
        {second = first.next;
            while(second!=null)
            {
                if(second.data == first.data)
                {
                    prev.next = second.next;
                }

                prev = second;
                second = second.next;
            }
            first = first.next;
        }

        return head;
    }

    public static void main(String[] args)
    {
        int[] listValues = new int[]{4, 55, 4,2321, 1000};
        LinkedListNode list= createLinkedList(listValues);
        display(list);

        System.out.println("List after deletion");
        display(removeDuplicates(list));
    }
}

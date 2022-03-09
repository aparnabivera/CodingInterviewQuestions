package LinkedListQuestions;

public class removeDuplicatesInSortedList {

    public static LinkedListNode deleteDuplicates(LinkedListNode head) {

        LinkedListNode current = head;

        while(current!=null && current.next!=null)
        {
            if(current.data == current.next.data)
            {
                current.next = current.next.next;
            }
            else
                current = current.next;




        }

        return head;
    }

    public static void main(String[] args)
    {
        int[] array1 = new int[]{1,1,1,2,4};

        LinkedListNode list1 = LinkedList.createLinkedList(array1);


        LinkedListNode result = deleteDuplicates(list1);
        while(result!=null)
        {
            System.out.println(result.data);
            result = result.next;
        }
    }
}

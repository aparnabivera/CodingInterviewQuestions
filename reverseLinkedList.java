public class reverseLinkedList {

    public static LinkedListNode reverseList(LinkedListNode head)
    {
        LinkedListNode prev = null;
        LinkedListNode curr = head;
        LinkedListNode next = null;

        if(head == null || head.next==null)
        {
            return head;
        }

        while(curr!=null)
        {

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
          curr = prev;
        return curr;
    }

    public static void main(String[] args)
    {
        int[] listValues = new int[]{3, 5, 6, 7, 9,10};
        LinkedListNode list= LinkedList.createLinkedList(listValues);
        LinkedList.display(list);
        LinkedListNode reverseList =reverseList(list);
        LinkedList.display(reverseList);
    }


}

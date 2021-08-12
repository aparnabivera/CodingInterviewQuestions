public class LinkedList {

    LinkedList head;
    public static LinkedListNode insertAtHead(LinkedListNode head, int data)
    {
      LinkedListNode newNode = new LinkedListNode(data);

      newNode.next = head;

      return newNode;
    }

    public static LinkedListNode insertAtTail(LinkedListNode head, int data)
    {
        LinkedListNode newNode = new LinkedListNode(data);
       if(head==null)
       {

           return newNode;
       }

       LinkedListNode temp = head;
       while (temp!=null)
       {
           temp=temp.next;
       }
       temp = newNode;
       return head;

    }

    public static LinkedListNode createLinkedList(int[] arr)
    {
        LinkedListNode head=null;
        LinkedListNode tail = null;
        for (int i = 0; i < arr.length; ++i)
        {
            LinkedListNode newNode = new LinkedListNode(arr[i]);
            if(head==null)
            {
                head = newNode;
            }
            else
            {
                tail.next = newNode;
            }

            tail = newNode;

        }

        return head;
    }

    public static void display(LinkedListNode head)
    {
        if(head == null)
        {
            System.out.println("The Linkedlist is empty");
            return;
        }
        LinkedListNode curr =head;
        while(curr!=null)
        {
            System.out.print(curr.data+" ,");
            curr = curr.next;

        }
        System.out.println(" ");
    }

    public static void main(String[] args)
    {
        int[] listValues = new int[]{3, 5, 6, 7, 9,10};
        LinkedListNode list= createLinkedList(listValues);
        display(list);

    }

}

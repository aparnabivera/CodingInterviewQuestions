package LinkedListQuestions;

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
       while (temp.next!=null)
       {
           temp=temp.next;
       }
       temp.next = newNode;
       return head;

    }

    public static void insertAfter(LinkedListNode head,int value , int previous)
    {
        LinkedListNode newNode = new LinkedListNode(value);
        LinkedListNode curr = head;

        while(curr!=null && curr.data!=previous)
        {
            curr = curr.next;
        }

        if(curr!=null) {
            newNode.next = curr.next;
            curr.next = newNode;
        }


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

    public static LinkedListNode deleteAtHeadNode(LinkedListNode head)
    {
        if(isEmpty(head))
            return head;

        head = head.next;

        return head;
    }

    public static LinkedListNode deleteByValue(LinkedListNode head, int val)
    {
        if(isEmpty(head))
            return null;

        LinkedListNode curr = head;
        LinkedListNode prev = null;
        if(curr.data == val )
        {
            return deleteAtHeadNode(head);
        }

        while(curr!=null)
        {
            if(curr.data == val)
            { prev.next = curr.next;
            }

            prev = curr;
            curr = curr.next;


        }

        return head;
    }

    public static boolean isEmpty(LinkedListNode head)
    {
        if(head == null)
            return true;

        return false;
    }

    public static boolean searchNode(LinkedListNode head ,int searchValue)
    {
        LinkedListNode curr = head;

        while(curr != null)
        {
            if(curr.data == searchValue)
                return true;

            curr = curr.next;
        }


        return false;
    }

    public static void main(String[] args)
    {
        int[] listValues = new int[]{3, 5, 6, 7, 9,10};
        LinkedListNode list= createLinkedList(listValues);
        display(list);
        insertAfter(list, 8, 7 );
        display(list);
        insertAtTail(list,11);
        insertAtTail(list,14);
        display(list);
        System.out.println("LinkedList contains value 6 ="+searchNode(list,13));

        display(deleteAtHeadNode(list));
        System.out.println("Original List = ");
        display(list);
        System.out.println("List after deleting value 9");
        display(deleteByValue(list, 9));


    }

}

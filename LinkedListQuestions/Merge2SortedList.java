package LinkedListQuestions;

public class Merge2SortedList {



        public static LinkedListNode mergeTwoLists(LinkedListNode list1, LinkedListNode list2) {

            LinkedListNode current = new LinkedListNode(-1);
            LinkedListNode head = current;

            while(list1!=null && list2 !=null)
            {
                if(list1.data < list2.data)
                {
                    current.next = list1;
                    list1 = list1.next;
                }
                else
                {
                    current.next = list2;
                    list2 = list2.next;
                }
                current = current.next;
            }
            if(list1!=null)
            {
                current.next = list1;
            }
            if(list2!=null)
            {
                current.next = list2;
            }

            return head.next;
        }

        public static void main(String[] args)
        {
            int[] array1 = new int[]{1,2,4};
            int[] array2 = new int[]{1,3,4};
            LinkedListNode list1 = LinkedList.createLinkedList(array1);

            LinkedListNode list2 = LinkedList.createLinkedList(array2);

            LinkedListNode result = mergeTwoLists(list1,list2);
            while(result!=null)
            {
                System.out.println(result.data);
                result = result.next;
            }
        }
    }


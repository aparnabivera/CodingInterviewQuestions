package LinkedListQuestions;

public class hasCycle {

    public static boolean hasCycle(LinkedListNode head) {
        LinkedListNode current = head;
        LinkedListNode fast = head;
        //current = current.next;


        while (fast != null && fast.next != null) {
            current = current.next;
            fast = fast.next.next;

            if (current == fast)
                return true;


        }
        return false;
    }


    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 4};

        LinkedListNode list1 = LinkedList.createLinkedList(array1);
        LinkedListNode tail = list1;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = list1;

        if (hasCycle(tail))
            System.out.println("It is a cycle");
        else
            System.out.println("It is not a cycle");
    }
}

//Given the head of a linked list, remove the nth node from the end of the list and return its head.
//Input: head = [1,2,3,4,5], n = 2
//Output: [1,2,3,5]

package LeetCodeInterviewQuestions;

public class removeNthNodefromEndList {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(n<=0)
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        //dummy = dummy.next;
        ListNode slow =  dummy;
        ListNode fast =  dummy;

        for(int i=0;i<n+1; i++)
        {
            fast = fast.next;
        }

        while(fast!=null)
        {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;

    }
}

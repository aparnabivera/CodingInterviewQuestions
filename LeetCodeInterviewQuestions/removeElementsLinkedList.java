
//Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val,
// and return the new head.

package LeetCodeInterviewQuestions;

public class removeElementsLinkedList {
    public ListNode removeElements(ListNode head, int val) {

        while(head!=null && head.val == val)
        {
            head = head.next;
        }

        ListNode current = head;

        while(current!=null && current.next!=null)
        {
            if(current.next.val == val)
                current.next = current.next.next;
            else
                current= current.next;
        }
        return head;
    }
}

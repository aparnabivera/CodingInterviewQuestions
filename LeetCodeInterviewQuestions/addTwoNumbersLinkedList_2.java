/*You are given two non-empty linked lists representing two non-negative integers.
 The digits are stored in reverse order, and each of their nodes contains a single digit.
 Add the two numbers and return the sum as a linked list.*/
/*Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        Output: [8,9,9,9,0,0,0,1]*/

package LeetCodeInterviewQuestions;


public class addTwoNumbersLinkedList_2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy =new ListNode(0);
        ListNode result_head = dummy;
        int carry = 0;
        while(l1!=null || l2!=null)
        {
            int val1 =(l1!=null)?l1.val:0;
            int val2 =(l2!=null)?l2.val:0;

            int sum = (val1 + val2 + carry)%10;
            ListNode newNode = new ListNode(sum);
            result_head.next = newNode;
            carry = (val1 + val2 + carry) / 10;
            if(l1!=null)l1=l1.next;
            if(l2!=null)l2=l2.next;
            result_head = result_head.next;


        }
        if(carry!=0)
        {
            result_head.next = new ListNode(carry);
        }

        return dummy.next;
    }
}

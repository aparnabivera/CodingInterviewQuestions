package LeetCodeInterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfLinkedList_160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        Set<ListNode> listAValues = new HashSet<>();

        while(headA!=null)
        {
            listAValues.add(headA);
            headA= headA.next;
        }

        while(headB!=null)

        {
            if(listAValues.contains(headB))
                return headB;
            else
                headB = headB.next;
        }

        return null;
    }


}

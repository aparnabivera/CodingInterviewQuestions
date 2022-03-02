package LinkedListQuestions;


public class PalindromeChallenge {
    public static <T> boolean isPalindrome(DoublyLinkedList<T> list) {
        //Write Your Code Here
        DoublyLinkedList<T>.Node headEnd = list.getHeadNode();
        DoublyLinkedList<T>.Node tailEnd = list.getTailNode();
        if(list.isEmpty())
        {
            return false;
        }

        while(headEnd!=null && tailEnd!=null)
        {
            if(headEnd.data != tailEnd.data)
            {
                return false;
            }
            headEnd = headEnd.nextNode;
            tailEnd = tailEnd.prevNode;
        }
        return true;
    }

    public static void main( String args[] ) {
        DoublyLinkedList<Integer> list1 = new DoublyLinkedList<Integer>();
        list1.insertAtEnd(1);
        list1.insertAtEnd(2);
        list1.insertAtEnd(2);
        list1.insertAtEnd(1);
        System.out.print("1st ");
        list1.printList();
        DoublyLinkedList<Integer> list2 = new DoublyLinkedList<Integer>();
        list2.insertAtEnd(6);
        list2.insertAtEnd(8);
        list2.insertAtEnd(6);
        list2.insertAtEnd(6);
        System.out.print("2nd ");
        list2.printList();
        System.out.println("Is 1st list a palindrome?  " + isPalindrome(list1));
        System.out.println("Is 2nd list a palindrome?  " + isPalindrome(list2));

    }


}

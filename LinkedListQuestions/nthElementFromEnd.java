package LinkedListQuestions;

public class nthElementFromEnd {

    public static <T> Object nthElementFromEndMethod(SinglyLinkedList<T> list, int n) {
        // Write -- Your -- Code
        SinglyLinkedList<T>.Node curr = list.getHeadNode();
        int length =list.getSize(curr);
        if (length == 0 || n > length) {
            return null; //returns null if list is empty or n is greater than size
        }
        int count=0;
        if(length%2 == 1 && length >3)
        {  n= length - n ;
            curr = list.getHeadNode();
            while(curr!=null)
            {
                if(count ==n)
                {
                    return curr.data;
                }
                count++;;
                curr = curr.nextNode;
            }
        }
        else
        {n = length - n;
            curr = list.getHeadNode();
            while(curr!=null)
            {
                if(count ==n)
                {
                    return curr.data;
                }
                count++;;
                curr = curr.nextNode;
            }
        }

        return null;
    }
    public static void main( String args[] ) {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        sll.printList(); //list is empty
        System.out.println("3rd element from end : " + nthElementFromEndMethod(sll, 3)); //will return null
        for(int i=0; i<15; i+=2){
            sll.insertAtHead(i);
        }
        sll.printList(); // List is 14 -> 12 -> 10 -> 8 -> 6 -> 4 -> 2 -> 0 -> null
        System.out.println("3rd element from end : " + nthElementFromEndMethod(sll, 3)); //will return 4
        System.out.println("10th element from end : " + nthElementFromEndMethod(sll, 10));//will return null
    }





}


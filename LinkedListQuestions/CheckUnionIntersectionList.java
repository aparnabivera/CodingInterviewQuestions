package LinkedListQuestions;


class CheckUnionIntersectionList {
    //performs union of two lists
    public static <T> SinglyLinkedList<T> union(SinglyLinkedList<T> list1, SinglyLinkedList<T> list2) {
        if(list1.isEmpty())
        {
            return list2;
        }
        if(list2.isEmpty())
        {
            return list1;
        }

        SinglyLinkedList<T> result = new SinglyLinkedList<T>();

        SinglyLinkedList<T>.Node curr = result.getHeadNode();
        curr= list1.getHeadNode();

        while(curr.nextNode!=null)
        {   System.out.print(curr.data);
            curr = curr.nextNode;
        }


        if(curr.nextNode==null)
        {
            curr.nextNode = list2.getHeadNode();
        }

        list1.removeDuplicatesWithHashing();
        // Write -- Your -- Code
        return list1;
    }

    //performs intersection between list
    public static <T> SinglyLinkedList<T> intersection(SinglyLinkedList<T> list1, SinglyLinkedList<T> list2) {
        SinglyLinkedList<T> result = new SinglyLinkedList<T>();
        SinglyLinkedList<T>.Node first = list1.getHeadNode();
        SinglyLinkedList<T>.Node second = list2.getHeadNode();

        if(list1.isEmpty() || list2.isEmpty())
            return result;

        while(first!=null)
        {
            if (list1.search(list2.getHeadNode(),first.data))
            {
                result.insertAtHead(first.data);
            }
            first = first.nextNode;
        }

        // Write -- Your -- Code
        return result;
    }

    public static void main( String args[] ) {
        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<Integer>();
        for(int i=7; i>3; i--){
            list1.insertAtHead(i);
        }
        System.out.print("1st ");
        list1.printList();
        SinglyLinkedList<Integer> list2 = new SinglyLinkedList<Integer>();
        for(int i=0; i<5; i++){
            list2.insertAtHead(i);
        }
        System.out.print("2nd ");
        list2.printList();
        System.out.print("After Intersection ");
        intersection(list1, list2).printList();
        System.out.print("After Union ");
        union(list1, list2).printList();
    }
}
package Trees;

//Find the minimum value in a binary search tree
public class CheckMin {

    public static int findMin(Node root)
    {
// Write - Your - Code
        if(root == null)
            return -1;
        Node currentNode = root;

        while(currentNode!=null && currentNode.getLeftChild()!=null )
        {
            currentNode = currentNode.getLeftChild();
        }
        return currentNode.getData();
    }

    public static void main(String args[]) {

        binarySearchTree bsT = new binarySearchTree();
        bsT.add(6);
        bsT.add(4);
        bsT.add(9);
        bsT.add(5);
        bsT.add(2);
        bsT.add(8);
        bsT.add(12);
        bsT.add(10);
        bsT.add(14);

        System.out.println(findMin(bsT.getRoot()));

    }
}

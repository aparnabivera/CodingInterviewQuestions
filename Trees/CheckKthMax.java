package Trees;


//Find Kth Maximum Value
public class CheckKthMax {

    public static int findKthMax(Node root, int k) {

        StringBuilder result = new StringBuilder();
        String[] resultArray = inorderTraversal(root, result).toString().split(",");

        if(resultArray.length-k>0)
        {
            return Integer.parseInt(resultArray[resultArray.length - k]);
        }
// Write - Your - Code
        return -1;
    }

    public static StringBuilder inorderTraversal(Node root, StringBuilder result)
    {
        if(root.getLeftChild()!=null)inorderTraversal(root.getLeftChild(),result);
        result.append(root.getData()+",");
        if(root.getRightChild()!=null) inorderTraversal(root.getRightChild(), result);
        return result;

    }

    public static void main(String args[]) {

        binarySearchTree bsT = new binarySearchTree();

        bsT.add(6);

        bsT.add(4);
        bsT.add(9);
        bsT.add(5);
        bsT.add(2);
        bsT.add(8);

        System.out.println(findKthMax(bsT.getRoot(),3));
    }
}

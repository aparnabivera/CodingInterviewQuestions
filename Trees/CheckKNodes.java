package Trees;

//Find Nodes at kth distance from the root

class CheckKNodes {

    public static String findKNodes(Node root, int k) {

        StringBuilder result = new StringBuilder();
        result = findK(root,k,result);
//Write Your Code Here
        return result.toString();
    }
    public static StringBuilder findK(Node root, int k, StringBuilder result)
    {
        if(root == null)return null;
        if(k==0)
        {
            result.append(root.getData()+",");
        }
        else
        {
            findK(root.getLeftChild(), k-1, result);
            findK(root.getRightChild(), k-1, result);
        }

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
        bsT.add(12);
        System.out.println(findKNodes(bsT.getRoot(), 2));

    }

}


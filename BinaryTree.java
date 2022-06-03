

public class BinaryTree{
    Node root;

    private Node addRecursive(Node current, int val){
        if(current == null)
        {

            return new Node(val);
        }
        else if(val < current.data)
        {
            current.left = addRecursive(current.left, val);
        }
        else if(val> current.data)
        {
            current.right = addRecursive(current.right, val);
        }
        else
        {   //value already exists.
            return current;
        }

        return current;
    }

    public void add (int value)
    {
        root = addRecursive(root,value);
    }

    public BinaryTree createBinaryTree()
    {
        BinaryTree tree = new BinaryTree();
        tree.add(6);
        tree.add(4);
        tree.add(8);
        tree.add(3);
        tree.add(5);
        tree.add(7);
        tree.add(9);

        return tree;
    }

    public void traverseInorder(Node node)
    {
        traverseInorder(node.left);
        System.out.println(" "+node.data);
        traverseInorder(node.right);
    }


}


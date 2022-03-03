package Trees;


//Find Ancestors of Given Node in Binary Search Tree
public class CheckAncestors {
    public static String findAncestors(Node root, int k) {

        StringBuilder ancestors = new StringBuilder();
        Node currentNode = root;
        while(currentNode!=null)
        {
            if(k < currentNode.getData())
            {
                ancestors.append(currentNode.getData()+",");
                currentNode = currentNode.getLeftChild();
            }
            else if(k > currentNode.getData())
            {
                ancestors.append(currentNode.getData()+",");
                currentNode = currentNode.getRightChild();
            }
            else if(k== currentNode.getData())
            {
                return ancestors.toString();
            }
        }

        return "";
    }

    public static void main(String[] args)
    {
        binarySearchTree tree = new binarySearchTree();
		/* Construct a binary tree like this
				6
			   / \
			  4   9
			 / \  |  \
			2	5 8	  12
					  / \
					 10  14
		*/
        tree.add(6);
        tree.add(4);
        tree.add(9);
        tree.add(2);
        tree.add(5);
        tree.add(8);
        tree.add(8);
        tree.add(12);
        tree.add(10);
        tree.add(14);

        int key = 10;
        System.out.print(key + " --> ");
        System.out.print(findAncestors(tree.getRoot(), key));

        System.out.println();
        key = 5;
        System.out.print(key + " --> ");
        System.out.print(findAncestors(tree.getRoot(), key));
    }
}

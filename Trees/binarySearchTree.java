package Trees;


public class binarySearchTree {

    Node root;



    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public boolean isEmpty()
    {
        return root == null;
    }

    public boolean add(int value)
    {
       root= recursive_insert(this.root,value);
        return true;
    }

    public Node recursive_insert(Node currentNode, int value)
    {
        if(currentNode == null)
        {
            return new Node(value);

        }


            if(value<currentNode.getData())
            {
                currentNode.setLeftChild(recursive_insert(currentNode.getLeftChild(),value));

            }
            else if(value>currentNode.getData())
            {
                currentNode.setRightChild(recursive_insert(currentNode.getRightChild(),value));
            }
            else
            {
                return currentNode;
            }

        return currentNode;
    }
    public boolean addIterative(int value) {
        if (isEmpty())
        {
            root = new Node(value);
            return true;
        }

        Node currentNode = root;

        while(currentNode!=null)
        {
            Node leftChild = currentNode.getLeftChild();
            Node rightChild = currentNode.getRightChild();

            if(value < currentNode.getData())
            {
                if(leftChild == null)
                {
                    leftChild = new Node(value);
                    currentNode.setLeftChild(leftChild);
                    return true;
                }
                currentNode = leftChild;
            }
            else
            {
                if(rightChild == null)
                {
                    rightChild = new Node(value);
                    currentNode.setRightChild(rightChild);
                    return true;
                }
                currentNode = rightChild;
            } // end of else
        } // end of while

        return false;
    }

    public void print(Node current)
    {
        if(isEmpty())
        {
            System.out.println("The tree is EMpty");
        }

        if(current== null)
            return;

        System.out.println(current.getData()+",");
         print(current.getLeftChild());
        print(current.getRightChild());
    }

    public Node search(int value)
    {
        if(isEmpty())
            return null;

        return recursive_Search(this.getRoot(),value);
    }

    public Node recursive_Search(Node curr, int value)
    {
        if(curr== null || curr.getData() == value)
            return curr;

        if(value < curr.getData())
        {
            return recursive_Search(curr.getLeftChild(),value);
        }
        else
        {
            return recursive_Search(curr.getRightChild(), value);
        }


    }

    public static void main(String[] args)
    {

    }
}

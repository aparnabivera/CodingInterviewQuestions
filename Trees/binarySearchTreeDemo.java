package Trees;

public class binarySearchTreeDemo {

    public static void main(String args[]) {
        binarySearchTree bsT = new binarySearchTree();

     /*   bsT.addIterative(6);
        bsT.addIterative(4);
        bsT.addIterative(9);
        bsT.addIterative(5);
        bsT.addIterative(2);
        bsT.addIterative(8);
        bsT.addIterative(12);
        bsT.addIterative(10);
        bsT.addIterative(14);*/
        bsT.add(6);
        bsT.add(4);
        bsT.add(9);
        bsT.add(5);
        bsT.add(2);
        bsT.add(8);
        bsT.add(12);
        bsT.add(10);
        bsT.add(14);
        bsT.print(bsT.getRoot());

        Node value = bsT.search(2);
        if(value == null) {
            System.out.println("Search value 2 not found");
        }
        else
            System.out.println(value.getData()+" found in the tree");

    }
}

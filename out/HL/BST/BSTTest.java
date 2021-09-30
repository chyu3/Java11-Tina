public class BSTTest
{
    public static void main(String[] args)
    {
        BST b = new BST(5);
        b.add(12);
        b.add(3);
        b.add(9);
        b.add(2);
        System.out.println("preOrder traversal: ");
        b.preOrder(b.getRoot());
        System.out.println("\nInOrder traversal: ");
        b.inOrder(b.getRoot());
        System.out.println("\npostOrder traversal: ");
        b.postOrder(b.getRoot());
        System.out.println("\ndescending Order traversal: ");
        b.descOrder(b.getRoot());
        System.out.println("\nFound 9? " + b.search(b.getRoot(), 9) );
        System.out.println("\nFound 99? " + b.search(b.getRoot(), 99) );
        System.out.println("\nFound 2? " + b.search(b.getRoot(), 2) );
    }

}

/*  FOR PRACTICE: change the BinaryNode and BST classes to have a String as data *
    BST created with 5 as its root.
        (12) added to the right of (5)
        (3) added to the left of (5)
        (9) added to the left of (12)
        (2) added to the left of (3)
        preOrder traversal:
        (5) (3) (2) (12) (9)
        InOrder traversal:
        (2) (3) (5) (9) (12)
        postOrder traversal:
        (2) (3) (9) (12) (5)
        descending Order traversal:
        (12) (9) (5) (3) (2)

*/


public class BinaryNode
{
    private int data;// can be replaced by any class or wrapper class
    private BinaryNode left;
    private BinaryNode right;

    public BinaryNode(int data)
    {   this.data = data;
        /* just overstating the obvious -- objects are null by default
        this.left = null;
        this.right = null;
        */
    }

    public int getData()
    {   return data;
    }

    public void setData(int data)
    {   this.data = data;
    }

    public BinaryNode getLeft()
    {   return left;
    }

    public void setLeft(BinaryNode left)
    {   this.left = left;
    }

    public BinaryNode getRight()
    {   return right;
    }

    public void setRight(BinaryNode right)
    {   this.right = right;
    }

    @Override
    public String toString()
    {   return String.format("(%d)", data);
    }

    /*
    public static void main(String[] args)
    {
        BinaryNode n = new BinaryNode(5);
        System.out.println(n);
    }
    */

}

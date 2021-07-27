/* Algorithm:
1.If value of node to be deleted is less than root node, search node in left subtree. Else, search in right subtree.
2.If node is found and it has no children, then set the node to null.
3.If node has one child then, child node will take position of node.
*/
class BinarySearchTree {

    // Class containing left and right child of current node and data

    /* data:
     When a node is created,
     data will pass to the data attribute of the node and both left and right will be set to null.*/

    class Node {
        int data;
        Node left, right;

        //Assign data to the new node, set left and right children to null
        public Node(int value) {
            this.data = value;
            this.left = right = null;
        }
    }

    //Root represents the root node of the tree and initializes it to null.
    // Root of BST
    Node root;

    // Constructor
    public BinarySearchTree() {
        root = null;
    }
/* It checks whether root is null, which means tree is empty.
   New node will become root node of tree.
   If tree is not empty, it will compare value of new node with root node.
   If value of new node is greater than root, new node will be inserted to right subtree.
   Else, it will be inserted in left subtree.*/

    //insert() will add new node to the binary search tree

    void insert(int data) {
        //Create a new node
        Node newNode = new Node(data);
        //Check whether tree is empty
        if (root == null) {
            root = newNode;
            return;
        } else {
            //current node point to root of the tree
            Node current = root, parent = null;

            while (true) {
                //parent keep track of the parent node of current node.
                parent = current;

                //If data is less than current's data, node will be inserted to the left of tree
                if (data < current.data) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                }
                //If data is greater than current's data, node will be inserted to the right of tree
                else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    //inorder() will perform inorder traversal on binary search tree
    public void inorder(Node node) {

        //Check whether tree is empty  
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        } else {

            if (node.left != null)
                inorder(node.left);
            System.out.print(node.data + " ");
            if (node.right != null)
                inorder(node.right);

        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        /* Let us create following BST
              56
           /     \
          30      70
         */
        tree.insert(30);
        tree.insert(56);
        tree.insert(70);

        // print inorder traversal of the BST
        System.out.println("Binary search tree after insertion:");
        //Displays the binary tree
        tree.inorder(tree.root);

    }
}


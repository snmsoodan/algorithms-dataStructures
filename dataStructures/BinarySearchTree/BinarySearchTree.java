/**
 * BinarySearchTree
 */
public class BinarySearchTree {
    Node root;
    public static void main(String[] args) {

        BinarySearchTree theTree = new BinarySearchTree();
        theTree.addNode(50, "Boss");
        theTree.addNode(25, "Vice President");
        theTree.addNode(15, "office Manager");
        theTree.addNode(30, "Seretary");
        theTree.addNode(75, "Salesman");

        // theTree.inOrderTraversalTree(theTree.root);
        // theTree.preOrderTraversalTree(theTree.root);
        // theTree.postOrderTraversalTree(theTree.root);
        System.out.println(theTree.findNode(15));
    }

    public boolean addNode(int key, String name) {

        Node newNode = new Node(key, name);

        if(root == null) {
            root = newNode;
            return true;
        } else {
            Node focusNode = root;
            Node parent;

            while(true) {
                parent = focusNode;
                if(key <= parent.key) {
                    focusNode = parent.leftChild;
                    if(focusNode == null) {
                        parent.leftChild = newNode;
                        return true;
                    }
                } else {
                    focusNode = parent.rightChild;
                    if(focusNode == null) {
                        parent.rightChild = newNode;
                        return true;
                    }
                }
            }
        }

    }

    //inOrder traversal - smallest value first leftNode -> root -> rightNode
    //gave the focus Node for simplicity of recursion
    //will pass root Node into it
    // Algorithm Inorder(tree)
    // 1. Traverse the left subtree, i.e., call Inorder(left-subtree)
    // 2. Visit the root.
    // 3. Traverse the right subtree, i.e., call Inorder(right-subtree)
    public void inOrderTraversalTree(Node focusNode) {
        if(focusNode != null) {
            inOrderTraversalTree(focusNode.leftChild);
            System.out.println(focusNode);
            inOrderTraversalTree(focusNode.rightChild);
        }
    }

    //preorder traversal - root -> leftNode -> rightNode 
    // Algorithm Preorder(tree)
    // 1. Visit the root.
    // 2. Traverse the left subtree, i.e., call Preorder(left-subtree)
    // 3. Traverse the right subtree, i.e., call Preorder(right-subtree) 
    public void preOrderTraversalTree(Node focusNode) {
        if(focusNode != null) {
            System.out.println(focusNode);
            preOrderTraversalTree(focusNode.leftChild);
            preOrderTraversalTree(focusNode.rightChild);
        }
    }


    public void postOrderTraversalTree(Node focusNode) {
        if(focusNode != null) {
            postOrderTraversalTree(focusNode.leftChild);
            postOrderTraversalTree(focusNode.rightChild);
            System.out.println(focusNode);
        }
    }

    public Node findNode(int key) {
        Node focusNode = root;
        while(focusNode.key != key) {
            if(key < focusNode.key) {
                focusNode = focusNode.leftChild;
            } else {
                focusNode = focusNode.rightChild;
            } 
            if(focusNode == null) {
                return null;
            }  
        }
        return focusNode;
    }

    public void deleteNode(int key) {
        root = deleteKey(root, key);
    }

    public Node deleteKey(Node root, int key) {
        //if tree is empty
        if(root == null) {
            return root;
        }

        //recurse down the tree
        if(key < root.key) {
            root.leftChild = deleteKey(root.leftChild, key);
        }
        else if(key > root.key) {
            root.rightChild = deleteKey(root.rightChild, key);
        }


        //if key is same as the root's key
        //then this node has to be deleted
        else {
            //node with only one child or no child
            if(root.leftChild == null) {
                return root.rightChild;
            }
            else if(root.rightChild == null) {
                return root.leftChild;
            }

            //node with two children
            //get the inorder successor(smallest in the right subtree)
            root.key = minValue(root.right);
            
            //delete the inorder successor
            root.right = deleteKey(root.right, key);
        }

        return root;

    }

    public int minValue(Node root) {
        int minVal = root.key;
        
        while(root.leftChild != null) {
            minVal = root.leftChild.key;
            root = root.leftChild;
        }
        return minVal;
    }

     
    class Node {
        int key;
        String name;

        Node leftChild;
        Node rightChild;
        
        Node(int key, String name) {
            this.key = key;
            this.name = name;
        }

        public String toString() {
            return name + " has a key: " + key;
        }

    }

}
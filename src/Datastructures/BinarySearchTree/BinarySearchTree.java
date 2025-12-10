package Datastructures.BinarySearchTree;

public class BinarySearchTree {

    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void insert(int key) {

        if(root == null) {
            root = new Node(key, null);
            return;
        }
        if(key <= root.key) {
            root.left = insertRecursive(key, root.left, root);
            return;
        }
        root.right = insertRecursive(key, root.right, root);
    }

    private Node insertRecursive(int key, Node current, Node parent) {
        if(current == null) {
            return new Node(key, parent);
        }
        if(key <= current.key) {
            current.left = insertRecursive(key, current.left, current);
        }
        if(key > current.key) {
            current.right = insertRecursive(key, current.right, current);
        }
        return current;
    }

    public void deleteNode(Node toDelete) {

        if(toDelete.left == null && toDelete.right == null) {
            deleteNodeWithoutChildren(toDelete);
        }

        if(toDelete.left == null ^ toDelete.right == null) {
            deleteNodeWithSingleChild(toDelete);
        }

        if(toDelete.left !=null && toDelete.right !=null) {
            deleteNodeWithTwoChildren(toDelete);
        }

    }

    private void deleteNodeWithoutChildren(Node toDelete) {
        if(toDelete.parent.right == toDelete) {
            toDelete.parent.right = null;
        }
        else {
            toDelete.parent.left = null;
        }
        toDelete = null;
    }

    private void deleteNodeWithSingleChild(Node toDelete) {
        Node child;
        if(toDelete.left != null) {
            child = toDelete.left;
        }
        else {
            child = toDelete.right;
        }

        if(toDelete.parent.right == toDelete) {
            toDelete.parent.right = child;
        }
        else {
            toDelete.parent.left = child;
        }

        child.parent = toDelete.parent;

        toDelete = null;
    }

    private void deleteNodeWithTwoChildren(Node toDelete) {
        toDelete.key = successor(toDelete).key;
        deleteNode(successor(toDelete));
    }



    void delete(int key) {
        root = deleteRec(root, key);
    }

    Node deleteRec(Node root, int key) {
        if (root == null)
            return root;

        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.key = minimumRecursive(root.right).key;

            root.right = deleteRec(root.right, root.key);
        }

        return root;
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node current) {
        if(current != null) {
            inOrder(current.left);
            System.out.println(current.key);
            inOrder(current.right);
        }
    }

    public void asString() {
        asString(root);
    }

    private void asString(Node current) {
        if(current != null) {
            asString(current.left);
            System.out.printf(current.key + ",");
            asString(current.right);
        }
    }

    public Node search(int key) {
        return searchRecursive(key, root);
    }

    private Node searchRecursive(int key, Node current) {
        if(current.key == key) {
            return current;
        }
        if(current.key > key) {
            return searchRecursive(key, current.left);
        }else {
            return searchRecursive(key, current.right);
        }
    }

    public Node minimum() {
        return minimumRecursive(root);
    }

    private Node minimumRecursive(Node current) {
        if(current==null) {
            return null;
        }

        if(current.left != null) {
            return minimumRecursive(current.left);
        }
        else {
            return current;
        }

    }

    public Node maximum() {
        return maximumRecursive(root);
    }

    private Node maximumRecursive(Node current) {
        if(current==null) {
            return null;
        }

        if(current.right != null) {
            return maximumRecursive(current.right);
        }
        else {
            return current;
        }
    }

    public Node successor(Node current) {
        if(current.right != null) {
            return minimumRecursive(current.right);
        }
        return null;
    }

    public Node predecessor(Node current) {
        if(current.left != null) {
            return maximumRecursive(current.left);
        }
        return null;
    }
 }

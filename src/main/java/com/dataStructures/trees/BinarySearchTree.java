package com.dataStructures.trees;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int value){
        Node node = new Node(value);
        Node currentRoot = this.root;
        if(this.root == null){
            this.root = node;
            return;
        }

        while (true) {
            if (currentRoot.getValue() < node.getValue()) {
               if(currentRoot.left==null){
                   currentRoot.setLeft(node);
                   return;
               }
               currentRoot = currentRoot.left;
            } else {
                if(currentRoot.right == null){
                    currentRoot.setRight(node);
                    return;
                }
                currentRoot = currentRoot.right;
            }
        }

    }

    public boolean lookup(int value){
        Node node = new Node(value);
        Node currentRoot = this.root;
        if(this.root == null){
            return false;
        }

        while (currentRoot!=null) {
            if (currentRoot.getValue() < node.getValue()) {
                currentRoot = currentRoot.getLeft();
            } else if (currentRoot.getValue() > node.getValue()) {
                currentRoot = currentRoot.getRight();
            }else{
                return true;
            }
        }
        return false;
    }

    public void delete(int value){
     //need to be worked ... extra time


    }




    public void print() {
        System.out.println(traversePreOrder(this.root));
    }

    //private functions
    public String traversePreOrder(Node root) {

        if (root == null) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        sb.append(root.getValue());

        String pointerRight = "└──";
        String pointerLeft = (root.getRight() != null) ? "├──" : "└──";

        traverseNodes(sb, "", pointerLeft, root.getLeft(), root.getRight() != null);
        traverseNodes(sb, "", pointerRight, root.getRight(), false);

        return sb.toString();
    }

    public void traverseNodes(StringBuilder sb, String padding, String pointer, Node node,
                              boolean hasRightSibling) {
        if (node != null) {
            sb.append("\n");
            sb.append(padding);
            sb.append(pointer);
            sb.append(node.getValue());

            StringBuilder paddingBuilder = new StringBuilder(padding);
            if (hasRightSibling) {
                paddingBuilder.append("│  ");
            } else {
                paddingBuilder.append("   ");
            }

            String paddingForBoth = paddingBuilder.toString();
            String pointerRight = "└──";
            String pointerLeft = (node.getRight() != null) ? "├──" : "└──";

            traverseNodes(sb, paddingForBoth, pointerLeft, node.getLeft(), node.getRight() != null);
            traverseNodes(sb, paddingForBoth, pointerRight, node.getRight(), false);
        }
    }
}

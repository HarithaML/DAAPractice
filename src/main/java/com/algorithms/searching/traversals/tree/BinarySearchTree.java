package com.algorithms.searching.traversals.tree;


import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree<T extends Comparable<T>> {
    Node<T> root;

    public BinarySearchTree() {
        this.root = null;
    }

   public void insert(T data){
        this.root =  insertRecursive(this.root,data);
   }

    public void delete(T data){
        this.root = deleteRecursive(this.root,data);
    }

    public boolean lookup(T data){
        return lookupRecursive(this.root,data);
    }
    public void inorderTraverse(){
        inorderTraverseRecursive(this.root);
    }
    public void preorderTraverse(){
        preorderTraverseRecursive(this.root);
    }
    public void postorderTraverse(){
        postorderTraverseRecursive(this.root);
    }





    //recursive functions
    public Node<T> deleteRecursive(Node<T> node, T data){
        if(node == null){
            return null;
        }

        if(node.data == data){
          //Node to delete found
            //Case1: no children
            if(node.left == null && node.right == null){
                return null;
            }


            //CAse2: 1 child

            if(node.left == null){
                return node.right;
            }
            if(node.right == null){
                return node.left;
            }
            // CAse3: 2 child
            //node that will replace the deleted node
            //the smallest node
            //inorder successor -->
            // the right subtree the smallest element
            // while replace  the deleted parent node
            T smallestData = findSmallestValue(node.right);
            node.data = smallestData;
            node.right = deleteRecursive(node.right,smallestData);
            return node;
        }
        if(data.compareTo(node.data)<0){
            node.left = deleteRecursive(node.left,data);
            return node;
        }
        node.right = deleteRecursive(node.right,data);
        return node;

    }


    public boolean lookupRecursive(Node<T> root, T data){
        if(root == null){
            return false;
        }else if(data == root.data){
            return true;
        }
        return data.compareTo(root.data)<0 ?
                lookupRecursive(root.left,data):
                lookupRecursive(root.right,data);

    }

    public Node<T> insertRecursive(Node<T> root, T data){

        if(root == null){
            return new Node<T>(data);
        }else if(data.compareTo(root.data)<0){
            root.left = insertRecursive(root.left,data);
        }
        else if(data.compareTo(root.data)>0){
            root.right = insertRecursive(root.right,data);
        }
        return root;

    }


    //Depth First Search
    //1.Inorder
    //first visiting the left sub-tree,
    // then the root node, and finally the right sub-tree:

    public void inorderTraverseRecursive(Node<T> node){
        if(node != null){
            inorderTraverseRecursive(node.left);
            System.out.print(" "+node.data);
            inorderTraverseRecursive(node.right);
        }
    }
    public void preorderTraverseRecursive(Node<T> node){
        if(node != null){
            System.out.print(" "+node.data);
            preorderTraverseRecursive(node.left);
            preorderTraverseRecursive(node.right);
        }
    }
    public void postorderTraverseRecursive(Node<T> node){
        if(node != null){
            postorderTraverseRecursive(node.left);
            postorderTraverseRecursive(node.right);
            System.out.print(" "+node.data);
        }
    }

    //BFS
    public void traverseLevelOrder(Node<T> root){
        if(root == null){
            return;
        }
        Queue<Node<T>> nodes = new LinkedList<>();
        nodes.add(root);
        while(!nodes.isEmpty()){
            //remove head from queue and add child nodes
            Node<T> node = nodes.remove();
            System.out.print(" " + node.data);
            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right != null) {
                nodes.add(node.right);
            }
        }
    }
    //private functions
    private T findSmallestValue(Node<T> root) {
        return root.left == null ? root.data : findSmallestValue(root.left);
    }
}

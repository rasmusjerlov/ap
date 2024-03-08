package bst;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {
    public static void main(String[] args) {


        BST<Integer> binaryTree = new BST<>();
        binaryTree.insert(45);
        binaryTree.insert(22);
        binaryTree.insert(11);
        binaryTree.insert(15);
        binaryTree.insert(30);
        binaryTree.insert(25);
        binaryTree.insert(77);
        binaryTree.insert(90);
        binaryTree.insert(88);

        BST.TreeNode root = binaryTree.getRoot();
        BST.TreeNode testTal = binaryTree.findNode(88);

        System.out.println("Root: " + root);
        System.out.println("Inorder: " + binaryTree.inorder());
        System.out.println("Preorder: " + binaryTree.preorder());
        System.out.println("Postorder: " + binaryTree.postorder());

        System.out.println("Is " + testTal + " a leaf?: " + binaryTree.isLeaf(testTal));
        System.out.println("Height: " + binaryTree.getHeight(root));
        System.out.println("Depth: " + binaryTree.getDepth(root));
        System.out.println("Is " + testTal + " intern?: " + binaryTree.isIntern(testTal));
//        System.out.println(binaryTree.removeMin());
//        System.out.println(binaryTree.removeMax());
        System.out.println(binaryTree.getGreaterThan(22));


    }
}

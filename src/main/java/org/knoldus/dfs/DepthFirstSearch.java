package org.knoldus.dfs;

public class DepthFirstSearch {

    Node root;

    /**
     * LRN
     */
    void printPostorder(Node root) {
        if (root == null)
            return;
        printPostorder(root.left);
        printPostorder(root.right);
        System.out.print(root.key + " ");
    }

    /**
     * LNR
     */
    void printInorder(Node root) {
        if (root == null)
            return;
        printInorder(root.left);
        System.out.print(root.key + " ");
        printInorder(root.right);
    }

    /**
     * NLR
     */
    void printPreorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.key + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }
}

package org.knoldus.dfs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DepthFirstSearchTest {
    /**
     * Method under test: {@link DepthFirstSearch#printPostorder(Node)}
     */
    @Test
    public void testPrintPostorder() {
        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
        Node node = new Node(12);
        depthFirstSearch.printPostorder(node);
        assertEquals(12, node.key);
    }

    /**
     * Method under test: {@link DepthFirstSearch#printInorder(Node)}
     */
    @Test
    public void testPrintInorder() {
        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
        Node node = new Node(42);
        depthFirstSearch.printInorder(node);
        assertEquals(42, node.key);
    }

    /**
     * Method under test: {@link DepthFirstSearch#printPreorder(Node)}
     */
    @Test
    public void testPrintPreorder() {
        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
        Node node = new Node(49);
        depthFirstSearch.printPreorder(node);
        assertEquals(49, node.key);
    }
}


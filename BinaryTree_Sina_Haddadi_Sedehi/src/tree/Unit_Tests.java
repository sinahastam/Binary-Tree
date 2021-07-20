package tree;

//Sina Haddadi Sedehi
//s0566440

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit-Tests class
 * @author Sina
 * @version 1.0
 */
class Unit_Tests {
	BinNode n1, n2, n3, n4, n5, n6, n7, n8, n9;

	/**
	 * Setup method
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		n1 = new BinNode(1);
		n3 = new BinNode(3);
		n2 = new BinNode(2,n1,n3);
		n5 = new BinNode(5);
		n4 = new BinNode(4,n2,n5);
		n8 = new BinNode(8);
		n7 = new BinNode(7,n4,n9);
		n9 = new BinNode(9, n8, null);
	}

	
	/**
	 * Tests isEmpty() func with empty tree
	 */
	@Test
	void isEmptyA() {
		BinTree tree = new BinTree();
		assertTrue(tree.isEmpty());
	}
	
	/**
	 * Tests isEmpty() func with a tree which only has a root node
	 */
	@Test
	void isEmptyB() {
		BinTree tree = new BinTree(n1);
		assertFalse(tree.isEmpty());
	}
	
	/**
	 * Tests isEmpty() func with a full tree
	 */
	@Test
	void isEmptyC() {
		BinTree tree = new BinTree(n7);
		assertFalse(tree.isEmpty());
	}
	
	/**
	 * Tests countTwoChildrenNodes() func with empty tree
	 */
	@Test
	void countTwoChildrenNodesA() {
		BinTree tree = new BinTree();
		assertEquals(0, tree.countTwoChildrenNodes());
	}
	
	/**
	 * Tests countTwoChildrenNodes() func with a tree which only has a root node
	 */
	@Test
	void countTwoChildrenNodesB() {
		BinTree tree = new BinTree(n1);
		assertEquals(0, tree.countTwoChildrenNodes());
	}
	
	/**
	 * Tests countTwoChildrenNode() func with a full tree
	 */
	@Test
	void countTwoChildrenNodeC() {
		BinTree tree = new BinTree(n7);
		assertEquals(3, tree.countTwoChildrenNodes());
	}
	
	/**
	 * Tests searchNode() func with empty tree
	 */
	@Test
	void searchNodeA() {
		BinTree tree = new BinTree();
		assertNull(tree.searchNode(54));
	}
	
	/**
	 * Tests searchNode() func with a tree which only has a root node
	 */
	@Test
	void searchNodeB() {
		BinTree tree = new BinTree(n1);
		assertEquals(n1, tree.searchNode(1));
	}
	
	/**
	 * Tests searchNode() func with a full tree
	 */
	@Test
	void searchNodeC() {
		BinTree tree = new BinTree(n7);
		assertEquals(n1.data, tree.searchNode(1).data);
	}
	
	/**
	 * Tests isSorted() func with empty tree
	 */
	@Test
	void isSortedA() {
		BinTree tree = new BinTree();
		//empty tree = sorted
		assertTrue(tree.isSorted());
	}
	
	/**
	 * Tests isSorted() func with a tree which only has a root node
	 */
	@Test
	void isSortedB() {
		BinTree tree = new BinTree(n1);
		assertTrue(tree.isSorted());
	}
	
	/**
	 * Tests isSorted() func with a full tree
	 */
	@Test
	void isSortedC() {
		BinTree tree = new BinTree(n7);
		assertTrue(tree.isSorted());
	}
	
	/**
	 * Tests  func with a full tree
	 */
	@Test
	void isBST() {
		BinTree tree = new BinTree(n7);
		assertTrue(tree.isBST());
	}
}

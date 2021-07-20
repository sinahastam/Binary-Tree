package tree;

//Sina Haddadi Sedehi
//s0566440

/**
 * Node class for binary trees
 * @author Sina
 * @version 1.0
 */
public class BinNode {
	int data;
	BinNode left, right;
	
	/**
	 * Default constructor
	 */
	BinNode() {
		System.out.println("Warning @BinNode");
	}
	
	/**
	 * Constructor creates node without children
	 * @param d Data of node
	 */
	BinNode(int d) {
		data = d;
		left = right = null;
	}
	
	
	/**
	 * Constructor creates node with children (left,right)
	 * @param d Data of node
	 * @param l Left child
	 * @param r Right child
	 */
	BinNode(int d, BinNode l, BinNode r) {
		data = d; left = l; right = r;
	}
	
}

package tree;

//Sina Haddadi Sedehi
//s0566440

/**
 * @author Sina Haddadi
 * @version 1.0
 */
public class BinTree {
	private BinNode root = null;
	
	/**
	 * Constructor creates empty tree <br>
	 * root = null
	 */
	BinTree() {
		root = null;
	}
	
	/**
	 * Constructor creates tree with root
	 * @param rn Root node
	 */
	BinTree(BinNode rn) {
		root = rn;
	}
	
	/**
	 * Checks if tree is empty or not
	 * @return True = Tree is empty <br> False = Tree is not empty
	 */
	boolean isEmpty() {
		return (root == null) ? true : false;
	}
	
	/**
	 * Counts all nodes who have two children
	 * @param k Node
	 * @return Counter
	 */
	private int countTwoChildrenNodes(BinNode k){
		int counter = 0;
		if(k == null) {
			return counter;
		}
		
		if(k != null) {
			if(k.left == null && k.right != null) {
				counter = 1 + countTwoChildrenNodes(k.right);
			}else if(k.left != null && k.right == null) {
				counter = 1 + countTwoChildrenNodes(k.left);
			}else if(k.left == null && k.right == null){
				return counter;
			}
			counter = 1 + countTwoChildrenNodes(k.left) + countTwoChildrenNodes(k.right);
		}
		
		return counter;	
	}
	
	/**
	 * Helper func <br> Starts from root
	 * @return countTwoChildrenNodes(root)
	 */
	int countTwoChildrenNodes() {
		return countTwoChildrenNodes(root);
	}
	
	/**
	 * Searches tree for a node with matching data
	 * @param gesucht Integer number to search for
	 * @param k Node
	 * @return If found return node else return null
	 */
	private BinNode searchNode(int gesucht, BinNode k) {
		if(k == null) {
			return null;
		}
		
		if(gesucht == k.data) {
			return k;
		}
		
		return (gesucht < k.data) ? searchNode(gesucht,k.left) : searchNode(gesucht, k.right);		
	}
		
	/**
	 * Helper func <br> Starts from root
	 * @param gesucht Integer number to search for
	 * @return searchNode(gesucht, root)
	 */
	BinNode searchNode(int gesucht) {
		return searchNode(gesucht, root);
	}
	
	/**
	 * Checks if binary tree is sorted
	 * @param k Node
	 * @return True = sorted <br> False = not sorted
	 */
	boolean isSorted(BinNode k) {
		if(k == null) {
			return true;
		}
		
		int current = k.data;
		if(k != null) {
			if(current < k.data) {
				if(k.left == null) {
					isSorted(k.left);
				}else {
					return true;
				}
			}
		}
		
		if(current > k.data) {
			if(current > k.data) {
				if(k.right == null) {
					isSorted(k.right);
				}else {
					return true;
				}
			}
		}
		
		return false;
	}
	
	/**
	 * Helper func <br> Starts from root
	 * @return isSorted(root)
	 */
	boolean isSorted() {
		return isSorted(root);
	}
	
	BinNode prev;
	boolean isBST()  { 
        prev = null; 
        return isBST(root); 
    } 
  
    boolean isBST(BinNode current) 
    { 
        // traverse the tree in inorder fashion and 
        // keep a track of previous node 
        if (current != null) 
        { 
            if (!isBST(current.left)) 
                return false; 
  
            // allows only distinct values node 
            if (prev != null && current.data <= prev.data ) 
                return false; 
            prev = current; 
            return isBST(current.right); 
        } 
        return true; 
    } 
	
}

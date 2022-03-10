package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Instructions to candidate.
 * Implement the "put" and "contains" methods.
 * Fix the "inOrderTraversal" method.
*/

public class BinarySearchTree {

  static class BST  {

    private Node root;

    public BST() {
      this.root = new Node();
    }

    public void put(int value) {
      // your code
    	Node node = new Node();
    	node.val = value;
    	node.left = null;
    	node.right = null;
    	Node current = this.root;
    	Node parent = null;
    	if(root == null || root.val == null) {
    		root = node;
    		current = root;
    		return;
    	}
    	while(true) {
    		if(current.val > value) {
    			parent = current;
    			current = current.left;
    			if(current == null || current.val == null) {
    				parent.left = node;
    				return;
    			}
    		}
    		else if(current.val < value) {
    			parent = current;
    			current = current.right;
    			if(current == null || current.val == null) {
    				parent.right = node;
    				return;
    			}
    		}
    	}
    }
    

    public boolean contains(int value) {
    	return contains(root, value);
    }
    
    public boolean contains(Node root, int value) {
    	if(root == null || root.val == null) {
    		return false;
    	}
    	else if(root.val == value) {
    		return true;
    	}
    	else if(root.val < value) {
    		return contains(root.right, value);
    	}
    	else {
    		return contains(root.left, value);
    	}
    }

    public List<Integer> inOrderTraversal() {
      final ArrayList<Integer> acc = new ArrayList<>();
      inOrderTraversal(root, acc);
      System.out.println(acc);
      return acc;
    }

    private void inOrderTraversal(Node node, List<Integer> acc) {
      if (node == null) {
        return;
      }
      inOrderTraversal(node.left, acc);
      acc.add(node.val);
      inOrderTraversal(node.right, acc);
    }

    private static class Node {
      Integer val;
      Node left;
      Node right;
      
    }
  }


   public static void main(String[] args) {
    
	  final BST searchTree = new BST();

	    searchTree.put(3);
	    searchTree.put(1);
	    searchTree.put(2);
	    searchTree.put(5);
	    
	    if(Arrays.asList(1,2,3,5).equals(searchTree.inOrderTraversal())
	    		&& !searchTree.contains(0) 
	    		&& searchTree.contains(1)
	    		&& searchTree.contains(2)
	    		&& searchTree.contains(3)
	    		&& !searchTree.contains(4)
	    		&& searchTree.contains(5)
	    		&& !searchTree.contains(6)){
	    	System.out.println("Pass");
	    }else {
	    	System.out.println("Fail");
	    }
	    		
  }

}
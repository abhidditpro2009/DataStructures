package Tree;

public class Tester {

	public static void testBinaryTree() {
		
		Node<Integer> root = new Node<Integer>(1);
		
		BinaryTree<Integer> tree = new BinaryTree<Integer>(root);
		tree.addToLeft(new Node<Integer>(2), 1);
		tree.addToRight(new Node<Integer>(3), 1);
		tree.addToLeft(new Node<Integer>(4), 2);
		tree.addToRight(new Node<Integer>(5), 2);
		tree.addToLeft(new Node<Integer>(6), 3);
		tree.addToRight(new Node<Integer>(7), 3);
		
		System.out.println("Pre Order ****************");
		tree.preOrder(root);
		System.out.println("In Order ****************");
		tree.inOrder(root);
		System.out.println("Post Order ****************");
		tree.postOrder(root);
		System.out.println("Level Order ****************");
		tree.levelOrder(root);
	}
	
	public static void testBST() {
		
		Node<Integer> root = new Node<Integer>(8);
		
		BST<Integer> tree = new BST<Integer>(root);
		tree.addNode(new Node<Integer>(4));
		tree.addNode(new Node<Integer>(12));
		tree.addNode(new Node<Integer>(3));
		tree.addNode(new Node<Integer>(5));
		tree.addNode(new Node<Integer>(13));
		tree.addNode(new Node<Integer>(11));
		tree.addNode(new Node<Integer>(4));
		tree.addNode(new Node<Integer>(2));
		tree.addNode(new Node<Integer>(7));
		tree.addNode(new Node<Integer>(6));
		
		tree.search(12);
		
		
		System.out.println("Pre Order ****************");
		tree.preOrder(root);
		System.out.println("In Order ****************");
		tree.inOrder(root);
		System.out.println("Post Order ****************");
		tree.postOrder(root);
		System.out.println("Level Order ****************");
		tree.levelOrder(root);
	}	
		
	public static void main(String args[]) {
			
		testBinaryTree();
		testBST();
		
			
	}

}

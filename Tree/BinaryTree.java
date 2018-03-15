package Tree;


import java.util.Comparator;

import Queue.ArrayQueue;

public class BinaryTree<T> implements Tree<T>,Comparator<Integer> {
	
	protected Node<T> root;
	protected Node<T> foundNode;
	
	public BinaryTree(Node<T> node){
		
		root = node;
		foundNode = null;
	}
	
	public void addToLeft(Node<T> node,T data) {
		
		findNode(root,data);
		foundNode.setLeft(node);
	}
	
	public void addToRight(Node<T> node,T data) {
		
		findNode(root,data);
		foundNode.setRight(node);
	}
	
	public void findNode(Node<T> root, T data) {
		
		if(root == null)
			return;
		
		if(root.getData() == data )
			foundNode = root;
		
		findNode(root.getLeft(),data);
		findNode(root.getRight(),data);
		
	}
	
	@Override
	public void inOrder(Node<T> root) {
		// TODO Auto-generated method stub
		
		if(root == null)
			return;
		
		inOrder(root.getLeft());
		System.out.println(root.getData());
		inOrder(root.getRight());
		
	}

	@Override
	public void preOrder(Node<T> root) {
		// TODO Auto-generated method stub
		
		if(root == null)
			return;		
		
		System.out.println(root.getData());
		preOrder(root.getLeft());
		preOrder(root.getRight());
	}

	@Override
	public void postOrder(Node<T> root) {
		// TODO Auto-generated method stub
		
		if(root == null)
			return;
		
		postOrder(root.getLeft());
		postOrder(root.getRight());
		System.out.println(root.getData());
		
	}

	@Override
	public void levelOrder(Node<T> root) {
		// TODO Auto-generated method stub
		
		ArrayQueue<Node<T>> queue = new ArrayQueue<Node<T>>(100);
		
		queue.add(root);
		
		while(queue.peek() != null) {
			
			Node<T> node = queue.peek();
			
			if(node.getLeft() != null)
				queue.add(node.getLeft());
			
			if(node.getRight() != null)
				queue.add(node.getRight());
			
			System.out.println(queue.poll().getData());
		}
		
	}

	@Override
	public int compare(Integer v1, Integer v2) {
        return v1 < v2 ? -1 : v1 > v2 ? +1 : 0;
    }
	
	

}

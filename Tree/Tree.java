package Tree;

public interface Tree<T> {

	public void inOrder(Node<T> root);
	
	public void preOrder(Node<T> root);
	
	public void postOrder(Node<T> root);
	
	public void levelOrder(Node<T> root);
}

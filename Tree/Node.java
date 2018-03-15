package Tree;

public class Node<T> {

	private T data;
	private Node<T> left ;
	private Node<T> right;
	
	
	Node()
	{
		left = null;
		right = null;
	}
	
	Node(T data)
	{
		this.data = data;
		left = null;
		right = null;
	}
	
	public void setLeft(Node<T> left)
	{
		this.left = left;
	}
	
	public Node<T> getLeft()
	{
		return left;
	}
	
	public void setRight(Node<T> right)
	{
		this.right = right;
	}
	
	public Node<T> getRight()
	{
		return right;
	}
	
	public T getData()
	{
		return data;
	}
	
	
}

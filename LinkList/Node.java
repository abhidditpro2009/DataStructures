package LinkList;

public class Node<T> {

	private T data;
	private Node<T> next ;
	private Node<T> prev;
	
	Node()
	{
		next = null;
		prev = null;
	}
	
	Node(T data)
	{
		this.data = data;
		next = null;
		prev = null;
	}
	
	public void setPrev(Node<T> prev)
	{
		this.prev = prev;
	}
	
	public Node<T> getPrev()
	{
		return prev;
	}
	
	public void setNext(Node<T> next)
	{
		this.next = next;
	}
	
	public Node<T> getNext()
	{
		return next;
	}
	
	public T getData()
	{
		return data;
	}
	
	
}

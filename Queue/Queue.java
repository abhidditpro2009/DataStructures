package Queue;

public interface Queue<T> {

	public T poll();
	
	public boolean add(T element);
	
	public T peek();
	
}

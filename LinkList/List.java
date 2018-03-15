package LinkList;

public interface List<T> {

	public void printList() ;
	
	public void printReverseList() ;
	
	public void addNodeAtTheEnd(T data) ;
	
	public void addNodeAtTheFront(T data) ;
	
	public void addNodeAfterIndex(T data, int index) ;
	
	public void deleteAtTheEnd() ;
	
	public void deleteAtTheFront() ;
	
	public void deleteNodeAfterIndex( int index) ;
	
}

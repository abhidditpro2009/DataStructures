package LinkList;
/**
 * 
 */

/**
 * @author ABHIJEET
 *
 */

public class Singly<T> implements List<T>{

	/**
	 * @param args
	 */
	private Node<T> head;
	private Node<T> current;
	
	public void printList() {
		
		current = head ;
		
		while(current != null)
		{
			System.out.println(current.getData());
			current = current.getNext();
		}
		
	}
	
	public void printReverseList(){
		return;
	}
	
	public void addNodeAtTheEnd(T data) {
		
		current = head;
		Node<T> node = new Node<T>(data);
		
		
		if(head == null) {
			
			head = node;
			return;
		}
			
		
		// traverse the list
		while(current.getNext() != null)
		{
			current = current.getNext();
		}
					
		current.setNext(node);
		return;
	}
	
	public void addNodeAtTheFront(T data) {
		
		Node<T> node = new Node<T>(data);
		
		if(head == null) {
			
			head = node;
			return;
		}
			
		node.setNext(head);
		head = node;
		return;
	}
	
	public void addNodeAfterIndex(T data, int index) {
		
		Node<T> node = new Node<T>(data);
		int currentPos = 0;
		current = head;
		
		if(head == null || current.getNext() == null ) {
			
			//head = node;
			return;
		}
		
		while(current.getNext() != null && currentPos < index)
		{
			current = current.getNext();
			currentPos++;
		}
		
		Node<T> next = current.getNext();
		current.setNext(node);
		node.setNext(next);
		return;
	}
	
	public void deleteAtTheEnd() {
	
		current = head;
		
		if(head == null) {
			
			return;
		}
			
		
		// traverse the list
		while((current.getNext()).getNext() != null)
		{
			current = current.getNext();
		}
					
		current.setNext(null);
		
		return;
	}
	
	public void deleteAtTheFront() {
		
		Node<T> next = head.getNext();
		head = null;
		head = next;
	}
	
	public void deleteNodeAfterIndex( int index) {
		
		int currentPos = 0;
		current = head;
		
		if(head == null || current.getNext() == null ) {
			
			//head = node;
			return;
		}
		
		while(current.getNext() != null && currentPos < index - 1)
		{
			current = current.getNext();
			currentPos++;
		}
		
		Node<T> nodeTobeDeleted = current.getNext();
		current.setNext(nodeTobeDeleted.getNext());
		
		return;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new Singly<Integer>();
		
		list.addNodeAtTheEnd(12);
		list.addNodeAtTheEnd(13);
		list.addNodeAtTheEnd(14);
		list.addNodeAtTheEnd(15);
		list.addNodeAtTheEnd(16);
		list.addNodeAtTheFront(17);
		list.addNodeAfterIndex(18,1);
		list.deleteAtTheEnd();
		list.addNodeAtTheEnd(17);
		list.deleteAtTheFront();
		list.deleteNodeAfterIndex(1);
		
		list.printList();
	}

}

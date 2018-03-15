package LinkList;

public class Doubly<T> implements List<T>{

	private Node<T> head;
	private Node<T> current;

	
	@Override
	public void printList() {
		// TODO Auto-generated method stub
		
		current = head ;
		
		while(current != null)
		{
			System.out.println(current.getData());
			current = current.getNext();
		}
		
	}
	
	public void printReverseList() {
		// TODO Auto-generated method stub
		
		current = head ;
		
		while(current.getNext() != null)
		{
			current = current.getNext();
		}
		
		while(current != null) {
			System.out.println(current.getData());
			current = current.getPrev();
		}
		
	}

	@Override
	public void addNodeAtTheEnd(T data) {
		// TODO Auto-generated method stub
		
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
		node.setPrev(current);
		return;
	}

	@Override
	public void addNodeAtTheFront(T data) {
		// TODO Auto-generated method stub
		

		Node<T> node = new Node<T>(data);
		
		if(head == null) {
			
			head = node;
			return;
		}
			
		node.setNext(head);
		head.setPrev(node);
		head = node;
		return;
	}

	@Override
	public void addNodeAfterIndex(T data, int index) {
		// TODO Auto-generated method stub
		

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
		node.setPrev(current);
		node.setNext(next);
		next.setPrev(node);
		return;
		
	}

	@Override
	public void deleteAtTheEnd() {
		// TODO Auto-generated method stub
		
		current = head;
		
		if(head == null) {
			
			return;
		}
			
		
		// traverse the list
		while((current.getNext()).getNext() != null)
		{
			current = current.getNext();
		}
		
		Node<T> next = current.getNext();
		current.setNext(null);
		next.setPrev(null);
		
		return;
	}

	@Override
	public void deleteAtTheFront() {
		// TODO Auto-generated method stub
		
		Node<T> next = head.getNext();
		head = null;
		next.setPrev(null);
		head = next;
		
	}

	@Override
	public void deleteNodeAfterIndex(int index) {
		// TODO Auto-generated method stub
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
		nodeTobeDeleted.getNext().setPrev(current);
		
		return;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new Doubly<Integer>();
		
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
		//list.printList();
		list.printReverseList();
		
	}

}

package LinkList;

public class DoublyCircular<T> implements List<T>{

	private Node<T> head;
	private Node<T> current;

	
	@Override
	public void printList() {
		// TODO Auto-generated method stub
		
		current = head ;
		
		if(current == null)
			return;
		
		if(current.getNext() == head)
			System.out.println(current.getData());
		
		while(current.getNext() != head)
		{
			System.out.println(current.getData());
			current = current.getNext();
		}
		
		// print the last element
		System.out.println(current.getData());
		
		
	}
	
	public void printReverseList() {
		// TODO Auto-generated method stub
		
		current = head ;
		
		while(current.getNext() != head)
		{
			current = current.getNext();
		}
		
		while(current.getPrev() != head.getPrev()) {
			System.out.println(current.getData());
			current = current.getPrev();
		}
		
		// print the last element
		System.out.println(current.getData());
		
	}

	@Override
	public void addNodeAtTheEnd(T data) {
		// TODO Auto-generated method stub
		
		current = head;
		Node<T> node = new Node<T>(data);
		
		
		if(head == null) {
			current = node;
			current.setNext(current);
			current.setPrev(current);
			head = current;
			return;
		}
		
		if(current.getNext() == head && current.getPrev() == head)
		{
			current.setNext(node);
			node.setPrev(current);
			node.setNext(head);
			head.setPrev(node);
			return;
		}
			
		// traverse the list
		while(current.getNext() != head)
		{
			current = current.getNext();
		}
					
		current.setNext(node);
		node.setPrev(current);
		node.setNext(head);
		head.setPrev(node);
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
		
		Node<T> prev = head.getPrev();
		node.setNext(head);
		head.setPrev(node);
		node.setPrev(prev);
		prev.setNext(node);
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
		while((current.getNext()).getNext() != head)
		{
			current = current.getNext();
		}
		
		Node<T> next = current.getNext();
		current.setNext(head);
		next.setPrev(null);
		next.setNext(null);
		head.setPrev(current);
		
		return;
	}

	@Override
	public void deleteAtTheFront() {
		// TODO Auto-generated method stub
		
		Node<T> next = head.getNext();
		Node<T> prev = head.getPrev();
		head = null;
		next.setPrev(prev);
		prev.setNext(next);
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

		List<Integer> list = new DoublyCircular<Integer>();
		
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

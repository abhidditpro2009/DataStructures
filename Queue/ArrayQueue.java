package Queue;

import java.util.*;

public class ArrayQueue<T> implements Queue<T> {

	private int maxSize;
	private ArrayList<T> list ;
	private int front ;
	private int rear;
	
	public ArrayQueue(){
		
		maxSize = 5;
		list = new ArrayList<T>(maxSize);
		front = 0;
		rear = 0;
	}
	
	public ArrayQueue(int size){
		
		maxSize = size;
		list = new ArrayList<T>(maxSize);
		front = 0;
		rear = 0;
	}
	
	public void printElements() {
		for(int i=front;i<maxSize;i++) {
			
			System.out.println(list.get(i));
		}
	}
	
	@Override
	public T poll() {
		// TODO Auto-generated method stub
		
		if(front == rear)
		{
			System.out.println("Queue is empty");
			return null;
		}
		
		T element = list.get(front);
		//list.remove(front);
		front ++;
		
		return element;
	}

	@Override
	public boolean add(T element) {
		// TODO Auto-generated method stub
		
		if(rear == maxSize )
		{
			System.out.println("Queue is full");
			return false;
		}
		
		list.add(rear,element);
		rear++;
		
		return true;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		if(front == rear)
		{
			System.out.println("Queue is empty");
			return null;
		}
		
		T element = list.get(front);
		
		return element;
	}

	public static void main(String args[])
	{
		
		ArrayQueue<Integer> queue = new ArrayQueue<Integer>();
		
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.poll();
		//System.out.println(queue.peek());
		queue.poll();
		queue.poll();
		queue.poll();
		queue.poll();
		queue.poll();
		
		//queue.printElements();
	
	}
	
}

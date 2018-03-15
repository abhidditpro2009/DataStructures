package Stack;

import java.util.ArrayList;

public class ArrayListStack<T> implements Stack<T> {

	private int maxSize;
	private ArrayList<T> list ;
	private int top ;
	
	public ArrayListStack(){
		maxSize = 5;
		list = new ArrayList<T>(maxSize);
		top = 0;
	}

	public ArrayListStack(int size){
	
		maxSize = size;
		list = new ArrayList<T>(maxSize);
		top = 0;
	}
	
	@Override
	public void push(T element) {
		// TODO Auto-generated method stub
	
		if(top == maxSize) {
			System.out.println("Stack is full");
			return;
		}
		
		list.add(top,element);
		top++;
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		if(top == 0)
			return null;
		
		top--;
		T element = list.get(top);
		
		return element;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		if(top == 0)
			return null;
		
		T element = list.get(top);
		
		return element;
	}
	
	public static void main(String args[])
	{
		
		Stack<Integer> stack = new ArrayListStack<Integer>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	
	}

}

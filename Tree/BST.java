package Tree;

public class BST<T> extends BinaryTree<T>  {
	
	private boolean found = false;
	
	public BST(Node<T> node) {
		super(node);
		// TODO Auto-generated constructor stub
	}
	
	public void addNode( Node<T> node) {
		
		if(root == null) {
			root = node;
			return;
		}
		
		addNodeHelper(root,node);
	}
	
	public void addNodeHelper(Node<T> root, Node<T> node) {
		
		int retval =  compare((Integer)node.getData(),(Integer)root.getData());
		
		if( retval < 0 && root.getLeft() != null) 
			addNodeHelper(root.getLeft(),node);
		else if( retval < 0 && root.getLeft() == null)
		{
			root.setLeft(node);
			return ;
		}	
		else if( retval > 0 && root.getRight() != null) 
			addNodeHelper(root.getRight(),node);
		else if( retval > 0 && root.getRight() == null)
		{
			root.setRight(node);
			return ;
		}	
		
	}

	public void search(T data) {
		
		if(root == null)
			System.out.println("Match not found");
		
		searchNodeHelper(root, data);
		
		if(found)
			System.out.println("Match found"); 
		else
			System.out.println("Match not found"); 
		
	}
	
	public void searchNodeHelper(Node<T> root, T data) {
		
		if(root == null)
			return;
		
		int retval =  compare((Integer)root.getData(),(Integer)data);
		
		if(retval == 0  )
			found = true;
		else if( retval > 0) 
			searchNodeHelper(root.getLeft(),data);
		else if(retval <0 ) 
			searchNodeHelper(root.getRight(),data);
		
	}

	
	
}

package TernarySearchTree;

public class TST implements TSTInterface  {

	private Node root;

	@Override
	public void add(String word) {
		// TODO Auto-generated method stub
		
		char[] chArr = word.toCharArray();
		
		Node current = root;
		boolean insertCenter = false;
		
		System.out.println("Inserting word:"+ word);
		
		for(int i=0;i< chArr.length; i++)
		{
			
			Node node = new Node(chArr[i]);
			
			if(current == null)
			{
				current = root = node;
				System.out.println("First character");
				insertCenter = true;
			}
			else if(insertCenter)
			{
				System.out.println("Inserting letter");
				current.setCenter(node);
				current = current.getCenter();
			}
			else if( ((Character)chArr[i]).toString().compareTo(current.getCharacter().toString()) == 0)
			{
				System.out.println("Going Center");
				if(current.getCenter() == null) {
					current.setCenter(node);
					insertCenter = true;
				}
				else
					current = current.getCenter();
			}
			else if( ((Character)chArr[i]).toString().compareTo(current.getCharacter().toString()) < 0)
			{
				System.out.println("Going Left");
				current.setLeft(node);
				current = current.getLeft();
				insertCenter = true;
			}
			else if( ((Character)chArr[i]).toString().compareTo(current.getCharacter().toString()) > 0)
			{
				System.out.println("Going Right");
				current.setRight(node);
				current = current.getRight();
				insertCenter = true;
			}
			
		}
		
		current.setEndOfWord(true);
		
	}

	@Override
	public void remove(String word) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean search(String word) {
		// TODO Auto-generated method stub
		
		char[] chArr = word.toCharArray();
		
		Node current = root;
		
		System.out.println("Searching word:"+ word);
		
		boolean status = false;
		boolean searchCenter = false;
		
		for(int i=0;i< chArr.length; i++)
		{
			
			if(  current !=null && (((Character)chArr[i]).toString().compareTo(current.getCharacter().toString()) == 0 || searchCenter))
			{
				System.out.println("Going Center");
				
				System.out.println(current.getCharacter().toString());
				System.out.println(((Character)chArr[i]).toString());
				
				if(current.isEndOfWord())
					status = true;
				
				current = current.getCenter();
				
				
			}
			else if( current !=null && ((Character)chArr[i]).toString().compareTo(current.getCharacter().toString()) < 0)
			{
				System.out.println("Going Left");
				
				if(current.getLeft() != null)
					current = current.getLeft();
				else
					continue;
				
				System.out.println(current.getCharacter().toString());
				System.out.println(((Character)chArr[i]).toString());
				
				if(current.isEndOfWord())
					status = true;
				
				current = current.getCenter();
				searchCenter = true;

			}
			else if( current !=null && ((Character)chArr[i]).toString().compareTo(current.getCharacter().toString()) > 0)
			{
				System.out.println("Going Right");
				
				if(current.getRight() != null)
					current = current.getRight();
				else
					continue;
				
				System.out.println(current.getCharacter().toString());
				System.out.println(((Character)chArr[i]).toString());
				
				if(current.isEndOfWord())
					status = true;
			
				current = current.getCenter();
				searchCenter = true;
		
			}
			else 
			{
				System.out.println("default");
				status = false;
				break;
			}
			
		}
		
		return status;
		
		
	}
	
	public static void main(String args[]) {
		
		TST tst = new TST();
		tst.add("hell");
		tst.add("hello");
		
		tst.add("heat");
		tst.add("hot");
		tst.add("hat");
		tst.add("bat");
		tst.add("up");
		
		if(tst.search("ups"))
			System.out.println("Match found");
		else
			System.out.println("Match not found");
	}
	
}

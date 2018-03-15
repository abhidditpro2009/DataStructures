package TernarySearchTree;

public class Node {

	private Character character;
	private Node left;
	private Node right;
	private Node center;
	private boolean endOfWord;
	
	public Node(Character c) {
		character = c;
		left = right = center = null;
		endOfWord = false;
	}

	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public Node getCenter() {
		return center;
	}

	public void setCenter(Node center) {
		this.center = center;
	}

	public boolean isEndOfWord() {
		return endOfWord;
	}

	public void setEndOfWord(boolean endOfWord) {
		this.endOfWord = endOfWord;
	}
	
	
	
}

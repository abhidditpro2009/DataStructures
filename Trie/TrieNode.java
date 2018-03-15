package Trie;

import java.util.*;

public class TrieNode {

	private HashMap<Character, TrieNode> children ;
	private boolean endOfWord;
	
	public TrieNode() {
		
		children = new HashMap<Character, TrieNode>();
		endOfWord = false;
		
	}
	
	public boolean hasChildren(){
		
		return children.isEmpty();
	}
	
	public boolean getEndOfWord(){
		
		return endOfWord;
	}
	
	public void setEndOfWord(boolean status){
		
		endOfWord = status;
	}
	
	public void addToChildren(TrieNode node, Character c){
		
		children.put(c,node);
	}
	
	public void removeFromChildren(TrieNode node, Character c){
		
		children.remove(c,node);
	}
	
	public TrieNode getChildren(Character c){
		
		return children.get(c);
	}
	
	public HashMap<Character, TrieNode> getChildNode(){
		
		return children;
	}
	
	
	public boolean checkReference(Character c){
		
		if(children.get(c) != null)
			return true;
		else
			return false;
	}
	
	
}

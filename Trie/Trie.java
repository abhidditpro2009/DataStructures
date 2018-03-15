package Trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Trie implements TrieInterface{

	private TrieNode root;
	private ArrayList<Character> word;
	private ArrayList<String> wordList;
	
	public Trie() {
		
		root = new TrieNode();
		word = new ArrayList<Character>();
		wordList = new ArrayList<String>();
	}
	
	@Override
	public void addWords(String word) {
		// TODO Auto-generated method stub
		
		char[] chArr = word.toCharArray();
		
		TrieNode temp = root;
		
		for(int i=0; i < chArr.length ;i++) {
			
			TrieNode node = new TrieNode();
			
			System.out.println("ch"+chArr[i]);
			
			if(!temp.checkReference(chArr[i])) {
				temp.addToChildren(node, chArr[i]);
			}
			
			temp = temp.getChildren(chArr[i]);
			
		}
		
		temp.setEndOfWord(true);
	}

	@Override
	public boolean searchWord(String word) {
		// TODO Auto-generated method stub
		
		char[] chArr = word.toCharArray();
			
		TrieNode temp = root;
		boolean status = false;
			
		for(int i=0; i < chArr.length ;i++) {
				
			System.out.println("i"+i);
			System.out.println("ch"+chArr[i]);
				
			if(!temp.checkReference(chArr[i])) {
					return status;
			}
				
			temp = temp.getChildren(chArr[i]);
				
		}
			
		if(temp.getEndOfWord())
			status = true;
		
		return status;

	}

	@Override
	public boolean searchPrefix(String word) {
		// TODO Auto-generated method stub

		char[] chArr = word.toCharArray();
		
		TrieNode temp = root;
			
		for(int i=0; i < chArr.length ;i++) {
				
			System.out.println("i"+i);
			System.out.println("ch"+chArr[i]);
				
			if(!temp.checkReference(chArr[i])) {
					return false;
			}
				
			temp = temp.getChildren(chArr[i]);
				
		}
			
		return true;
	}
	
	public void getAllStringsWithPrefix(Character prefix) {

		getAllStringsWithPrefixHelper(root.getChildren(prefix),prefix,"");
	}
	
	private void getAllStringsWithPrefixHelper(TrieNode node, Character prefix, String accumulator) {
	
		word.add(prefix);
		accumulator = accumulator + prefix;
		
		if(node.getEndOfWord()){
			
			wordList.add(accumulator);
		}
		else {
				
				HashMap<Character,TrieNode> map = node.getChildNode();
				
				for (Character key : map.keySet()) {
				   
					getAllStringsWithPrefixHelper(node.getChildren(key),key,accumulator);
				}
		}
		
		return;
			
	}
	
	
	@Override
	public void deleteWord(String word) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String args[]) {
		
		Trie trie = new Trie();
		trie.addWords("hell");
		trie.addWords("hello");
		trie.addWords("heat");
		trie.addWords("hot");
		trie.addWords("hat");
		trie.addWords("bat");
		trie.addWords("bin");
		trie.addWords("up");
		
		if(trie.searchWord("up"))
			System.out.println("Match found");
		else
			System.out.println("Match not found");
		
		if(trie.searchWord("abc"))
			System.out.println("Match found");
		else
			System.out.println("Match not found");
		
		if(trie.searchPrefix("d"))
			System.out.println("Prefix found");
		else
			System.out.println("Prefix not found");
		
		trie.getAllStringsWithPrefix('u');
		
		trie.wordList.forEach((str) -> {
			
			System.out.println(str);
		});
		
		
		
	}

}

package Trie;

public interface TrieInterface {

	public void addWords(String word);
	
	public boolean searchWord(String word);
	
	public boolean searchPrefix(String word);
	
	public void deleteWord(String word);
}

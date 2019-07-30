package com.tries;
import java.util.HashMap;

public class Node {
    public HashMap<Character, Node> children;
    public boolean isCompleteWord;
    
    public Node() {
        this.children = new HashMap<Character, Node>();
        this.isCompleteWord = false;
    }

	public HashMap<Character, Node> getChildren() {
		return children;
	}

	public void setChildren(HashMap<Character, Node> children) {
		this.children = children;
	}

	public boolean isCompleteWord() {
		return isCompleteWord;
	}

	public void setCompleteWord(boolean isCompleteWord) {
		this.isCompleteWord = isCompleteWord;
	}
}
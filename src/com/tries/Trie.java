package com.tries;

public class Trie {
	 
	public Node root;
	    
	    public Trie() {
	        this.root = new Node();
	    }
	    
	    public void insertWord(String word) {
	        // gets the root node;
	        Node currentNode = this.root;
	        
	        // iterates over every character in the word
	        for(int i = 0; i < word.length(); i++) {
	            // currentLetter is just the character / letter at the iteration
	            Character currentLetter = word.charAt(i);
	            // ask if the current letter is in the map of the current node
	            Node child = currentNode.children.get(currentLetter);
	            if(child == null) {
	                child = new Node();
	                currentNode.children.put(currentLetter, child); 
	            } 
	            
	            currentNode = child;
	        }
	        currentNode.isCompleteWord = true;
	    }
	    
	    public boolean isPrefixVaild(String prefix) {
	    	Node currentNode = this.root;
	    	
	    	for (int i = 0; i < prefix.length(); i++) {
	    		Character currentLetter = prefix.charAt(i);
	    		
	    		Node child = currentNode.children.get(currentLetter);
	    		if (child == null) {
	    			return false;
	    		} else {
	    			currentNode = child;
	    		}
	    	}
	    	return true;
	    }
	    
		public boolean isWordValid(String word) {
	    	Node currentNode = this.root;
	    	
	    	for (int i = 0; i < word.length(); i++) {
	    		Character currentLetter = word.charAt(i);
	    		
	    		Node child = currentNode.children.get(currentLetter);
	    		if (child == null) {
	    			return false;
	    		} else {
	    			currentNode = child;
	    		}
	    		
	    		if (i == word.length() - 1) {
	    			if (child.isCompleteWord) {
	    				return true;
	    			} else {
	    				return false;
	    			}
	    		} 		
	    	}
	    	return false;
	    }
		
	public void printAllKeys() {
		Node current=this.root;
    	for(Character keys : current.children.keySet()){
    		System.out.println(keys);
    		Trie t = new Trie();
    		t.root=current.children.get(keys);
    		t.printAllKeys();
    	}
	}	
}


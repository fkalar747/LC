package node;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Layer extends HashMap<String,Node>{
	Layer(int num){
		super(num);
	}
	
	
	public void addNode(String string) {
		Node node = new Node(string);
		put(string,node);
	}
	
	public void provokeNode(String string) {
		Node node = getNode(string);
		
	}
	
	public Node getNode(String string) {
		return get(string);	
	}
	
	
}

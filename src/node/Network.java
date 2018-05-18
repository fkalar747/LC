package node;

import java.util.Iterator;
import java.util.Map;

public class Network {

	private static final int NUM_LAYERS = 10;
	private static Layer[] Layers = new Layer[NUM_LAYERS];
	static {
		for(int i = 0 ; i < NUM_LAYERS; i++ ) {
			Layers[i] = new Layer(100);
		}
	}
	
	public static void addNode(int layer_index, String str) {
		Layers[layer_index].addNode(str);
	}
	public static void provokeNode(int layer_index, String str) {
		Layers[layer_index].provokeNode(str);
	}
	
	public static void showNodes(int layer) {
		 Iterator<Map.Entry<String,Node>> it = Layers[layer].entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry<String,Node> pair = it.next();
		        System.out.println("["+	pair.getKey() + "]");
		        it.remove(); // avoids a ConcurrentModificationException
		    }
	}
	
}

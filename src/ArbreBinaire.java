import java.util.ArrayList;
import java.util.List;

public class ArbreBinaire {

	Node root;
	
	
	public static void main(String args[]) {
		ArbreBinaire bt = new ArbreBinaire();

		    bt.add(6);
		    bt.add(4);
		    bt.add(8);
		    bt.add(3);
		    bt.add(5);
		    bt.add(7);
		    bt.add(9);
		    
		    
		    ArrayList l = new ArrayList(2);
		    l.add(1);
		    l.add(1);
		    l.add(1);
		    System.out.println(l.size());
		   System.out.println(bt.find(5).value+" "+bt.cheminP(5)); 

	}
	

	public void add(int value) {
	    root = addR(root, value);
	}

	private Node addR(Node current, int value) {
		
	    if (current == null) {
	        return new Node(value);
	    }
	 
	    if (value < current.value) {
	        current.FG = addR(current.FG, value);
	    } else if (value > current.value) {
	        current.FD = addR(current.FD, value);
	    } else {
	        return current;
	    }
	 
	    return current;
	}
	
	
//-------------------------------------------
	
	
	public Node find(int value) {
			 return findNode(root, value);			
		}
	
	private Node findNode(Node current, int value) {
	    if (current == null) {
	         throw new NullPointerException("Valeur non existante");
	    } 
	    if (value == current.value) {
	        return current;
	    } 
	    
	    if(value < current.value)
	    	return findNode(current.FG, value);
	    else 
	    	return findNode(current.FD, value);
	    
	  
	}
	
//-------------------------------------------
	
	public List<Integer> cheminP(int value) {
		 return chemin(root, value);			
	}
	
	
	public List<Integer> chemin(Node current, int value){

		if(current == null) throw new NullPointerException("root ne peu pas etre null");
		
		List<Integer> lstInt = new ArrayList<Integer>();
		
		while(current != null) {
			if(current.value>value) {
				lstInt.add(current.value);
				current = current.FG;
			}else {
				lstInt.add(current.value);
				current = current.FD;
			}
		}
		
		return lstInt;
	}
	
	
	
	
	
	private class Node {
		 Node FG;
		 Node FD;
		 int value;

		public Node(int value) {
			super();
			FG = null;
			FD = null;
			this.value = value;
		}
	}

	
}

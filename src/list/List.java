package list;

public class List {
	private Node head;
	
	public List(int n) {
		head = new Node(n);
	}
	public void addNode(int n) {		
		Node node = new Node(n);
		node.setNext(head.getNext());
		node.setPrevious(head);
		head.setNext(node);
	}
	public void removeNode() {
		head.setNext(head.getNext().getNext());
		head.getNext().setPrevious(head);
	}
	public void removeNode(int n) {
		if(findNumber(n) == true) {
			Node dummy = head;
			while(dummy.getInfo() != n) 
				dummy = dummy.getNext();
			dummy.getPrevious().setNext(dummy.getNext());
			dummy.getNext().setPrevious(dummy.getPrevious());
		}else
			System.out.println("Numero non trovato.");
	}
	public String toString() {
		Node dummy = head;
		String s = "[ ";
		while(dummy.getNext() != null) {
			s = s + dummy.getInfo() + " ";
			dummy = dummy.getNext();
		}
		return s + dummy.getInfo() + "]";
	}
	public boolean findNumber(int n) {
		Node dummy = head;
		boolean found = false;
		while(dummy.getNext() != null && !found) {
			found = dummy.getInfo() == n;
			dummy = dummy.getNext();
		}
		return found;
	}
	public boolean isAllEven() {
		Node dummy = head;
		boolean isEven = true;
		while(dummy.getNext() != null && isEven) {
			isEven = dummy.getInfo() % 2 == 0;
			dummy = dummy.getNext();
		}
		return isEven;	
	}
	public void addNodeAtEnd(int n) {
		Node dummy = head;
		Node node = new Node(n);
		while(dummy.getNext() != null) 
			dummy = dummy.getNext();
		dummy.setNext(node);
		node.setPrevious(dummy);
	}
	public void addNodeAtEndRec(Node node) {
		if(node.getNext() != null)
			this.addNodeAtEndRec(node.getNext());
		else{
			
		}
	}
	public void removeNodeAtEnd() {
		Node dummy = head;
		while(dummy.getNext().getNext() != null)
			dummy = dummy.getNext();
		dummy.setNext(null);
	}
	public void removeNodeAtEnd(Node node) {
		if(node.getNext() != null)
			this.removeNodeAtEnd(node.getNext());
		else
			(node.getPrevious()).setNext(null);
	}	
}

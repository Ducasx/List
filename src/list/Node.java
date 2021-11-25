package list;

public class Node {
	private int info;
	private Node next;
	private Node previous;
	
	public Node(int n) {
		info = n;
		next = null;
		previous = null;
	}
	public Node(Node node) {
		info = node.info;
		next = node.next;
		previous = node.previous;
	}
	public void setInfo(int n) {info = n;}
	public void setNext(Node n) {next = n;}
	public void setPrevious(Node n) {previous = n;}
	public int getInfo() {return info;}
	public Node getNext() {return next;}
	public Node getPrevious() {return previous;}
	public String toString() {
		return info + "";
	}
}

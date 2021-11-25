package list;

public class Prova {
	public static void main(String[] args) {
		List list = new List(1);
		list.addNode(3);
		list.addNode(2);
		list.addNodeAtEnd(4);
		System.out.println(list);
		list.removeNode();
		list.removeNodeAtEnd();
		System.out.println(list);
		System.out.println(list.isAllEven());
	}
}

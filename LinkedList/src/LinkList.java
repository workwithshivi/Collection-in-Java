
public class LinkList {
	Node head;

	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;

		} else {
			Node n = head; // temp veriable
			while (n.next != null) {
				n = n.next;

			}
			n.next = node;
		}
	}

	public void insertStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		node.next = head;
		head = node;

	}

	public void insetAtLocation(int index, int data) {

		Node node = new Node();
		node.data = data;
		node.next = null;

		if (index == 0) {
			insertStart(data);
		} else {

			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}

	}

	public void deleteStart() {

		head = head.next;

	}

	public void delLocation(int loc) {
		if (loc == 0) {
			deleteStart();
		} else {

			Node n = head;

			for (int i = 0; i < loc - 1; i++) {
				n = n.next;

			}
			n.next = n.next.next;
		}
	}

	public void show() {
		Node node = head;
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;

		}
		System.out.println(node.data);

	}

}

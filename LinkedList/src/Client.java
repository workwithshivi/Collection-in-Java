

public class Client {
	public static void main(String[] args) {
		
		LinkList l=new LinkList();
		l.insert(5);
		l.insert(15);
		l.insert(25);
		l.show();
		
		System.out.println("\nstart");
		l.insertStart(1);
		
		
		l.insetAtLocation(1, 100);
		l.show();
		
		l.delLocation(1);
		System.out.println("\ndelete");
		l.show();
		
	}
}

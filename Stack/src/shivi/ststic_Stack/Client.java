package shivi.ststic_Stack;


public class Client {
	public static void main(String[] args) {
		Stack s=new Stack();
		
		s.push(20);
		s.push(8);
		s.push(16);
		s.push(2);
		s.push(82);
		s.push(116);
		s.show();
		s.pop();
		s.show();
		s.peek();
		
	}

}

package shivi.DynamicStack;


public class DClient {
	public static void main(String[] args) {
		DStack s=new DStack();
		
		s.push(20);
		s.push(8);
		s.push(16);
		s.push(2);
		s.push(82);
		s.push(116);
		s.show();
		System.out.println("size is "+s.size());
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		System.out.println("size is "+s.size());
		
		
	}

}

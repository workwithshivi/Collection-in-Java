package shivi.DynamicStack;

public class DStack {
	int stackSize = 1;
	int stack[] = new int[stackSize];

	int top = 0;

	public void push(int data) {

		if (top == stackSize) {
			expand();
		}

		
			stack[top] = data;
			top++;
		
	}

	private void expand() {
		int l=size();
		int nStack[]=new int[stackSize*2];
		System.arraycopy(stack, 0, nStack, 0, l);
		stack=nStack;
		stackSize=stackSize*2;
		
		
	}

	public void pop() {

		if (isEmpty()) {
			System.out.println("Stack is empty..");
		} else {

			int data;
			top--;
			data = stack[top - 1];

			stack[top] = 0;
			System.out.println(data + " pop from the stack");
			
			shrink();
		}
	}

	private void shrink() {
		int l=size();
		if(l==(stackSize/4))
		{
			stackSize=stackSize/2;
			
			int nStack[]=new int[stackSize];
			System.arraycopy(stack, 0, nStack, 0, l);
			stack=nStack;
			
		}
		
	}

	public void peek() { // to fatch data

		int data;
		top--;
		data = stack[top];

		stack[top] = 0;
		System.out.println(data + " last data inserted in the stack");

	}

	public int size() {
		return top;
	}

	public boolean isEmpty() {
		if (top <= 0) {
			return true;
		} else {
			return false;
		}
	}

	public void show() {
		for (int n : stack) {
			System.out.println(n + "  ");
		}

	}


}

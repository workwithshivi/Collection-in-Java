package shivi.ststic_Stack;


public class Stack {

	int n = 5;
	int stack[] = new int[n];

	int top = 0;

	public void push(int data) {

		if (top == n) {
			System.out.println("Stack is full..");
		}

		else {
			stack[top] = data;
			top++;
		}
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

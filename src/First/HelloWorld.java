package First;

public class HelloWorld {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello world!");
		
		MyStack myStack = new MyStack(2);
		
		myStack.push(10);
		myStack.push(50);
		myStack.pop();
		myStack.push(7);
		myStack.push(15);
		myStack.push(20);		
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.push(12);
		
	}
}

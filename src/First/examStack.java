package First;

import java.util.Stack;

public class examStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st= new Stack();
		st.push(new Integer(1));
		st.push(new Integer(2));
		
		System.out.println("pop1:" + st.pop());
		System.out.println("pop2:" + st.pop());
	}

}

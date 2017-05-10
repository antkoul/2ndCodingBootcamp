package Collections;

import java.util.Stack;
import java.util.Arrays;

public class ReverseStack {
	
	public static Stack<Integer> reverse(Stack<Integer> initial) {	
		Stack<Integer> myTempStack = new Stack<>();
		int size=initial.size();
		for(int i=1;i<=size;i++){   //ean eixa grapsei mesa sto for i<=initial.size() tote tha ekane mono ta misa stoixeia reverse, epeidi se kathe epanalipsi me kathe pop() pou tha ekane, tha meione kai to megethos tis initial.size() 
			myTempStack.push(initial.pop());
		}
		return myTempStack;
    }

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.addAll(Arrays.asList(new Integer[]{0,1,2,3,4,5,6,7,8,9,10}));     
        System.out.println("initial stack: " + myStack);
        System.out.println("reversed stack: " + reverse(myStack));
        System.out.println("initial stack: " + myStack);
        
        /*Proponisi
        System.out.println(myStack.capacity());
        System.out.println(myStack.toString());
        System.out.println("Only view"+myStack.peek());

        Integer test=myStack.pop();
        System.out.println(test);
        System.out.println(myStack.toString());
        
        myStack.push(test);
        System.out.println(myStack.toString());
        Integer test1=myStack.search(10);
        System.out.println(test1); 
        */
    }
}

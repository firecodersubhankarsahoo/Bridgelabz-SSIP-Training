package stacks_and_queues;
import java.util.*;
public class Sort_Stack_Using_Recursion {
	public static void sort(Stack<Integer>stack) {
		if(!stack.isEmpty()) {
			int top=stack.pop();
			sort(stack);
			insert(stack,top);
		}
	}
	public static void insert(Stack<Integer>stack,int value) {
		if(stack.isEmpty()||stack.peek()<=value) {
			stack.push(value);
		}else {
			int top=stack.pop();
			insert(stack,value);
			stack.push(top);
		}
	}
	public static void main(String args[]) {
		Stack<Integer>stack=new Stack<>();
		stack.push(1);
		stack.push(9);
		stack.push(7);
		stack.push(3);
		stack.push(6);
		stack.push(4);
		System.out.println("Before: "+stack);
		sort(stack);
		System.out.println("After:"+stack);
		
		
	}
}

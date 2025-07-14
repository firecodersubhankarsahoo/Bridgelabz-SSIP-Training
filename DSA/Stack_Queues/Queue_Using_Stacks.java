package stacks_and_queues;
import java.util.*;
public class Queue_Using_Stacks {
	static class Queue{
		Stack<Integer>st1=new Stack<>();
		Stack<Integer>st2=new Stack<>();
		void enqueue(int x) {
			while(!st1.isEmpty()) {
				st2.push(st1.peek());
				st1.pop();
			}
			st1.push(x);
			while(!st2.isEmpty()) {
				st1.push(st2.peek());
				st2.pop();
			}
		}
		int dequeue() {
			if(st1.isEmpty()) {
				System.out.println("Stack is empty");
				return -1;
			}
			int x=st1.peek();
			st1.pop();
			return x;
		}
	}
	public static void main(String args[]) {
		Queue q=new Queue();
		q.enqueue(2);
		q.enqueue(6);
		q.enqueue(5);
		q.enqueue(3);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());  
		
	}
}

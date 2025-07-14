package stacks_and_queues;


class Implementation {
	int top=-1;
	int cap;
	int []arr;
	public Implementation(int cap) {
		this.cap=cap;
		arr=new int[cap];
	}
	public boolean push(int x) {
		if(top>=cap-1) {
			System.out.println("Stack Overflow");
			return false;
		}
		top++;
		arr[top]=x;
		return true;
	}
	public int pop() {
		if(top<0) {
			System.out.println("Stack underflow");
			return -1;
		}
		int x=arr[top];
		top--;
		return x;
	}
	public int peek() {
		if(top<0) {
			System.out.println("Stack is empty");
			return -1;
		}
		return arr[top];
	}
	public boolean isEmpty() {
		return arr.length==0;
	}
	public int size() {
		return top+1;
	}
	
}

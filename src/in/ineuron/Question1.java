package in.ineuron;

public class Question1 {

	public static void main(String[] args) {
		
		Stack s=new Stack(5);
		s.push(1);
		s.push(3);
		s.push(4);
		s.push(3);
		s.push(5);
		s.push(3);
		System.out.println(s.pop()+" "+s.top());
		

	}
}

class Stack{
	private int[] arr;
	private int top;
	private int size;
	
	Stack(int size) {
		arr=new int[size];
		top=-1;
		size=0;
	}
	
	public void push(int data) {
		top++;
		if(top>=arr.length) {
			int[] temp= arr;
			arr=new int[arr.length*2];
			for(int i=0; i<temp.length;i++) arr[i]=temp[i];
		}
		arr[top]=data;
		size++;
	}
	
	public int pop() {
		if(isEmpty()) return -1;
		int data= arr[top];
		top--;
		size--;
		return data;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public int top() {
		return (top==-1)?-1:arr[top];
	}
}

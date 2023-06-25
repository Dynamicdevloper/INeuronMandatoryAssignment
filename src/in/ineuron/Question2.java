package in.ineuron;

public class Question2 {
	
	public static void main(String[] args) {
		
		Queue q=new Queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		System.out.println(q.front()+" "+q.dequeue()+" "+ q.isEmpty()+" "+q.front());
		
    }
}

class Queue{
	private Node head;
	private Node tail;
	
	Queue(){
		head=null;
		tail=null;
	}
	
	public void enqueue(int data) {
		if(head==null) {
			head=new Node(data);
			tail=head;
			return;
		}
		tail.next= new Node(data);
		tail=tail.next;
	}
	
	public int dequeue() {
		if(head==null) return-1;
		int data= head.data;
		head=head.next;
		return data;
	}
	
	public boolean isEmpty() {
		return (head==null)? true: false;
	}
	
	public int front() {
		return (isEmpty()) ?-1: head.data;
	}
}











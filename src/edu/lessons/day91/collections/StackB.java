package edu.lessons.day91.collections;

public class StackB<E> {
	private E[] arr = null;
	private int CAP;
	private int top = -1;
	private int size = 0;
 
	@SuppressWarnings("unchecked")
	public StackB(int cap) {
		this.CAP = cap;
		this.arr = (E[]) new Object[cap];
	}
 
	public E pop() {
		if(this.size == 0){
			return null;
		}
 
		this.size--;
		E result = this.arr[top];
		this.arr[top] = null;//prevent memory leaking
		this.top--;
 
		return result;
	}
 
	public boolean push(E e) {
		if (isFull())
			return false;
 
		this.size++;
		this.arr[++top] = e;
 
		return true;
	}
 
	public boolean isFull() {
		if (this.size == this.CAP)
			return true;
		return false;
	}
 
	public String toString() {
		if(this.size==0){
			return null;
		}
 
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<this.size; i++){
			sb.append(this.arr[i] + ", ");
		}
 
		sb.setLength(sb.length()-2);
		return sb.toString();	
	}
 
	public static void main(String[] args) {
 
		StackB<String> stack = new StackB<String>(11);
		stack.push("hello");
		stack.push("world");
 
		System.out.println(stack);
 
		stack.pop();
		System.out.println(stack);
 
		stack.pop();
		System.out.println(stack);
		StackB<Integer> intstack=new StackB<>(10);
		intstack.push(1000);
		System.out.println(intstack);
	}
}
package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * Stack 
 * 마지막에 저장한 데이터를 가장 먼저 꺼냄 => LIFO (Last In First Out) 
 * 
 * push(): 삽입 , pop() : 인출 , empty() : 비어있느냐  
 * 
 * 
 * Queue 
 * offer() : 삽입 , poll() : 인출 
 * */


public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		Queue<String> queue = new LinkedList<String>();
		
		//stack 삽입 
		stack.push("0");
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		
		// queue 삽입 
		queue.offer("10");
		queue.offer("9");
		queue.offer("8");
		queue.offer("7");
		queue.offer("6");
		
		// stack 인출 
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
		
		
		System.out.println();
		
		//queue 인출 
		while (!queue.isEmpty()) {	//비어있지 않으면 
			System.out.println(queue.poll());
		}
		
	}

}

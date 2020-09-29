package com.learn.collections;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
		
		for(int i=10;i>0;i--) {
			queue.add(i);
		}
		
		//Queue Front 10 9 8..1 Rear
		
		//PriorityQueue Front 1 2 3..10 Rear
		
		System.out.println(queue.peek()); //Head of queue 1
		queue.poll(); //Remove Head
		
		
		queue.poll();
		System.out.println(queue.size());
		
		System.out.println(queue.peek());
	}
}

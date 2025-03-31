package study1;

import java.util.Comparator;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		Queue<Task> todolist=new PriorityQueue<Task>();
		//Adding taks to priority queue
		todolist.add(new Task("Task-1",4));
		todolist.add(new Task("Task-2",2));
		todolist.add(new Task("Task-3",1));
		todolist.add(new Task("Task-4",5));
		todolist.add(new Task("Task-5",3));
		
		//Task removal from header
		System.out.println("Task Processing order...");
		while(!todolist.isEmpty()) {
			Task task=todolist.poll();
			System.out.println(task.getName()+","+task.getPriority());
		}
		}
}
class Task implements Comparable<Task>{
	private int priority;
	private String name;
    Task(String name,int priority) {
		//super();
		this.priority = priority;
		this.name = name;
	}
	public int getPriority() {
		return priority;
	}
	
	public String getName() {
		return name;
	}
	@Override
	public int compareTo(Task o) {
		return Integer.compare(this.priority, o.priority);
	}
}

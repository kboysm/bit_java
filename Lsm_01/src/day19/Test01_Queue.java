package day19;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test01_Queue {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		for(int i=0 ; i<100 ;i++) {
			stack.push(""+i);
		}
		System.out.println(stack.pop()); //맨위에 있는 아이가 99라서 99가 나온다.
		
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i=0 ;i<100 ; i++) {
			queue.offer(i); // 큐는 offer로 데이터를 집어넣음 
		}//큐는 링크드리스트를 기반으로 동작하는 아이
		System.out.println(queue.poll()); //꺼낼때는 poll로 꺼낸다. 0이 나옴 0이 제일 먼저 드가서 제일먼저 나옴
	}
}

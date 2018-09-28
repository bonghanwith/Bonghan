package chapter02.exercise;

import java.util.Iterator;

/**
 * 연습문제 16번에서 클래스로 만든 큐용으로 반복자(이터레이터)를 구현하라. 큐 반복자는 큐의 요소들을 차례로 내어주는 객체다. 
 * Iterator클래스는 next와 hasNext 메서드를 구현한 중첩 클래스로 만든다. 
 * Queue.Iterator를 돌려주는 Queue의 iterator() 메서드를 구현한다. 
 * Iterator가 정적 클래스여야 하는가, 그렇지 않아야 하는가?
 * @author bongh
 *
 */
public class Ex17 {
	public static class Queue{
		private Node head, tail;
		
		public void add(String s) {
            Node n = new Node(s);
            if (this.head == null) {
                this.head = n;
                this.tail = n;
            } else {
                this.tail.next = n;
                this.tail = n;
            }
        }
		
		/*public void add(String data) {
			Node node = new Node(data);
			if( this.head == null) {
				this.head = node;
				this.head.next = node;
				this.tail = node;
			}else {
				this.tail.next = node;
				this.tail = node;
			}
		}*/
		
		public String remove() {
			if( this.head == null) {
				return null;
			}else {
				Node n = this.head;
                this.head = this.head.next;
                return n.getData();
			}
		}
		
		public Iterator<String> iterator(){
			return new QueueIterator();
		}
		
		private class QueueIterator implements Iterator<String>{
			Node current = head;

			@Override
			public boolean hasNext() {
				if(current == null) {
					return false;
				}
				return true;
			}

			@Override
			public String next() {
				String result = "";
				if(hasNext()) {
					result = current.getData();
					this.current = this.current.next;
				}else {
					result = null;
					this.current = null;
				}
				/*
				String result = hasNext() ?  : null;
                this.current = hasNext() ? this.current.next : null;*/
				
                return result;
			}
			
		}
		
		private class Node{
			private final String data;
			Node previous, next;
			
			public Node(String data) {
				this.data = data;
	        }

	        public String getData() {
	        	return data;
	        }
		}
	}

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.add("1");
		queue.add("2");
		queue.add("3");
		queue.add("4");
		
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		
		queue.add("1");
		queue.add("2");
		queue.add("3");
		queue.add("4");
		queue.add("1");
		queue.add("2");
		queue.add("3");
		queue.add("4");
		
		Iterator<String> iterator = queue.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}

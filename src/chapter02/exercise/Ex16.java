package chapter02.exercise;

/**
 * 16. 경계가 없는 문자열의 큐를 표현하는 Queue 클래스를 구현하라. 
 * 뒤에 추가하는 add메서드와 앞에서 제거하는 remove 메서드를 구현한다. 
 * 요소들은 노드의 연결 리스트로 저장한다. Node는 중첩 클래스로 만든다. 
 * Node가 정적 클래스여야 하는가, 그렇지 않아야 하는가?
 * 
 * A. 클래스 안에서만 사용하기 때문에 정적 클래스일 필요가 없다.
 * @author bongh
 *
 */
public class Ex16 {
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
	}

}

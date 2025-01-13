package linkedlist;

public class SingleLinkedList<T> implements CustomLinkedList<T> {
	private Node<T> head = null;
	private int size = 0;

	public T get(int index) {
		if (size < index) {
			throw new IndexOutOfBoundsException("잘못된 인덱스입니다. : " + index);
		}

		Node<T> current = head;
		int start = 0;
		while (current != null) {
			if (start == index) {
				current = current.nextNode;
				return current.data;
			}

			current = current.nextNode;
			start++;
		}

		throw new IndexOutOfBoundsException("잘못된 인덱스 입니다. : " + index);
	}

	@Override
	public void insert(T data) {
		size++;
		if (head == null) {
			head = new Node<>(data);
			return;
		}

		Node<T> temp = head;
		while (temp.nextNode != null) {
			temp = temp.nextNode;
		}
		temp.nextNode = new Node<>(data);
	}

	@Override
	public boolean remove(Object data) {
		if (head == null) {
			return false;
		}

		Node<T> temp = head;
		Node<T> prevNode = head;

		for (int index = 0; index < size; index++) {
			if (temp.data.equals(data)) {
				unlink(prevNode, temp);
				return true;
			}

			if (!prevNode.equals(temp)) {
				prevNode = temp;
			}
			temp = temp.nextNode;
		}

		return false;
	}

	public void unlink(
		Node<T> prevNode,
		Node<T> node
	) {
		if (head == null) {
			size = 0;
			return;
		}

		size--;
		//첫 번째 Node일 경우
		if (prevNode.equals(node)) {
			if (node.nextNode == null) {
				head = null;
			} else {
				head = node.nextNode;
			}
			return;
		}

		//최종 Node일 경우
		if (node.nextNode == null) {
			prevNode.nextNode = null;
			return;
		}

		prevNode.nextNode = node.nextNode;
	}

	// 리스트를 역순으로 뒤집기
	public void reverse() {
		Node previous = null;
		Node current = head;
		Node next = null;

		while (current != null) {
			next = current.nextNode;        // [보관절차]다음 노드 저장 (2)

			current.nextNode = previous;    // 현재 노드의 연결을 반대로 변경 nextNode = null >> 이전노드가 다음노드로 온단뜻

			previous = current;             // 이전 노드를 현재 노드로 이동 previous = 1 >>
			current = next;                 //  다음 노드로 이동 current = 2
		}

		head = previous; // 새로운 헤드 설정
	}


	// 리스트를 역순으로 뒤집기
	public void print() {
		Node current = head;

		while (current != null) {
			System.out.println(current.data);
			current = current.nextNode;
		}
	}

	public int getSize() {
		return size;
	}

}

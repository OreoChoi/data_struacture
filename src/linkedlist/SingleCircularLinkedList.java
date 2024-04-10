package linkedlist;

public class SingleCircularLinkedList<T> implements CustomLinkedList<T> {

    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;

    @Override
    public void insert(T data) {
        size++;
        if (head == null) {
            head = new Node<>(data);
            tail = head;
            return;
        }

        Node<T> temp = tail;
        tail = new Node<>(data, null, head);
        temp.nextNode = tail;
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
}

package linkedlist;

public class Node<T> {
    T data;
    Node<T> prevNode;
    Node<T> nextNode;

    public Node(
            T data
    ) {
        this.data = data;
        this.prevNode = null;
        this.nextNode = null;
    }

    public Node(
            T data,
            Node<T> prevNode
    ) {
        this.data = data;
        this.prevNode = prevNode;
        this.nextNode = null;
    }
    public Node(
            T data,
            Node<T> prevNode,
            Node<T> nextNode
    ) {
        this.data = data;
        this.prevNode = prevNode;
        this.nextNode = nextNode;
    }
}

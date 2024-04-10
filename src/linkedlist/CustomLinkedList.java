package linkedlist;

public interface CustomLinkedList<T> {

    void insert(T data);

    boolean remove(Object data);

    void unlink(
            Node<T> prevNode,
            Node<T> node
    );

}

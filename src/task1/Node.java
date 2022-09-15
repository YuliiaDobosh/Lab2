package task1;

public class Node<E> {
    private E info;
    private Node<E> prev;
    private Node<E> next;

    public E getInfo() {
        return info;
    }

    public void setInfo(final E info) {
        this.info = info;
    }

    public Node<E> getPrev() {
        return prev;
    }

    public void setPrev(final Node<E> prev) {
        this.prev = prev;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(final Node<E> next) {
        this.next = next;
    }

    public Node(final E info, final Node<E> prev, final Node<E> next) {
        this.info = info;
        this.prev = prev;
        this.next = next;
    }
}

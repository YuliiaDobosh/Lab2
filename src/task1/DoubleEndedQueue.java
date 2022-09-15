package task1;

import java.util.Iterator;

public class DoubleEndedQueue<E> implements Iterable<E> {
    private Node<E> first;
    private Node<E> last;

    public void addFirst(final E info) {
        final Node<E> tmpFirst = first;
        final Node<E> node = new Node<>(info, null, tmpFirst);
        first = node;
        if (tmpFirst == null) {
            last = node;
        } else {
            tmpFirst.setPrev(node);
        }
    }

    public void addLast(final E info) {
        final Node<E> tmpLast = last;
        final Node<E> node = new Node<>(info, tmpLast, null);
        last = node;
        if (tmpLast == null) {
            first = node;
        } else {
            tmpLast.setNext(node);
        }
    }

    public E get(final int index) {
        Node<E> resultNode = first;
        for (int i = 0; i < index; i++) {
            resultNode = resultNode.getNext();
        }
        return resultNode.getInfo();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        for (final E info : this) {
            builder.append(info).append(" ");
        }
        return builder.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new DEQIterator();
    }

    class DEQIterator implements Iterator<E> {
        private Node<E> currentNode = first;

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public E next() {
            final Node<E> tmp = currentNode;
            currentNode = currentNode.getNext();
            return tmp.getInfo();
        }
    }
}

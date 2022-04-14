package LinkLesson;

import java.util.Objects;

public class Linked<E> {
    private Node<E> head;
    private Node<E> tail;

    private int size = 0;

    public void add(E e) {

        Node<E> l = tail;
        Node<E> nextNode = new Node<>(null, tail, e);
        tail = nextNode;
        if (l == null) {
            head = nextNode;
        } else {
            l.next = nextNode;
            size++;
        }
    }

    public void add(E e, int index) {

        if (size > 0 && index <= size) {

            if (index == size) {
                add(e);
            } else {
                Node<E> x = head;
                for (int i = 0; i < index; i++) {
                    x = x.next;
                }

                Node<E> l = x.prev;
                Node<E> nextNode = new Node<>(x, l, e);
                x.prev = nextNode;
                if (l == null) {
                    head = nextNode;
                } else {
                    l.next = nextNode;
                    size++;
                }

            }

        }

    }

    public void clear() {
        for (Node<E> x = head; x != null; ) {
            Node<E> next = x.next;
            x.e = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        head = null;
        tail = null;
        size = 0;
    }

    public E get(int index) {

        if (size >= 0 && index <= size) {
            Node<E> x = head;
            for (int i = 0; i < index; i++) {
                x = x.next;
            }

            return x.e;
        }

        return null;
    }

    public int indexOf(Object o){
        int index = 0;

        if (o == null) {
            for (Node<E> x = head; x != null; x = x.next) {
                if (Objects.equals(x.e, o))
                    return index;
                index++;
            }
        } else {
            for (Node<E> x = head; x != null; x = x.next) {
                if (o.equals(x.e))
                    return index;
                index++;
            }
        }
        return -1;
    }




    private class Node<E> {
        private Node<E> next;
        private Node<E> prev;
        private E e;

        public Node(Node<E> next, Node<E> prev, E e) {
            this.next = next;
            this.prev = prev;
            this.e = e;
        }
    }

    public int getSize() {
        return size;
    }
}

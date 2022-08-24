package custom_linked_list.node;

import java.util.Objects;

public class Node<E> {
    private E currentElement;
    private Node<E> nextElement;
    private Node<E> prevElement;

    public Node(E currentElement, Node<E> nextElement, Node<E> prevElement) {
        this.currentElement = currentElement;
        this.nextElement = nextElement;
        this.prevElement = prevElement;
    }

    public E getCurrentElement() {
        return currentElement;
    }

    public void setCurrentElement(E currentElement) {
        this.currentElement = currentElement;
    }

    public Node<E> getNextElement() {
        return nextElement;
    }

    public void setNextElement(Node<E> nextElement) {
        this.nextElement = nextElement;
    }

    public Node<E> getPrevElement() {
        return prevElement;
    }

    public void setPrevElement(Node<E> prevElement) {
        this.prevElement = prevElement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        return Objects.equals(currentElement, node.currentElement) && Objects.equals(nextElement, node.nextElement) && Objects.equals(prevElement, node.prevElement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentElement, nextElement, prevElement);
    }

    @Override
    public String toString() {
        return "Node{" +
                "currentElement=" + currentElement +
                ", nextElement=" + nextElement +
                ", prevElement=" + prevElement +
                '}';
    }
}

package custom_linked_list.linked_list;

import custom_linked_list.Linked;
import custom_linked_list.node.Node;

import java.util.Objects;

public class CustomLinkedList<E> implements Linked<E> {
    private int size = 0;
    private Node<E> firstElement;
    private Node<E> lastElement;

    public CustomLinkedList(Node<E> firstElement, Node<E> lastElement) {
        this.firstElement = new Node<>(null,null,lastElement);
        this.lastElement =  new Node<>(null,firstElement,null);
    }

    @Override
    public void add(E e) {

        size++;
    }

    @Override
    public void delete(Object o) {

        /*if (size != 0) {
            size--;
            size = size > 0 ? size-- : size = 0;
        }*/
    }

    @Override
    public CustomLinkedList sort(Linked<E> element) {
        return null;
    }

    @Override
    public int size(Linked<E> element) {
        return 0;
    }

    @Override
    public E getElementByIndex(int index) {
        return null;
    }

    public Node<E> getFirstElement() {
        return firstElement;
    }

    public void setFirstElement(Node<E> firstElement) {
        this.firstElement = firstElement;
    }

    public Node<E> getLastElement() {
        return lastElement;
    }

    public void setLastElement(Node<E> lastElement) {
        this.lastElement = lastElement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomLinkedList<?> that = (CustomLinkedList<?>) o;
        return size == that.size && Objects.equals(firstElement, that.firstElement) && Objects.equals(lastElement, that.lastElement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, firstElement, lastElement);
    }

    @Override
    public String toString() {
        return "CustomLinkedList{" +
                "size=" + size +
                ", firstElement=" + firstElement +
                ", lastElement=" + lastElement +
                '}';
    }
}

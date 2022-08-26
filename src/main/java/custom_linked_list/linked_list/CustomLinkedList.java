package custom_linked_list.linked_list;

import custom_linked_list.Linked;
import custom_linked_list.node.Node;

import java.util.Comparator;
import java.util.Objects;

public class CustomLinkedList<E> implements Linked<E>, Comparator<E> {
    private int size = 0;
    private Node<E> head;
    private Comparator CustomComparator = null;

    public CustomLinkedList() {
    }

    @Override
    public void add(E e) {
        Node<E> newNode = new Node(e);
        if (this.head == null) {
            head = newNode;
            size++;
        } else {
            Node currentNode = head;
            while (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(newNode);
            size++;
        }

    }

    @Override
    public void delete(int index) {
        Node node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.getNextNode();
        }
        node.setNextNode(node.getNextNode().getNextNode());
        size--;
    }


    @Override
    public Linked<E> sort(Linked<E> element) {
        return null;
    }

    @Override
    public E getElement(int counter) {
        Node<E> currentNode = getHead();
        for (int i = 0; i < counter; i++) {
            currentNode = currentNode.getNextNode();
        }
        return currentNode.getCurrentElement();
    }


    public int getSize() {
        return size;
    }

    public Node<E> getHead() {
        return head;
    }

    public void setHead(Node<E> head) {
        this.head = head;
    }

    @Override
    public int compare(E o1, E o2) {
        return 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomLinkedList<?> that = (CustomLinkedList<?>) o;
        return size == that.size && Objects.equals(head, that.head);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, head);
    }
}

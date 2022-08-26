package custom_linked_list.linked_list;

import custom_linked_list.node.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class CustomLinkedListTest {

    @Test
    void add() {
        Node<Integer> node = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node3 = new Node<>(3);
        CustomLinkedList<Integer> integerList = new CustomLinkedList<>();
        integerList.add(node.getCurrentElement());
        integerList.add(node2.getCurrentElement());
        integerList.add(node3.getCurrentElement());
        Integer element = integerList.getElement(2);
        assertEquals(3, element);
    }

    @Test
    void delete() {
        Node<Integer> node = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node3 = new Node<>(3);
        CustomLinkedList<Integer> integerList = new CustomLinkedList<>();
        integerList.add(node.getCurrentElement());
        integerList.add(node2.getCurrentElement());
        integerList.add(node3.getCurrentElement());
        integerList.delete(2);
        assertThrows(NullPointerException.class, () -> {
            int result = integerList.getElement(2);
        });

    }

    @Test
    void sort() {
    }

    @Test
    void getElementWhenListIsNotEmpty() {
        Node<Integer> node = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node3 = new Node<>(3);
        CustomLinkedList<Integer> integerList = new CustomLinkedList<>();
        integerList.add(node.getCurrentElement());
        integerList.add(node2.getCurrentElement());
        integerList.add(node3.getCurrentElement());
        int actual = integerList.getElement(2);
        assertEquals(3, actual);
    }

    @Test
    void size() {
        Node<Integer> node = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node3 = new Node<>(3);
        CustomLinkedList<Integer> integerList = new CustomLinkedList<>();
        integerList.add(node.getCurrentElement());
        integerList.add(node2.getCurrentElement());
        integerList.add(node3.getCurrentElement());
        int size = integerList.getSize();
        assertEquals(3, size);
    }
}
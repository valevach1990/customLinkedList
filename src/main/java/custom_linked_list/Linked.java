package custom_linked_list;

import custom_linked_list.linked_list.CustomLinkedList;

public interface Linked <E>{
    void add(E e);
    void delete(E e);
    Linked<E> sort(Linked<E> element);
    int size(Linked<E> element);
    E getElementByIndex(int index);
}

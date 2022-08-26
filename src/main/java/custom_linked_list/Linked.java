package custom_linked_list;

import custom_linked_list.linked_list.CustomLinkedList;

public interface Linked <E>{
    void add(E e);
    void delete(int index);
    Linked<E> sort(Linked<E> element);
    E getElement(int counter);

}

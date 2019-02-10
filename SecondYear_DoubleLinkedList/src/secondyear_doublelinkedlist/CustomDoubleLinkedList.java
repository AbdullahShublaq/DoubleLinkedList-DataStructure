/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondyear_doublelinkedlist;

/**
 *
 * @author jit
 * @param <E>
 */
public class CustomDoubleLinkedList<E> {

    private int size;
    private Node head;
    private Node tail;

    public void AddAtHead(E data) {
        if (size == 0) {
            head = new Node(data);
            tail = head;
        } else {
            Node newNode = new Node(data);
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
        size++;
    }

    public void AddAtTail(E data) {
        if (size == 0) {
            tail = new Node(data);
            head = tail;
        } else {
            Node newNode = new Node(data);
            newNode.previous = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void AddAtIndex(int index, E data) {
        if (index == 0) {
            AddAtHead(data);
        } else if (index == size - 1) {
            AddAtTail(data);
        } else {
            Node previous = null;
            Node current = head;
            for (int i = 0; i < size; i++) {
                if (i == index - 1) {
                    previous = current;
                }
                if (i == index) {
                    Node newNode = new Node(data);

                    previous.next = newNode;
                    newNode.previous = previous;

                    newNode.next = current;
                    current.previous = newNode;

                    size++;
                    break;
                }
                current = current.next;
            }
        }
    }

    public void DeleteHead() {
        head = head.next;
        head.previous = null;

        size--;

        if (size == 1) {
            tail = head;
        }
    }

    public void DeleteTail() {
        tail = tail.previous;
        tail.next = null;

        size--;

        if (size == 1) {
            head = tail;
        }
    }

    public void DeleteAtIndex1(int index) {
        if (index == 0) {
            DeleteHead();
        } else if (index == size - 1) {
            DeleteTail();
        } else {
            Node previous = null;
            Node current = head;
            for (int i = 0; i < size; i++) {
                if (i == index - 1) {
                    previous = current;
                }
                if (i == index) {
                    previous.next = current.next;
                    current.next.previous = previous;
                    current.next = null;
                    current.previous = null;
                    size--;
                    break;
                }
                current = current.next;
            }
        }
    }

    public void DeleteAtIndex2(int index) {
        if (index == 0) {
            DeleteHead();
        } else if (index == size - 1) {
            DeleteTail();
        } else {
            Node next = null;
            Node current = tail;
            for (int i = size; i > 0; i++) {
                if (i == index + 1) {
                    next = current;
                }
                if (i == index) {
                    next.previous = current.previous;
                    current.previous.next = current.next;
                    current.next = null;
                    current.previous = null;
                    size--;
                    break;
                }
            }
            current = current.previous;
        }
    }
}

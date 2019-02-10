/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondyear_doublelinkedlist;

/**
 *
 * @author jit
 */
public class Node<E> {
    E data;
    Node next;
    Node previous;

    public Node(E data) {
        this.data = data;
    }

    public E getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrevious() {
        return previous;
    }
}

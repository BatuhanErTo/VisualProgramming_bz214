package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EmptyStackException;

// Stack is a linear data structure which follows Last In First Out order.
// A stack has two principal operations:
// push, which adds an element to the collection, and
// pop, which removes the most recently added element that was not yet removed.


public class GenericStack<E> {
    private ArrayList<E> list = new ArrayList<>();

    public int getSize() {
        return list.size();
    }

    public E peek() { //look at the object at the top of this stack without removing it from the stack
        return list.get(getSize() - 1);
    }

    public void push(E o) { //pushes an item onto the top of this stack
        list.add(o);
    }

    public E pop() { //removes the object at the top of this stack and returns that object
        if(getSize() == 0)
            throw new EmptyStackException();
        E result = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return result;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }

    public void pushAll(Iterable<? extends E> src) {
        for (E e : src)
            push(e);
    }

    // Wildcard type for parameter that serves as an E consumer
    public void popAll(Collection<? super E> dst) {
        while (!isEmpty())
            dst.add(pop());
    }
    /*
    // pushAll method without wildcard type: inefficient!
    public void pushAll(Iterable<E> src) {
        for (E e : src)
            push(e);
    }
    // popAll method without wildcard type: inefficient!
    public void popAll(Collection<E> dst) {
        while (!isEmpty())
            dst.add(pop());
    }*/

    public static void main(String[] args) {
        GenericStack<Number> stack = new GenericStack<>();
        stack.push(1);
        stack.push(2);

        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(-1);
        ints.add(-2);
        stack.pushAll(ints);

        ArrayList<Object> objects = new ArrayList<>();
        stack.popAll(objects);
        System.out.println(objects);
    }
}
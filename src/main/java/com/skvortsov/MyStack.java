package com.skvortsov;

import java.util.Optional;

public class MyStack implements Stackable {
    private int size;
    private String[] arr = new String[size];
    private int top;

    public MyStack(int n) {
        this.size = n;
        this.arr = new String[size];
        this.top = -1;
    }

    public void addElement(String element) throws StackException {
        if (isFull()) {
            throw new StackException("Cant add element. Stack is full");
        }
        arr[++top] = element;
    }

    public String deleteElement() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cant delete element. Stack is empty");
        }
        return arr[top--];
    }

    public Optional<String> showTopElement() {
        Optional<String> optionalString = Optional.ofNullable(arr[top]);
            return Optional.ofNullable(arr[top]);
        }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }
}
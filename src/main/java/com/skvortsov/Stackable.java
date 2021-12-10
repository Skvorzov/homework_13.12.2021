package com.skvortsov;

public interface Stackable {
    void addElement(String element) throws Exception;

    String deleteElement() throws Exception;

    String showTopElement();

    boolean isEmpty();

    boolean isFull();
}
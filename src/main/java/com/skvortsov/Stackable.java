package com.skvortsov;

import java.util.Optional;

public interface Stackable {
    void addElement(String element) throws Exception;

    String deleteElement() throws Exception;

    Optional<String> showTopElement();

    boolean isEmpty();

    boolean isFull();
}
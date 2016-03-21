package com.github.kaczors.gof.structural.flyweight;

import java.util.ArrayList;
import java.util.Collection;

public class ElementFactory {

    Collection<Element> elements = new ArrayList<>();

    Element getElement(String name) {
        return elements.stream()
                .filter(e -> e.name.equals(name))
                .findAny()
                .orElse(newElement(name));
    }

    private Element newElement(String name){
        Element e = new Element(name);
        elements.add(e);
        return e;
    }
}

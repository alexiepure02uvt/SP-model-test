package com.company;

import java.util.ArrayList;
import java.util.List;

public class Order implements Element {
    private String name;
    private List<Element> elements;

    public Order(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void addElement(Element newElement) {
        this.elements.add(newElement);
    }

    @Override
    public void print() {
        System.out.println("Order: " + this.name);
        for (Element element :
                this.elements) {
            System.out.println();
            element.print();
        }
    }

    @Override
    public void accept(Visitor visitor) {
        for (Element element :
                this.elements) {
            element.accept(visitor);
        }
    }
}

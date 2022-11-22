package com.company;

import java.util.ArrayList;
import java.util.List;

public class Pizza implements Element {
    private String name;
    private double price;
    private List<String> attributes;
    private final int prepTime = 5;

    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
        this.attributes = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println("Pizza: " + this.name);
        System.out.println("Price: " + this.price);
        System.out.println("Attributes: ");
        for (String attr :
                this.attributes) {
            System.out.println("\t" + attr);
        }
    }

    public void addAttribute(String attribute) {
        this.attributes.add(attribute);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitPizza(this);
    }

    public double getPrice() {
        return price;
    }
}

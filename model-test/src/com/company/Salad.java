package com.company;

import java.util.ArrayList;
import java.util.List;

public class Salad implements Element {
    private String name;
    private double price;
    private List<String> attributes;
    private final int prepTime = 2;

    public Salad(String name, double price) {
        this.name = name;
        this.price = price;
        this.attributes = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println("Salad: " + this.name);
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
        visitor.visitSalad(this);
    }

    public double getPrice() {
        return price;
    }
}

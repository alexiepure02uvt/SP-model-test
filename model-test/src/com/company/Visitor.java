package com.company;

public interface Visitor {
    void visitPizza(Pizza pizza);

    void visitPasta(Pasta pasta);

    void visitSalad(Salad salad);
}

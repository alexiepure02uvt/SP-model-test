package com.company;

public interface Element {
     void print();

     void accept(Visitor visitor);
}

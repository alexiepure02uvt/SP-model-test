package com.company;

public class Main {

    public static void main(String[] args) {

        Order cart = new Order("Cart");

        Order mcDonalds = new Order("McDonalds");
        Order menuMcDonalds = new Order("Big Mac Menu");    // sub-comanda
        Order kfc = new Order("KFC");
        Order dominos = new Order("Dominos");

        Pizza salami = new Pizza("Salami", 10);
        Pizza diavola = new Pizza("Diavola", 15);
        Pasta carbonara = new Pasta("Carbonara", 17);
        Salad colesaw = new Salad("Colesaw", 8);
        Pizza bigMac = new Pizza("Big Mac", 12);

        salami.addAttribute("Ketchup");
        salami.addAttribute("Salt");

        diavola.addAttribute("Pepper");

        carbonara.addAttribute("Parmesan");

        colesaw.addAttribute("Yogurt");

        bigMac.addAttribute("Extra mayo");

        mcDonalds.addElement(salami);
        mcDonalds.addElement(salami);
        mcDonalds.addElement(diavola);

        menuMcDonalds.addElement(bigMac);
        mcDonalds.addElement(menuMcDonalds);

        kfc.addElement(diavola);
        kfc.addElement(carbonara);

        dominos.addElement(salami);
        dominos.addElement(colesaw);

        cart.addElement(mcDonalds);
        cart.addElement(kfc);
        cart.addElement(dominos);

        cart.print();

        System.out.println();

        PriceVisitor visitor = new PriceVisitor();
        cart.accept(visitor);
        visitor.individualDishPrices();
        System.out.println();
        visitor.totalDishesPrice();
    }
}

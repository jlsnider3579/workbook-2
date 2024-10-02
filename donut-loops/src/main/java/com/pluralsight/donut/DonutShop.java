package com.pluralsight.donut;

public class DonutShop {
    public static void main(String[] args) {

        Donut a = new Donut();
        a.description = "spongebob donut";
        a.calories= 600;
        a.price = 4.99;

        System.out.print(a.description);
        System.out.println(a.calories);

        Donut b = new Donut();
        b. description = "cosmos donut";
        b. calories = 450;
        b. price = 3.25;

        System.out.print(b.description);
        System.out.println(b.price);


    }
}

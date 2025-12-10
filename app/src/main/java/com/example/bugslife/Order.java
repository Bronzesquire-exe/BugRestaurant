package com.example.bugslife;

import java.util.ArrayList;

public  class Order {
public static final double tax = 0.02;
public ArrayList<OrderItem> item = new ArrayList<>();

public void addItem(String name, double price, double extra){
    item.add(new OrderItem(name,price,extra));
}
public ArrayList<OrderItem>getItem(){
    return item;
}
public double subTotal(){
    double subtotal = 0;
    for(OrderItem i : item){
        subtotal += i.getTotalPrice();
    }
    return subtotal;
}
public double getTax(){
    return subTotal() * tax;
}
public double getTotal(){
    return subTotal() + getTax();
}

public static class OrderItem{
    private String name;
    private double basePrice;
    private double extra;

    public OrderItem(String name, double basePrice, double extra){
        this.name = name;
        this.basePrice = basePrice;
        this.extra = extra;
    }
    public String getName(){
        return name;
    }
    public double getTotalPrice(){
        return basePrice + extra;
    }
}
}

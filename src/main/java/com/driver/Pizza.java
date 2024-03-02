package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean Takeawayf;
    private boolean Cheesef;
    private boolean Toppingsf;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        Takeawayf=true;
        Cheesef=true;
        Toppingsf=true;

        if(this.isVeg){
            price=300;
        }else{
            price=400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese() {
        // your code goes here
        if (!Cheesef) {
            Cheesef = true;
            price += 80;
            System.out.println("Extra Cheese Added: 80");
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!Toppingsf){
            Toppingsf=true;
            price+=70;
            System.out.println("Extra Toppings Added: 70");
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!Takeawayf){
            Takeawayf=true;
            price+=20;
            System.out.println("Paperbag Added: 20");
        }
    }

    public String getBill(){
        // your code goes here

        this.bill=String.valueOf(price);
        return this.bill;
    }
}

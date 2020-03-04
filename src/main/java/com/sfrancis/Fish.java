package com.sfrancis;

class Fish extends Animal {

    private String fishName;

    public static String getFishName(){
        return "Sk";
    }

    public void setfishName(String newValue){
        fishName= newValue;
    }

    public void getfishName(String newValue){
        fishName = newValue;
    }

    void move() {
        System.out.println("Moves by swimming.");
    }
    void eat() {
        System.out.println("Eats seafood.");
    }
}

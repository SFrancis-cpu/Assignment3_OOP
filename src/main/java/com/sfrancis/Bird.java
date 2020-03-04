package com.sfrancis;

class Bird extends Animal {

    private String birdName;

    public static String getBirdName(){
        return "Sk";
    }

    public void setBirdNameName(String newValue){
        birdName = newValue;
    }

    public void setBirdName(String newValue){
        birdName = newValue;
    }

    void move() {
        System.out.println("Moves by flying.");
    }
    void eat() {
        System.out.println("Eats birdfood.");
    }

}

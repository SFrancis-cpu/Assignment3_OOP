package com.sfrancis;

public class Interface {

    interface Animal {
        public void eat();
        public void sound();
    }

    interface Bird {
        int numberOfLegs = 2;
        String outerCovering = "feather";

        public void fly();
    }
}

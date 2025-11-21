package com.cc.java;

public class Cat {


    // this --> Instanzvariable
    public void tellYourAddress(){
        App.output("Blick von innen: " + this);
    }

    public Cat getInstanceVariable(){
        return this;
    }

    

}

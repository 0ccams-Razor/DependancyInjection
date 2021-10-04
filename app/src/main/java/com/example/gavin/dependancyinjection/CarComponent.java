package com.example.gavin.dependancyinjection;

import dagger.Component;

@Component
public interface CarComponent {

    Car getCar();

    //Necessary for field/method injection
    //Must be MainActivity not a super class like Activity
    void inject(MainActivity mainActivity);
}

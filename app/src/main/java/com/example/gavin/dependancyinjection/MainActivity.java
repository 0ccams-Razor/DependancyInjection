package com.example.gavin.dependancyinjection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    //Field/members injection
    //Field/memeber cannot be private or dagger cannot access it
    //Field/member cannot be final as we want to change its value
    @Inject Car car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Must build the project before you can call DaggerCarComponent or dagger won't have built it
        //All the dependancies the component needs must bt marked with @Inject
        CarComponent component = DaggerCarComponent.create();
        //Necessary for field/memeber injection
        component.inject(this);

        //Constructor injection
        //car = component.getCar();
        car.drive();
    }
}

package com.example.myfirstappjava;

import android.util.Log;

public class Cat {
    String name;
    int    age;
    String gender;
    String bleed;

    Cat(String name, int age, String gender, String bleed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.bleed = bleed;
    }

    void say(String message) {
        Log.d("Cat", this.name + "「" + message + "」");
    }
    void sleep() {
        say("Zzz");
    }
}

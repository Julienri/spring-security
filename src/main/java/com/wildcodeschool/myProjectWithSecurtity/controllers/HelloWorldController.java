package com.wildcodeschool.myProjectWithSecurtity.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController{

    @GetMapping("/")
    public String hello(){
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String avenger() {
        return "Avengers ... Assemble";
    }

    @GetMapping("/secret-bases")
    public List <String> campus(ArrayList<Integer> list){
        ArrayList<String> towns = new ArrayList<String>();
        towns.add(new String("Biarritz"));
        towns.add(new String("Bordeaux"));
        towns.add(new String("Lille"));
        towns.add(new String("Lyon"));
        towns.add(new String("Reims"));
        towns.add(new String("La Loupe"));
        towns.add(new String("Marseilles"));
        towns.add(new String("Nantes"));
        towns.add(new String("Strasbourg"));
        towns.add(new String("Toulouse"));
        towns.add(new String("Tours"));
        towns.add(new String("Paris"));
        towns.add(new String("Orléans"));
        return towns;
    }
}
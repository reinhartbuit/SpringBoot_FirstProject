package com.reinhartDemo.ReinhartApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    //inject properties from Application.status
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    //expose new end point for coachname and team name
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach Name: " + coachName + ", Team name: " + teamName;
    }
    //expose "/" returns "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

    // expose a new endpoing for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5k!";
    }

    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your lucy day!";
    }
}

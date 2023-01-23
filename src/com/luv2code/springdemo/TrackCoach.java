package com.luv2code.springdemo;

public class TrackCoach implements Coach {

    public TrackCoach(){

    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just do It: " + fortuneService.getFortune();
    }
}

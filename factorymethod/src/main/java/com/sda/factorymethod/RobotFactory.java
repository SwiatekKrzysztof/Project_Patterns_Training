package com.sda.factorymethod;

public class RobotFactory {
    public Robot makeRobot(String type){
        if(type.equals("DRILLING_ROBOT")){
            return new DrillingRobot();
        }
        if(type.equals("BAD_JOKES_ROBOT")){
            return new BadJokesRobot();
        }
        return null;
    }
}

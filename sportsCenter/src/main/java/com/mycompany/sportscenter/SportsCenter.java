
package com.mycompany.sportscenter;

import com.mycompany.sportscenter.scenario.Scenario;
import com.mycompany.sportscenter.sportCenter.sportCenter;

public class SportsCenter {

    public static void main(String[] args) {
        sportCenter sportCenter = new sportCenter("El campín","ASD","Bogotá","24 horas");
        
        Scenario scenario1= new Scenario(1800,TypeSport.SOCCER,"18:00 - 22:00");
        Scenario scenario2= new Scenario(400,TypeSport.VOLLEYBALL,"14:00 - 18:00");
        
        sportCenter.addScenario(scenario1);
        sportCenter.addScenario(scenario2);
    }
}

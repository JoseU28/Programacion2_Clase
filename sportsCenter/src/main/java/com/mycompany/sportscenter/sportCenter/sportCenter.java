
package com.mycompany.sportscenter.sportCenter;

import com.mycompany.sportscenter.scenario.Scenario;
import java.util.ArrayList;
import java.util.List;

public class sportCenter {
    private String name;
    private String ID;
    private String location;
    private String schedule;
    
    List<Scenario> scenaries = new ArrayList<>();

    public sportCenter(String name, String ID, String location, String schedule) {
        this.name = name;
        this.ID = ID;
        this.location = location;
        this.schedule = schedule;
    }
    
    public void addScenario(Scenario scenario) {
        this.scenaries.add(scenario);
    }
    
    public void bookScenario(Scenario scenario) {
        int index = this.scenaries.indexOf(scenario);
        Scenario sc = this.scenaries.get(index);
        
        if(sc.isAvailable()) {
            System.out.println("Ohh yeah!!");
            sc.setAvailable(false);
        }
        else {
            System.out.println("Sorry, yaper papá 🤔😭");
        }
    }
}

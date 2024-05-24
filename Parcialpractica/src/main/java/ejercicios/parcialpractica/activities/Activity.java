
package ejercicios.parcialpractica.activities;

import java.util.ArrayList;

public class Activity {
    private String activityname;
    private ArrayList<String> participants;
    private ArrayList<String> codes;

    public Activity(String activityname) {
        this.activityname = activityname;
    }    

    public Activity(String activityname, ArrayList<String> participants, ArrayList<String> codes) {
        this.activityname = activityname;
        this.participants = participants;
        this.codes = codes;
    }

    public String getActivityname() {
        return activityname;
    }

    public void setActivityname(String activityname) {
        this.activityname = activityname;
    }

    public ArrayList<String> getParticipants() {
        return participants;
    }

    public void setParticipants(ArrayList<String> participants) {
        this.participants = participants;
    }

    public ArrayList<String> getCodes() {
        return codes;
    }

    public void setCodes(ArrayList<String> codes) {
        this.codes = codes;
    }
    
    
}

package pao36_FitnessTracker;

import java.util.ArrayList;

class ActiveDay {

    double totalMinutes;
    double totalCalories;
    String totalActivities;
  
    int days;
    
    public String addActivities(String run, String bike, String swim, String ski) {
        if (run == null) {
            run = "";
        }  if (bike == null) {
            bike = "";
        } if (swim == null) {
            swim = "";
        } if (ski == null) {
            ski = "";
        }
        totalActivities = run + bike + swim + ski;
        return totalActivities;
        
    }
      
    public double totalMinutes(double run, double bike, double swim, double ski) {
        totalMinutes = run + bike + ski + swim;
        return totalMinutes;
    }

    public double totalCalories(double run, double bike, double swim, double ski) {

        totalCalories = run + bike + ski + swim;
        return totalCalories;
    }

    public String toString() {
        String spacers = "-----------------------------------";
        return spacers + "\n" + "Total Minutes: " + totalMinutes + "\nTotal Calories burned: " + totalCalories + "\n" + totalActivities;
    }

}

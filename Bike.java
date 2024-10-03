package pao36_FitnessTracker;

class Bike {
    String title = "Bike \n";
    double distance = 9;
    double calories = 100;
    double minutes = 70;
    String location = "Downtown Pittsburgh";
    String notes = "Notes: Biking with friends";
    
    
    public void setTitle(String title){
        this.title = title;
    }
    public void setLocation(String location){
        this.location= location;
    }
    
    public void setDistance(double distance){
        this.distance = distance;
    }
    public void setCalories(double calories){
        this.calories= calories;
    }
    public void setMinutes(double minutes){
        this.minutes = minutes;
    }
     public void setNotes(String notes){
        this.notes = notes;
    }
      public String getTitle(String title){
        return title = title;
    }
    public String getLocation(String location){
        return location = location;
    }
    public double  getDistance(double distance){
       return distance = distance;
    }
    public double getCalories(double calories){
        return calories = calories;
    }
    public double getMinutes(double minutes){
        return minutes = minutes;
    }
     public String getNotes(String notes){
       return notes = notes;
    }
     public String toString(){
     String spacers = "-----------------------------------";
      return title +notes+"\nCalories: "+calories+"\nDistance: "+distance+" miles\nMinutes: " +minutes+" min\nLocation: "+location+"\n"+spacers+"\n";
    }
}



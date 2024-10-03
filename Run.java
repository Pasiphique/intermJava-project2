package pao36_FitnessTracker;

class Run {
    String title = "\nRun";
    double distance = 20;
    double calories = 100;
    double minutes = 80;
    String location = "Park"; 
    String notes = "Notes: beat previus time";
    
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setDistance(double distance){
        this.distance = distance;
    }
    public void setCalories(double calories){
        this.calories= calories;
    }
    public void setMinutes(double minutes){
        this.minutes = minutes ;
    }
     public void setNotes(String notes){
        this.notes = notes;
    }
      public String getTitle(String title){
        return title = title;
    }
    
    public double getDistance(double distance){
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
      return spacers+title +"\n"+notes+"\nCalories: "+calories+"\nDistance: "+distance+" miles\nMinutes: " +minutes+" min\n"+spacers+"\n";
    }
    
}


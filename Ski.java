package pao36_FitnessTracker;

class Ski {
    String title = "Ski: ";
    double distance = 2;
    double calories = 190;
    double minutes = 80;
    String location = "Ski Resort";
    String notes  ="Have as much as I can";
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setDistance(double distance){
        this.distance = distance;
    }
    public void setCalroies(double calories){
        this.calories= calories;
    }
    public void setMinutes(double minutes){
        this.minutes = minutes;
    }
     public void setNotes(String notes){
        this.notes = notes;
    }
       public void setLocation(String location){
        this.location= location;
    }
      public String getTitle(String title){
        return title;
    }
    
    public double  getDistance(double distance){
       return distance;
    }
    public double getCalories(double calories){
        return calories;
    }
    public double getMinutes(double minutes){
        return minutes;
    }
     public String getNotes(String notes){
       return notes ;
    }
      public String getLocation(String location){
        return location;
    }
       public String toString(){
     String spacers = "-----------------------------------";
      
       return title +notes+"\nCalories: "+calories+"\nDistance: "+distance+" miles\nMinutes: " +minutes+" min\nLocation: "+location+"\n"+spacers+"\n";
    }
    
}


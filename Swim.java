package pao36_FitnessTracker;

class Swim {
    String title = "Swim: ";
    double calories = 200;
    double minutes = 90;
    String location = "highschool pool";
    String notes = "Have fun and enjoy";
    
    public void setTitle(String title){
        this.title = title;
    }
    public void setLocation(String location){
        this.location= location;
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
      public String getTitle(String title){
        return title;
    }
    public String getLocation(String location){
        return location ;
    }
   
    public double getCalories(double calories){
        return calories ;
    }
    public double getMinutes(double minutes){
        return minutes ;
    }
     public String getNotes(String notes){
       return notes ;
    }
      public String toString(){
     String spacers = "-----------------------------------";
      
      return title +notes+"\nCalories: "+calories+"\nMinutes: " +minutes+" min\nLocation: "+location+"\n"+spacers+"\n";
    }
    
}

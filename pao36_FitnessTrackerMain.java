package pao36_FitnessTracker;

public class pao36_FitnessTrackerMain {

    public static void main(String[] args) {
        String[] year = new String[365];
        Run run = new Run();
        Bike bike = new Bike();
        Ski ski = new Ski();
        Swim swim = new Swim();

        double skiTime = ski.minutes;
        double runTime = run.minutes;
        double bikeTime = bike.minutes;
        double swimTime = swim.minutes;

        double runCal = run.calories;
        double bikeCal = bike.calories;
        double skiCal = ski.calories;
        double swimCal = swim.calories;

        String runs = run.toString();

        String bikes = bike.toString();

        String Ski = ski.toString();

        String Swim = swim.toString();

        ActiveDay active = new ActiveDay();

        
        active.addActivities(runs, bikes, Swim, Ski = null);

        active.totalMinutes(runTime, bikeTime , swimTime, skiTime = 0);
        active.totalCalories(runCal, bikeCal , swimCal, skiCal = 0);

        year[0] = active.toString();
        
        active.addActivities(runs, runs, bikes, Ski = null);

        active.totalMinutes(runTime,runTime, bikeTime, skiTime = 0);
        active.totalCalories(runCal, runCal, bikeCal, skiCal = 0);

        year[1] = active.toString();

        active.addActivities(runs, bikes = null, Swim = null, Ski = null);

        active.totalMinutes(runTime, bikeTime = 0, swimTime = 0, skiTime = 0);
        active.totalCalories(runCal, bikeCal = 0, swimCal = 0, skiCal = 0);

        year[2] = active.toString();

       

        for (int i = 0; i < year.length; i++) {
            if (year[i] == null) {
                break;
            }

            int day = i + 1;
            System.out.println("Summary of day " + day);
            System.out.println(year[i]);

        }

    }
}

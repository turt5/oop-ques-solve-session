package fall_22.q4;

public class Fifa {
    private int noOfGoals;
    private String venue;

    public Fifa(){
        System.out.println("Who will be winner?");
    }

    public Fifa(int noOfGoals, String venue){
        this();
        this.noOfGoals=noOfGoals;
        this.venue=venue;
    }

    public String toString(){
        return "Fifa -> noOfGoals:"+noOfGoals+", venue: "+venue;
    }

    public int getNoOfGoals(){
        return this.noOfGoals;
    }
}

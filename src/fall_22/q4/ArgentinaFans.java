package fall_22.q4;

public class ArgentinaFans extends Fifa{
    private int havingWorldCups;

    public ArgentinaFans(int noOfGoals,String venue, int havingWorldCups){
        super(noOfGoals,venue);
        this.havingWorldCups=havingWorldCups;
        System.out.println("Argentina will win");
    }

    public String toString(){
        return "ArgentinaFans ->["+super.toString()+"], havingWorldCups: "+this.havingWorldCups;
    }

    public void incrementWorldCups(){
        havingWorldCups=havingWorldCups+1;
    }
}

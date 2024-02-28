package fall_22.q4;

public class BrazilFans extends Fifa{
    private int havingWorldCups;

    public BrazilFans(int noOfGoals,String venue, int havingWorldCups){
        super(noOfGoals,venue);
        this.havingWorldCups=havingWorldCups;
        System.out.println("Brazil will win");
    }

    public String toString(){
        return "BrazilFans ->["+super.toString()+"], havingWorldCups: "+this.havingWorldCups;
    }

    public void incrementWorldCups(){
        havingWorldCups=havingWorldCups+1;
    }

}

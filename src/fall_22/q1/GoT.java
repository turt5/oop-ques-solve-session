package fall_22.q1;

public class GoT {
    {
        System.out.println("Valar dohaeris");
    }

    public String name;
    public String house;
    public double impact;
    public float intent;

    public GoT(){
        System.out.println("Best TV series after Breaking Bad");
    }

    public GoT(String name, String house){
        this.name=name;
        this.house=house;
    }

    public GoT(double impact){
        this("Daenerys","Targaryen");
        this.impact=impact;
    }

    public GoT(float intent){
        this("Arya","Stark");
        this.intent=intent;
    }

    public void printFullName(){
        System.out.println(name+" "+house);
    }

    public void printDetails(){
        printFullName();

        System.out.println("Impact: "+impact);
        System.out.println("Intent: "+intent);
    }

    {
        System.out.println("Valar morghulis");
    }


    public static void main(String[] args) {
        GoT ob1=new GoT();

        ob1.name="John Snow";
        ob1.house="404";

        GoT ob2= new GoT(4.8);
        ob1.printDetails();
        ob2.printDetails();
    }
}

/*
Static
Empty block
Constructor
 */


/*
Valar dohaeris
Valar morghulis
Best TV series after Breaking Bad
Valar dohaeris
Valar morghulis
John Snow 404
Impact: 0.0
Intent: 0.0
Daenerys Targaryen
Impact: 4.8
Intent: 0.0
 */
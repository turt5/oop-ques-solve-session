class Logarithm{
    double b;
    double x;

    public Logarithm(double b, double x){
        this.b=b;
        this.x=x;
    }

    public  Logarithm(){

    }

    public double myFunc(){
        return  Math.log(x)/Math.log(b);
    }
}

public class Main {
    public static void main(String[] args) {
        Logarithm log1=new Logarithm(2,9);
        System.out.println(
                log1.b+"   "+log1.x+"    "+log1.myFunc()
        );
    }
}

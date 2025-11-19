class Agg{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    double add(double a , double b){
        return a+b;
    }
}

public class PolyRide{
    public static void main(String[] args){
        Agg a = new Agg();
        System.out.println(a.add(2,5));
        System.out.println(a.add(5,5,8));
        System.out.println(a.add(3.4,  4.6));

    }
}
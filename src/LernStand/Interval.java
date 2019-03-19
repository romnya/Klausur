package LernStand;

public class Interval {
    protected double a;
    protected double b;

    public void setA(double a){
        this.a =a;
    }
    public double getA(){
        return a;
    }
    public Interval(double a, double b){
        this.a = a;
        this.b = b;
    }
    public Interval(){}

    public boolean isEmpty(){
        return this.a>this.b;
    }
    public String toString(){
        if(this.a<=b){
            return "["+this.a+","+this.b+"]";
        }
        return "[]";
    }
    public boolean equals(Interval x){
        if(this.a ==x.a &&this.b==x.b){
            return true;
        }
        return false;
    }
    boolean contains(double i){
        if(i>=a&&i<=b&&!(this.isEmpty())){
            return true;
        }
        return false;
    }
    Interval intersection(Interval i){
        Interval z;
        if(this.isEmpty()||i.isEmpty()){
            return z = new Interval();
        }
        if(this.contains(i.a)){
            if(this.contains(i.b)){
                return i;
            }
            return z = new Interval(i.a,this.b);
        }
        else if(i.contains(b)){
            return this;
        }
        return z= new Interval(this.a,i.b);
    }

public static void main(String[] args) {
        Interval p = new Interval(5, 10);
        Interval q = new Interval(11, 13);
        System.out.println(p.intersection(q).toString());
    }
}

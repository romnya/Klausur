package DominoSpiel;

public class Dominostein {
    public int a;
    public int b;

    public Dominostein(int a, int b){
        if(a>=0&&a<=6&&b>=0&&b<=6){
            this.a = a;
            this.b = b;
        }
        else{
            throw new NumberFormatException();
        }
    }

    public void dreheUm(){
        int z = this.b;
        this.b = this.a;
        this.a = z;
    }
    public int[] getValues(){
        return new int[] {this.a,this.b};
    }
    public String toString(){
        return "["+this.a+","+this.b+"]";
    }
}

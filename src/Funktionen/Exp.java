package Funktionen;
import java.lang.Math;

public class Exp implements AbleitbareFunktion {

    public double getY(double x){
        return Math.exp(x);
    }

    public AbleitbareFunktion getAbleitung(){
        return new Exp();
    }
}

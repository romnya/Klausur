package DominoSpiel;

import java.util.ArrayList;

public class Dominokette {
    protected ArrayList<Dominostein> d;

    public Dominokette(Dominostein e){
        d = new ArrayList<>();
        d.add(e);
    }
    public String toString(){
        String txt="";
        for(Dominostein i : this.d){
            txt+=i.toString();
            txt+=" ";
        }
        return txt;
    }
    public void fuegeRechtsAn(Dominostein d){
        int r = this.d.get(this.d.size()-1).b;
        if(d.getValues()[0]==r){
            this.d.add(d);
        }
        else if (d.getValues()[1]==r){
            d.dreheUm();
            this.d.add(d);
        }
    else{
        throw new NumberFormatException();
        }
    }

}

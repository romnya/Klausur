package DominoSpiel;

public class Main {
    public static void main(String[] args){
      Dominostein a = new Dominostein(2,3);
      Dominostein b = new Dominostein(6,3);
      Dominostein c = new Dominostein(6,4);
      Dominokette d = new Dominokette(a);
      d.fuegeRechtsAn(b);
      d.fuegeRechtsAn(c);
      System.out.println(d.toString());
    }

}

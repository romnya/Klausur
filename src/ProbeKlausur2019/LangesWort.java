package ProbeKlausur2019;

public class LangesWort
{
    public static String longestWord(String x){
        String txt = x.toLowerCase();
        String[] speicher = txt.split(" ");
        String ergebnis = " ";
        for(String w: speicher){
            boolean test = true;
            for( int i =0; i<w.length();i++){
                if(w.indexOf(w.charAt(i),i+1)>0){
                    test = false;
                }
            }
            if(test){
            if(w.length()>ergebnis.length()){
                ergebnis = w;
            }
            }
        }

       return ergebnis;
    }

    public static void main (String [] arg){
        System.out.println(longestWord("Die Würdew des Menschen ist unantastbar"));
    }
}

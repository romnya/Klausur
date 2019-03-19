package ProbeKlausur2019;

public class Passwort {
    public static String getPasswort(String satz) {
       String[] speicher = satz.split(" ");
       String txt="";
       boolean wechsel=true;
       String z;
       for(String w:speicher){
           z="";
           if(wechsel){
               z=w.toUpperCase();
               wechsel=false;
           }
           else if(!wechsel){
               z=w.toLowerCase();
               wechsel = true;
           }
           txt+=z.charAt(z.length()-1);
       }
       return txt;
    }

    public static void main(String[] args){
        System.out.println(getPasswort("Wenn es regnet dann wird es nass"));
    }
}

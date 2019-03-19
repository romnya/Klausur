package LernStand;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class StringAufg {

    public static void main(String[] args) throws FileNotFoundException {
        //  Scanner sc = new Scanner(System.in);
       // System.out.println(newGermanOtrho("Auf dem Schauplatz, schauen die schaulustiger Schauspieler, das Schauspiel an"));
      //  int feld [] = getParameter();
        Scanner sc = new Scanner(new File("C:\\Users\\Romina Ehrentraut\\Desktop\\Schiff.txt"));
        String ausgabe="";
        while(sc.hasNext()){
            ausgabe+=sc.next();
        }
        System.out.println(ausgabe);
    }

    public static String newGermanOtrho(String s) {
        String txt = s;
        String speicher;
        while (txt.indexOf("sch") + txt.indexOf("Sch") > -1) {
            speicher = txt;

            if (txt.indexOf("sch") < txt.indexOf("Sch") && txt.indexOf("sch") > -1) {
                txt = txt.substring(0, txt.indexOf("sch") + 1) + speicher.substring(speicher.indexOf("sch") + 2);

            } else {
                txt = txt.substring(0, txt.indexOf("Sch") + 1) + speicher.substring(speicher.indexOf("Sch") + 2);


            }
        }

        return txt;
    }



    public static int[] getParameter(){
        System.out.println("Bitte geben Sie .....");
        Scanner zeile = new Scanner(System.in);
        String[] liste = zeile.next().split(",");
        int[] feld =  new int[liste.length];
        for(int i = 0; i< liste.length;i++){
            feld[i]= Integer.parseInt(liste[i]);
        }
       return feld;
    }

}

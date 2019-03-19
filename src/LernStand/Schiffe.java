package LernStand;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;


public class Schiffe {
    public static void main(String args[]){
        Scanner sc = null;
        try {
            sc = new Scanner( new File("C:\\\\Users\\\\Romina Ehrentraut\\\\Desktop\\\\Schiff.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String ausgabe = "";
        while(sc.hasNext()){
            ausgabe+=sc.next();
        }
        char [][] schiff = new char[10][10];
      //  String [] brett = ausgabe.split(",");
        int z =0;
        for(int i = 0; i<10;i++)
            for (int j = 0; j < 10; j++) {
                schiff[i][j] = ausgabe.charAt(z);
                z += 2;
            }
        int zaehler =0;
        while(zaehler<15){
            System.out.println("Koordinaten: ");
            Scanner scan = new Scanner(System.in);
           String punkt = scan.next();
           int x = (int) punkt.charAt(0)-48;
           int y = (int) punkt.charAt(1)-48;
            if(schiff[x][y]=='A'){
                schiff[x][y]='X';
                zaehler+=1;
                for(int i = -1;i<2;i++){
                    if(schiff[x+i][y]=='A'){
                        schiff[x][y]='x';
                    }
                    if(schiff[x][y+i]=='A'){
                        schiff[x][y]='x';
                    }
                }
            }
            else{
                schiff[x][y]='-';
            }
            for(int i = 0; i<10;i++) {
                for (int j = 0; j < 10; j++) {
                    if (schiff[i][j] == 'A') {
                        System.out.print("* ");
                    } else {
                        System.out.print(schiff[i][j] + " ");
                    }
                }
                    System.out.println("");
            }
        }
    }
}

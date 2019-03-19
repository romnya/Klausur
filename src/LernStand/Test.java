package LernStand;

import java.util.Arrays;

public class Test {

    public static int zaehlerVorkommen( String s, String part){
        String[] liste  = s.split(part);

        return liste.length-1;
    }

    public static boolean isABMatrix(int[][] arr, int a, int b){
        if(!(arr.length == arr[arr.length-1].length)){
            throw new ArithmeticException();
        }
        for(int i = 0; i<arr.length;i++){
            for( int j = 0; j< arr.length; j++){
                if(!(i==j&&arr[i][j]==a)){
                    return false;
                }
                if(!(!(i==j)&&arr[i][j]==b)){
                    return false;
                }
            }


        }
        return true;
    }

    public static boolean isPerfectNumber(int n){
        int z = 0;
        for(int i = 1;i<=n;i++){
            if(n%i ==0){
                z+=i;
            }
        }
        return z==n;
    }

    public static void main(String[] args){
        if(isPerfectNumber(28)){
            System.out.println("check");
        }
        int[][] ar = {{0,2,2},
                {2,0,2},{2,2,0}};
        if(isABMatrix(ar,0,2)){
            System.out.println("check Matrix)");
        }
        System.out.println("Zähler: "+zaehlerVorkommen("Eswareinmal einwar es mal warwarund","war"));
    }



}

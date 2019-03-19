package ProbeKlausur2019;

public class Rekursiv {
    public static int addieren(int a, int b){
        if(a<=0){
            return 1;
        }
        return b+addieren(a-1,1);
    }
    public static void main(String[] args){
       /* int w = 17;
        if(isPrim(w))
        System.out.println("True");
        else
            System.out.println("False");*/
       System.out.println(teiler(3780,3528));
    }

    public static int multi(int a,int b){
        if(a<=0){
            return 0;
        }
        return b+multi(a-1,b);
    }
    public static boolean isPali(String z){
        String w = z.toLowerCase();
        if(w.length()<=1){
            return true;
        }
        return w.charAt(0)==w.charAt(w.length()-1)&&isPali(w.substring(1,w.length()-1));
    }

    public static boolean isPrim(int p){
        return isPrimi(p,p-1);
    }
    public static boolean isPrimi(int p,int z){
        if(z<=1){
            return true;
        }
        return p%z!=0&&isPrimi(p,z-1);
    }

    public static int teiler(int a, int b){
        if(a<b){
            return teiler(a,b-a);
        }
        else if(a>b){
            return teiler(a-b,b);
        }
        return a;
    }

}

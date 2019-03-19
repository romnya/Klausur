package AufsteigendeListe;

public class Main {
    public static void main(String[] args){
        Aufsteigend d = new Aufsteigend();
        Aufsteigend b = new Aufsteigend();
        d.addZa(2);
        d.addZa(200);
        d.addZa(150);
        d.addZa(50);
        d.addZa(25);
        d.addZa(80);
        for(int c=0;c<d.folge.size(); c++){
            System.out.print(d.folge.get(c)+" ");
        }
        System.out.println("");

        for(int c=0;c<d.folge.size(); c++){
            b.addZa(c+26);
        }
        d.vereinige(b);
        for(int c=0;c<d.folge.size(); c++){
            System.out.print(d.folge.get(c)+
            " ");
        }

    }
}

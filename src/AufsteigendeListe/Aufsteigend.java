package AufsteigendeListe;

import java.util.ArrayList;


    public class Aufsteigend{
        ArrayList<Double> folge;

        public Aufsteigend(){
            folge = new ArrayList<>();
        }

        public boolean istDa(double z){

                if(folge.indexOf(z)<0){
                    return false;

            }
            return true;
        }

        public void addZa(double z){
            if(this.folge.isEmpty()){
                folge.add(z);
                return;
            }
            else if (istDa(z)){
                throw new ArithmeticException();
            }
            for(double c:folge){
                if(c>z){
                    folge.add(folge.indexOf(c),z);
                    return;
                }
            }
            folge.add(z);
        }
        public void deleteZ(double z){
            if(!istDa(z)){
                throw new ArithmeticException();
            }
            folge.remove(z);
        }

        public void vereinige(Aufsteigend f){
            for(double c:f.folge){
                this.addZa(c);
            }
        }
    }
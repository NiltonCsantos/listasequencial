package org.example.listasequencial;

import java.util.Comparator;

public class Lista {

    private int[] elementos;

    private int capacidade;

    public Lista(int capacidade) {

        this.elementos= new int[capacidade];
    }

    public int[] getElementos() {
        return elementos;
    }

    public void setElementos(int[] elementos) {
        this.elementos = elementos;
    }


    public void adiconar(int elemento) {

        for(int i=0; i<=this.elementos.length; i++){

            if(this.elementos[i]==0) {
                this.elementos[i]=elemento;
                break;
            }

        }

    }
    public void adiconarInicio(int elemento) {

        int aux=0;

        for (int i = 0; i <this.elementos.length ; i++) {

            if (this.elementos[i]!=0){
                aux++;
            }

        }

        if (aux==this.elementos.length){

            int vetorAuxiliar[]= this.elementos;

            this.elementos= new int[aux+1];

            for (int i = 0; i <vetorAuxiliar.length ; i++) {

                this.elementos[i]=vetorAuxiliar[i];

            }




                    elementos[elementos.length-1]=elemento;
                    aux=elementos[0];
                    elementos[0]=elementos[elementos.length-1];
                    elementos[elementos.length-1]=aux;



        }













    }
    public  void adiconarFinal(int elemento){

        int aux=0;

        for (int i = 0; i < elementos.length; i++) {

            if (elementos[i]!=0){
                aux++;
            }

        }

        System.out.println("Aux"+ aux);
        System.out.println("leng"+ this.elementos.length);

        if (aux==this.elementos.length){
            int vetorAuxiliar[]= this.elementos;
            this.elementos= new int[aux+1];

            for (int i = 0; i <vetorAuxiliar.length ; i++) {

                this.elementos[i]=vetorAuxiliar[i];

            }


            this.elementos[this.elementos.length-1]=elemento;
        }

    }

    public void excluirElemento(int indice) {

        this.elementos[indice] = 0;
        int aux= elementos[elementos.length-1];
        this.elementos[elementos.length-1]=elementos[indice];
        this.elementos[indice]=aux;

        int vetorAuxiliar[]= new int[elementos.length-1];

        for (int i = 0; i <vetorAuxiliar.length ; i++) {

            vetorAuxiliar[i]=elementos[i];

        }

        elementos=vetorAuxiliar;

    }

    public  int pesquisarElemento(int elemento){

        int resultado=0;

        for (int i = 0; i < elementos.length; i++) {

            if (elemento == elementos[i]) {
                resultado= elemento;
                break;
            }

        }

        return resultado;

    }



}

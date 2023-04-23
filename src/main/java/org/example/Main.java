package org.example;


import org.example.listasequencial.Lista;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Lista lista= new Lista(5);


        lista.adiconar(1);
        lista.adiconar(8);
        lista.adiconar(12);
        lista.adiconar(5);
        lista.adiconar(9);

//        vetor.adiconarInicio(5);
//
//       vetor.adiconarFinal(3);
//       vetor.adiconarFinal(23);
//        vetor.adiconarInicio(18);
//        vetor.excluirElemento(3);

        int resultado= lista.pesquisarElemento(9);

        System.out.println(resultado);

        System.out.println(Arrays.toString(lista.getElementos()));

        var b=resultado == 0 ? "não encontrado" : "encontrado: "+ resultado;

        System.out.println(b);
    }

}
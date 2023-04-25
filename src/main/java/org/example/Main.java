package org.example;


import org.example.listasequencial.Menu;
import org.example.listasequencial.Ordenacao;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Menu menu= new Menu();
        Scanner leia= new Scanner(System.in);

        boolean condicao=true;



        System.out.println("Digite a capacidade inicial do vetor");
        int tamanhoInicial= leia.nextInt();
        Ordenacao ordenacao= new Ordenacao(tamanhoInicial);

        while (condicao){



            menu.apresentar();

            int opcao= leia.nextInt();

            System.out.println(opcao);

            switch (opcao){

                case 1 -> {

                    System.out.println("vetor: ");
                    System.out.println(Arrays.toString(ordenacao.getElementos()));
                    System.out.println("digite o valor");
                    int valor= leia.nextInt();
                    ordenacao.adiconar(valor);


                    System.out.println("vetor atualizado: ");
                    System.out.println(Arrays.toString(ordenacao.getElementos()));

                }

                case 2 -> {
                    System.out.println("vetor: ");
                    System.out.println(Arrays.toString(ordenacao.getElementos()));

                    System.out.println("digite o valor");
                    int valor= leia.nextInt();
                    ordenacao.adiconarInicio(valor);

                    System.out.println("vetor atualizado: ");
                    System.out.println(Arrays.toString(ordenacao.getElementos()));

                }

                case 3 -> {

                    System.out.println("vetor: ");
                    System.out.println(Arrays.toString(ordenacao.getElementos()));
                    System.out.println("digite o valor");
                    int valor= leia.nextInt();
                    ordenacao.adiconarFinal(valor);

                    System.out.println("vetor atualizado: ");
                    System.out.println(Arrays.toString(ordenacao.getElementos()));

                }

                case 4 -> {

                    System.out.println("vetor: ");
                    System.out.println(Arrays.toString(ordenacao.getElementos()));
                    System.out.println("digite o indice");
                    int indice= leia.nextInt();
                    ordenacao.excluirElemento(indice);

                    System.out.println("vetor atualizado: ");
                    System.out.println(Arrays.toString(ordenacao.getElementos()));

                }

                case 5 -> {

                    System.out.println("vetor: ");
                    System.out.println(Arrays.toString(ordenacao.getElementos()));
                    System.out.println("digite o dado desejado");
                    int valor= leia.nextInt();
                    var resultado=ordenacao.pesquisarElemento(valor);

                    System.out.println(resultado );

                }

                default -> {

                    System.out.println("resultado final: ");
                    System.out.println(Arrays.toString(ordenacao.getElementos()));
                    condicao=false;

                }
            }

        }
}}
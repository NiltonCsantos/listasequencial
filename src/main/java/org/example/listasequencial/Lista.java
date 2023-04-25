package org.example.listasequencial;


public abstract class Lista<T>   {

    private T[] elementos;

    private int indice;

    public int getIndice() {
        return indice;
    }


    public void setIndice(int indice) {
        this.indice = indice;
    }

    public Lista(int capacidade){
        this.elementos= (T[]) new Object[capacidade];
    }

    public T[] getElementos() {
        return elementos;
    }

    public void setElementos(T elemento) {
        this.elementos[indice] = elemento;
    }

    public  void  atualizarElementos(T novoElementos[]){
        this.elementos=novoElementos;
    }


   public abstract void inicializar(int ai, int an);

   public abstract void adiconar(T elemento);

   public abstract void adiconarInicio(T elemento);

   public abstract void adiconarFinal(T elemento);

    public abstract void excluirElemento(int indice);

    public  abstract T pesquisarElemento(T elemento);

}

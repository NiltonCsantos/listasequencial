package org.example.listasequencial;


public class Ordenacao<T> extends Lista<T> {

    @Override
    public int getIndice() {

        return super.getIndice();
    }



    @Override
    public void setIndice(int indice) {
        super.setIndice(indice);
    }

    public Ordenacao(int capacidade) {
        super(capacidade);
    }

    @Override
    public T[] getElementos() {
        return super.getElementos();
    }

    @Override
    public void setElementos(T elemento) {
        super.setElementos(elemento);

    }

    @Override
    public void inicializar(int ai, int an) {

    }

    @Override
    public void adiconar(T elemento) {

        T vetorAuxiliar[]=getElementos();

        for (int i = 0; i <vetorAuxiliar.length ; i++) {

            if (vetorAuxiliar[i]==null){
                setIndice(i);
                setElementos(elemento);
                break;
            }

        }




    }

    @Override
    public void atualizarElementos(T[] novoElementos) {
        super.atualizarElementos(novoElementos);
    }

    @Override
    public void adiconarInicio(T elemento) {

        int aux=0;

        T dadoAuxiliar;


        for (int i = 0; i < getElementos().length; i++) {

            if (getElementos()[i]!= null){
                aux++;
            }

        }

        if (aux==this.getElementos().length){

            T vetorAuxiliar[]= this.getElementos();

           this.atualizarElementos( (T[]) new Object[aux+1]);


            for (int i = 0; i < vetorAuxiliar.length; i++) {

                setIndice(i);
                setElementos(vetorAuxiliar[i]);


            }

            setIndice(getElementos().length-1);

            setElementos(elemento);

            dadoAuxiliar=getElementos()[0];

            setIndice(0);
            setElementos(getElementos()[getElementos().length-1]);

            setIndice(getElementos().length-1);

            setElementos(dadoAuxiliar);

            setIndice(0);

        }else{
            setIndice(0);
            dadoAuxiliar=this.getElementos()[0];
            setElementos(elemento);

            for (int i = 0; i <getElementos().length; i++) {
                if (getElementos()[i]==null){
                    setIndice(i);
                    setElementos(dadoAuxiliar);
                    break;
                }
            }

            setIndice(0);

        }


    }

    @Override
    public void adiconarFinal(T elemento) {

        T vetorAuxiliar[]=getElementos();
        T aux=vetorAuxiliar[0];

        int count=0;

        for (int i = 0; i < vetorAuxiliar.length; i++) {

            if (vetorAuxiliar[i]!=null){
                 aux= vetorAuxiliar[i];
                count++;
            }

        }

        if (count< vetorAuxiliar.length){
            vetorAuxiliar[vetorAuxiliar.length-1]=elemento;
            setIndice(vetorAuxiliar.length-1);
            setElementos(elemento);
        }else{
            atualizarElementos((T[]) new Object[count+1]);

            for (int i = 0; i < vetorAuxiliar.length; i++) {

                setIndice(i);
                setElementos(vetorAuxiliar[i]);

            }

            setIndice(getElementos().length-1);
            setElementos(elemento);
            setIndice(0);

        }



    }

    @Override
    public void excluirElemento(int indice) {

        int count=0;
        T vetorAuxiliar[]= getElementos();

        vetorAuxiliar[indice]=null;


        atualizarElementos((T[]) new Object[vetorAuxiliar.length-1]);


        for (int i = 0; i <vetorAuxiliar.length; i++) {

            if (vetorAuxiliar[i]!=null){
                setIndice(count);
                setElementos(vetorAuxiliar[i]);
                count++;
            }


        }


    }

    @Override
    public T pesquisarElemento(T elemento) {

        T vetorAuxiliar[]= getElementos();

        for (int i = 0; i < vetorAuxiliar.length; i++) {

            if (vetorAuxiliar[i]==elemento){
                return elemento;
            }

        }

        return null;


    }
}

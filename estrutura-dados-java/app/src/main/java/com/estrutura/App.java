package com.estrutura;

import com.estrutura.filas.Fila;
import com.estrutura.pilha.No;
import com.estrutura.pilha.Pilha;

public class App 
{
    public static void main( String[] args )
    {
        /*Pilha minhaPilha = new Pilha();
        
        minhaPilha.push(new No(1));
        minhaPilha.push(new No(2));
        minhaPilha.push(new No(3));
        minhaPilha.push(new No(4));
        minhaPilha.push(new No(5));
        minhaPilha.push(new No(6));

        System.out.println(minhaPilha);
        System.out.println(minhaPilha.pop());
        System.out.println(minhaPilha);*/

        System.out.println("---------- Fila -----------");

        Fila minhaFila = new Fila();
        
        minhaFila.enqueue(new com.estrutura.filas.No("primeiro"));
        minhaFila.enqueue(new com.estrutura.filas.No("segundo"));
        minhaFila.enqueue(new com.estrutura.filas.No("terceiro"));
        minhaFila.enqueue(new com.estrutura.filas.No("quarto"));

        System.out.println(minhaFila);
        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila);
        minhaFila.enqueue(new com.estrutura.filas.No("ultimo"));
        System.out.println(minhaFila);
        System.out.println(minhaFila.first());
        System.out.println(minhaFila);
    }
}

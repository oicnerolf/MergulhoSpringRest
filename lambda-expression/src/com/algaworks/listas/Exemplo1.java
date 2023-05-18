package com.algaworks.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Exemplo1 {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("José");
        nomes.add("Maria");
        nomes.add("João");

        //percorrendo a lista com for, para imprimir os nomes de acordo com o índice
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        //for aprimorado, sem índice
        for (String nome : nomes) {
            System.out.println("Nome - " + nome);
        }

        //forEach recebendo um Consumer
        nomes.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //aqui estou usando lambda expression
        nomes.forEach(nome -> System.out.println(nome));

        //aqui utilizando method reference
        nomes.forEach(System.out::println);
    }
}

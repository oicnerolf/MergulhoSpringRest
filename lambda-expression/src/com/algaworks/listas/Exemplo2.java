package com.algaworks.listas;

import java.util.ArrayList;
import java.util.List;
//Classe para o segundo exemplo utilizando o Objeto Cliente
public class Exemplo2 {

	public static void main(String[] args) {
		List<Cliente> clientes = new ArrayList<>();
		
		clientes.add(new Cliente(1L, "José"));
		clientes.add(new Cliente(2L, "Maria"));
		clientes.add(new Cliente(3L, "João"));

		//%d referencia ao cliente.getId(), %s referencia ao getNome e %n quebra de linha
		clientes.forEach(cliente -> System.out.printf("ID: %d, Nome: %s%n", 
				cliente.getId(), cliente.getNome()));
	}
	
}

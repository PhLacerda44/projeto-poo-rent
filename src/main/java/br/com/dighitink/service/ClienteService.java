package br.com.dighitink.service;

import java.util.Scanner;

import br.com.dighitink.modelo.Cliente;

public class ClienteService {

     Scanner scanner = new Scanner(System.in);

    public Cliente geraCliente(){
        
        //Informações do cliente
        System.out.print("Digite o nome do cliente:  ");
        String nomeCliente = scanner.nextLine();
        
        System.out.print("\nDigite a idade do Cliente:  ");
        Integer idadeCliente = scanner.nextInt();
        scanner.nextLine();

        //Se o cliente for menor de 18 não será possível continuar o processo
        if (idadeCliente < 18) {
            System.out.println("-----------------------------------------");
            System.out.println("Não é possível Concluir o cadastro!.");
            System.out.println("-----------------------------------------");
            System.out.println("Menor de 18 anos!");
            System.out.println("Pressione Enter para continuar");
            scanner.nextLine();
            return null;
        }

        System.out.print("\nDocumento Cliente:  ");
        String documentoCliente = scanner.nextLine();
        
        Cliente clienteInput = new Cliente();
        clienteInput.setNome(nomeCliente); 
        clienteInput.setIdade(idadeCliente); 
        clienteInput.setDocumento(documentoCliente);
        
        return clienteInput;

    }
    
}

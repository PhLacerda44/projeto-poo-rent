package br.com.dighitink.service;

import java.util.Scanner;

import br.com.dighitink.modelo.Cliente;
import br.com.dighitink.util.Utilitarios;

public class ClienteService {

    Scanner scanner = new Scanner(System.in);

    //** Método que gera meu cliente, verifica se é maior de 18 anos, e faz a verificção de erro */
    public Cliente geraCliente() {

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        
        Integer idadeCliente = Utilitarios.validaNumeroInteiro(scanner, "Informa idade do Cliente: ");

        if (idadeCliente < 18) {
            System.out.println("-----------------------------------------");
            System.out.println("Cadastro não permitido!");
            System.out.println("O cliente deve ser maior de 18 anos.");
            System.out.println("-----------------------------------------");
            System.out.println("Pressione Enter para voltar ao menu principal");
            scanner.nextLine();
            return null;
        }

        System.out.print("\nDocumento Cliente: ");
        String documentoCliente = scanner.nextLine();

        Cliente clienteInput = new Cliente();
        clienteInput.setNome(nomeCliente);
        clienteInput.setIdade(idadeCliente);
        clienteInput.setDocumento(documentoCliente);

        return clienteInput; 
    }
}

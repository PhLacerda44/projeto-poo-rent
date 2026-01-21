package br.com.dighitink;

import java.io.IOException;
import java.util.Scanner;

import br.com.dighitink.modelo.Cliente;
import br.com.dighitink.modelo.Veiculo;

public class RentCar {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Veiculo veiculo = new Veiculo();

        while (true) {

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("##################");
            System.out.println( "    RentCar");
            System.out.println("##################");

            System.out.println("1 - Cadastrar clientes: ");
            System.out.println("2 - Visualizar Clientes: ");
            System.out.println("3 - Cadastras Veículo: ");
            System.out.println("4 - Visualizar Veículo: ");
            System.out.println("5 - Sair do Sistema: ");

            System.out.print("Selecione uma opção: ");
            int marcar = scanner.nextInt();
            scanner.nextLine();

            switch (marcar) {

                case 1:
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                    System.out.println("Digite o nome do cliente:");
                    String nomeCliente = scanner.nextLine();

                    System.out.println("Digite a idade do Cliente:");
                    Integer idadeCliente = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Documento Cliente:");
                    String documentoCliente = scanner.nextLine();

                    cliente.nome = nomeCliente;
                    cliente.idade = idadeCliente;
                    cliente.documento = documentoCliente;                    
                    System.out.println("Cadastro realizado com sucesso");
                    System.out.println("Enter para continuar");
                    


                    scanner.nextLine();

                    break;

                case 2:
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                    System.out.println("##################");
                    System.out.println("Visualizar Clientes");
                    System.out.println("##################");

                    System.out.println("nome Cliente: " + cliente.nome);
                    System.out.println("Idade do Cliente: " + cliente.idade);
                    System.out.println("Documento do Cliente: "+ cliente.documento);
                    scanner.nextLine();

                    break;

                case 3:
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                    System.out.println("Digite o nome do Veículo:");
                    String nomeVeiculo = scanner.nextLine();

                    System.out.println("Digite a marca do Veículo");
                    String marcaVeiculo = scanner.nextLine();

                    System.out.println("Digite o ano do Veículo ");
                    Integer anoVeiculo = scanner.nextInt();
                    scanner.nextLine();

                    veiculo.modelo = nomeVeiculo;
                    veiculo.marca = marcaVeiculo;
                    veiculo.ano = anoVeiculo;
                    System.out.println("Cadastro realizao com sucesso");
                    System.out.println("Enter para continuar");

                    scanner.nextLine();

                    break;

                case 4:
                     new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                     System.out.println("###################");
                     System.out.println("Visualizar Veículos");
                     System.out.println("###################");

                     System.out.println("Nome do Modelo: " + veiculo.modelo);
                     System.out.println("Marca do Veículo: " + veiculo.marca);
                     System.out.println("Ano do Veículo: " + veiculo.ano);
                     scanner.nextLine();


                default:
                    System.out.println("enter para continuar");

            }
        }
    }

}

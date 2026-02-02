package br.com.dighitink;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import br.com.dighitink.modelo.Aluguel;
import br.com.dighitink.modelo.Cliente;
import br.com.dighitink.modelo.Veiculo;
import br.com.dighitink.service.ClienteService;
import br.com.dighitink.service.VeiculoService;
import br.com.dighitink.util.Utilitarios;

public class RentCar {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Cliente> clientesList = new ArrayList<>();
        ArrayList<Veiculo> veiculoList = new ArrayList<>();
        ArrayList<Aluguel> alugueisList = new ArrayList<>();
        ClienteService clienteService = new ClienteService();
        VeiculoService veiculoService = new VeiculoService();

        while (true) {
            
            Utilitarios.limparTela();


            System.out.println("##################");
            System.out.println( "    RentCar");
            System.out.println("##################");

            System.out.println("1 - Cadastrar clientes: ");
            System.out.println("2 - Visualizar Clientes: ");
            System.out.println("3 - Cadastrar Veículo: ");
            System.out.println("4 - Visualizar Veículo: ");
            System.out.println("5 - Aluguel de Veículos");
            System.out.println("6 - Visualizar Aluguéis: ");
            System.out.println("7 - Sair do Sistema: ");

            System.out.print("Selecione uma opção: ");
            int marcar = scanner.nextInt();
            scanner.nextLine();

            switch (marcar) {

                case 1:
                    Utilitarios.limparTela();
                    
                    Cliente clienteInput = clienteService.geraCliente();
                    if(clienteInput==null) break;

                    clientesList.add(clienteInput);

                    System.out.println("Cadastro realizado com sucesso!");
                    System.out.println("Pressione enter para continuar...");
                    scanner.nextLine();

                    break;

                case 2:
                    Utilitarios.limparTela();
                    
                    System.out.println("-----------------------------------------");
                    System.out.println("         Clientes Cadastrados");
                    System.out.println("-----------------------------------------");
                    
                     System.out.println(clientesList.size());

                     
                    System.out.println("-----------------------------------------");
                    System.out.println("Cliente\t\tidade\t\tDocumento");
                    System.out.println("-----------------------------------------");


                    for(Cliente cliente:clientesList){
                        System.out.println(
                         cliente.nome + "\t\t" +
                         cliente.idade + "\t\t" +
                         cliente.documento
                        );
                    }
                    scanner.nextLine();
                    

                    break;

                case 3:
                    Utilitarios.limparTela();

                    Veiculo veiculoinput = veiculoService.geraVeiculo();
                    
                    veiculoList.add(veiculoinput);

                    System.out.println("Pressione Enter para continuar!");
                    scanner.nextLine();

                    break;

                case 4:
                     Utilitarios.limparTela();

                     System.out.println("----------------------------------------");
                     System.out.println("          Veículos Cadastrados");
                     System.out.println("----------------------------------------");

                       System.out.println(veiculoList.size());


                     
                    System.out.println("-----------------------------------------");
                    System.out.println("Modelo\t\tMarca\t\tAno");
                    System.out.println("-----------------------------------------");

     

                    for(Veiculo veiculo:veiculoList){
                        System.out.println(
                        veiculo.modelo + "\t\t" +
                        veiculo.marca + "\t\t" +
                        veiculo.ano
                        );
                    }
                   
                    scanner.nextLine();
                    break;

                case 5:
                    Utilitarios.limparTela();

                    System.out.println("##################");
                    System.out.println("     Locação     ");
                    System.out.println("##################");

                    System.out.println("-----------------------------------------");
                    System.out.println("Código \t Nome");
                    System.out.println("-----------------------------------------");

                    int posicaoCliente = 0;
                    for(Cliente cliente:clientesList){
                        System.out.println(posicaoCliente+" \t "+cliente.nome);
                        posicaoCliente++;
                    }

                    System.out.println("\tInforme o código do cliente:");
                    int codigoCliente = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("\tCliente selecionado:");
                    Cliente clienteSelecionado = clientesList.get(codigoCliente);
                    System.out.println(clienteSelecionado.nome);

                    
                    System.out.println("------------------------------------------");
                    System.out.println("Código \t Veículo");
                    System.out.println("------------------------------------------");

                    int posicaoVeiculo = 0;
                    for(Veiculo veiculo:veiculoList){
                        System.out.println(posicaoVeiculo+ "\t" +veiculo.modelo);
                        posicaoVeiculo++;
                    }

                    System.out.println("Informe o código do veículo:");
                    int codigoVeiculo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Informe a quantidade de dias de aluguel:");
                    int quantidadeDias = scanner.nextInt();
                    scanner.nextLine();

                    System.err.println("Veículo selecionado");
                    Veiculo veiculoSelecionado = veiculoList.get(codigoVeiculo);
                    System.out.println(veiculoSelecionado.modelo);


                    Aluguel aluguel = new Aluguel();
                    aluguel.cliente = clienteSelecionado;
                    aluguel.veiculo = veiculoSelecionado;
                    aluguel.quantidadeDias = quantidadeDias;
                    alugueisList.add(aluguel);

                    System.out.println("-----------------------------------------");

                    aluguel.mostrarDadosAluguel();

                    scanner.nextLine();
                    
                break;

                case 6:
                    Utilitarios.limparTela();

                    System.out.println("-----------------------------------------------------------");
                    System.out.println("                       Aluguéis");
                    System.out.println("------------------------------------------------------------");

                    System.out.println("Cliente\t\tVeículo\t\t\tDias\t\tValor");
                    System.out.println("------------------------------------------------------------");

                    for (Aluguel aluguelRealizado : alugueisList) {
                        System.out.println(
                        aluguelRealizado.cliente.nome + "\t\t" +
                        aluguelRealizado.veiculo.modelo + "\t\t\t" +
                        aluguelRealizado.quantidadeDias + "\t\t" +
                        aluguelRealizado.totalapagar() 
                    );
                    scanner.nextLine();
                }
                    break;

                case 7:
                    Utilitarios.limparTela();
                    System.out.println("Aperte Enter para sair do Sistema.");
                    scanner.nextLine();
                    scanner.close();
                    break;

                    
                default:
                    
                    System.out.println("Pressione enter para continuar");
                    scanner.nextLine();
                        
            }

        }
    }

}

package br.com.dighitink;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import br.com.dighitink.modelo.Aluguel;
import br.com.dighitink.modelo.Cliente;
import br.com.dighitink.modelo.Veiculo;
import br.com.dighitink.service.AluguelService;
import br.com.dighitink.service.ClienteService;
import br.com.dighitink.service.VeiculoService;
import br.com.dighitink.util.Utilitarios;

public class RentCar {


/** Todo meu código MAIN, contendo métodos para melhor organização */
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Cliente> clientesList = new ArrayList<>();
        ArrayList<Veiculo> veiculoList = new ArrayList<>();
        ArrayList<Aluguel> alugueisList = new ArrayList<>();
        ClienteService clienteService = new ClienteService();
        VeiculoService veiculoService = new VeiculoService();
        AluguelService aluguelService = new AluguelService();

        while (true) {
            
            Utilitarios.limparTela();

            //Menu Rent Car (Cadastro, Aluguel, Saída do sistema)
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

                    System.out.println("\nCadastro realizado com sucesso!");
                    System.out.println("Pressione enter para continuar...");
                    scanner.nextLine();

                    break;


                case 2:
                    Utilitarios.limparTela();
                    
                    System.out.println("-----------------------------------------");
                    System.out.println("         Clientes Cadastrados: " + clientesList.size());
                    System.out.println("-----------------------------------------");
                    System.out.println("Cliente\t\tidade\t\tDocumento");
                    System.out.println("-----------------------------------------");

                    for(Cliente cliente:clientesList){
                        System.out.println(
                         cliente.getNome() + "\t\t" +
                         cliente.getIdade() + "\t\t" +
                         cliente.getDocumento()
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
                    System.out.println("          Veículos Cadastrados: " + veiculoList.size());
                    System.out.println("----------------------------------------");
                    System.out.println("Modelo\t\tMarca\t\tAno");
                    System.out.println("-----------------------------------------");

                    for(Veiculo veiculo:veiculoList){
                        System.out.println(
                        veiculo.getModelo() + "\t\t" +
                        veiculo.getMarca() + "\t\t" +
                        veiculo.getAno()
                        );
                    }
                   
                    scanner.nextLine();
                    break;

                case 5:
                    Utilitarios.limparTela();

                    aluguelService.imprimeCabecalhoAluguelCliente();

                    aluguelService.getListaClientes(scanner,clientesList);

                    Cliente clienteSelecionado =  aluguelService.selecionaClienteDaLista(scanner,clientesList);

                    Utilitarios.limparTela();

                    aluguelService.imprimeCabecalhoAluguelveiculo();

                    aluguelService.imprimeListaVeiculos(veiculoList);

                    Veiculo veiculoSelecionado = aluguelService.selecionaVeiculoDaLista(scanner, veiculoList);

                    Utilitarios.limparTela();

                    //Quantidade de dias que o cliente irá alugar o veículo
                    System.out.print("\nInforme a quantidade de dias de aluguel: ");
                    int quantidadeDias =  scanner.nextInt();
                    scanner.nextLine();

                    Utilitarios.limparTela();

                    Aluguel aluguel = new Aluguel( );
                    aluguel.setCliente(clienteSelecionado);
                    aluguel.setVeiculo(veiculoSelecionado);
                    aluguel.setQuantidadededias(quantidadeDias); 
                    alugueisList.add(aluguel);
                                        
                    aluguel.mostrarDadosAluguel();
                    System.out.println("\nPressione Enter para continuar:");
                    scanner.nextLine();
                                        
                break;

                case 6:
                    Utilitarios.limparTela();

                    //Visualização dos Aluguéis, quantidade de dias e e valor
                    System.out.println("------------------------------------------------------------");
                    System.out.println("                       Aluguéis");
                    System.out.println("------------------------------------------------------------");

                    System.out.println("Cliente\t\tVeículo\t\t\tDias\t\tValor");
                    System.out.println("------------------------------------------------------------");

                    for (Aluguel aluguelRealizado : alugueisList) {
                        System.out.println(
                        aluguelRealizado.getCliente().getNome() + "\t\t" +
                        aluguelRealizado.getVeiculo().getModelo() + "\t\t\t" +
                        aluguelRealizado.getQuantidadeDias() + "\t\t" +
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
                        System.exit(0); // encerra o programa

                    
                default:
                    System.out.println("Opção inválida, pressione enter para retornar...");
                    scanner.nextLine();
                        
            }
        }
    }
}

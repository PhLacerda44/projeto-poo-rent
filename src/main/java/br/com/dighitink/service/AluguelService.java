package br.com.dighitink.service;

import java.util.ArrayList;
import java.util.Scanner;

//import br.com.dighitink.modelo.Aluguel;
import br.com.dighitink.modelo.Cliente;
import br.com.dighitink.modelo.Veiculo;


public class AluguelService {

        
    /** Método que contêm o código sobre o cabeçalho, "Locação Cliente"  */ 
      public void cabecalhoAluguelCliente() {     


          System.out.println("####################");
          System.out.println("   Locação Cliente      ");
          System.out.println("####################");
 
          System.out.println("--------------------------------");
          System.out.println("Código\t\tNome");
          System.out.println("--------------------------------");

     }

    /** Método com o código de cadastro da minha lista de clientes */
      public void getListaClientes(Scanner scanner ,ArrayList<Cliente> clientesList) {
         int posicaoCliente = 0;
         for(Cliente cliente:clientesList){
            System.out.println(posicaoCliente+" \t\t "+cliente.getNome());
            posicaoCliente++;
         }
     }
        
    /** Método que Seleciona por meio de um código um cliente da minha lista */
      public Cliente selecionaCliente(Scanner scanner, ArrayList<Cliente> clientesList ) {    
     
          System.out.print("\nInforme o código do cliente: ");
          int codigoCliente = scanner.nextInt();
          scanner.nextLine();

           System.out.print("\nCliente selecionado: ");
           Cliente clienteSelecionado = clientesList.get(codigoCliente);
           System.out.println(clienteSelecionado.getNome());
           return clienteSelecionado;
       }
    
    /** Método que contêm o código sobre o cabeçalho, "Locação Veículo" */
      public void cabecalhoAluguelveiculo() {     

          System.out.println("####################");
          System.out.println("   Locação Veículo      ");
          System.out.println("####################");
 
          System.out.println("--------------------------------");
          System.out.println("Código\t\tVeículo");
          System.out.println("--------------------------------");

     }
    
    //** Método com o código de cadastro da minha lista de veículos */
      public void getListaVeiculos(ArrayList<Veiculo> veiculoList ){
             int posicaoVeiculo = 0;
             for(Veiculo veiculo:veiculoList){
             System.out.println(posicaoVeiculo+ "\t\t" +veiculo.getModelo());
             posicaoVeiculo++;
               }
       }
    
    //**Método que Seleciona por meio de um código um veículo da minha lista */
      public Veiculo selecionaVeiculo(Scanner scanner, ArrayList<Veiculo> veiculoList){
          
          System.out.print("\nInforme o código do veículo: ");
          int codigoVeiculo = scanner.nextInt();
          scanner.nextLine();
           
           System.out.print("\nVeículo selecionado: ");
           Veiculo veiculoSelecionado = veiculoList.get(codigoVeiculo);
           System.out.println(veiculoSelecionado.getModelo());
           return veiculoSelecionado;
       }

       
     
}

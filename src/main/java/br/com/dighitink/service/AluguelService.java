package br.com.dighitink.service;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.dighitink.dao.AluguelDAO;
import br.com.dighitink.dao.ClienteDAO;
import br.com.dighitink.modelo.Aluguel;
//import br.com.dighitink.modelo.Aluguel;
import br.com.dighitink.modelo.Cliente;
import br.com.dighitink.modelo.Veiculo;
import br.com.dighitink.util.Utilitarios;


public class AluguelService {
        
    /** Método que contêm o código sobre o cabeçalho, "Locação Cliente"  */ 
      public void imprimeCabecalhoAluguelCliente() {     


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
      public Cliente selecionaClienteDaLista(Scanner scanner, ArrayList<Cliente> clientesList ) {    
     
          int codigoCliente = Utilitarios.validaNumeroInteiro(scanner, "Informe o código do cliente: ");
          scanner.nextLine();

           System.out.print("\nCliente selecionado: ");
           Cliente clienteSelecionado = clientesList.get(codigoCliente);
           System.out.println(clienteSelecionado.getNome());
           return clienteSelecionado;
       }
    
    /** Método que contêm o código sobre o cabeçalho, "Locação Veículo" */
      public void imprimeCabecalhoAluguelveiculo() {     

          System.out.println("####################");
          System.out.println("   Locação Veículo      ");
          System.out.println("####################");
 
          System.out.println("--------------------------------");
          System.out.println("Código\t\tVeículo");
          System.out.println("--------------------------------");

     }
    
    /** Método com o código de cadastro da minha lista de veículos */
      public void imprimeListaVeiculos(ArrayList<Veiculo> veiculoList ){
             int posicaoVeiculo = 0;
             for(Veiculo veiculo:veiculoList){
             System.out.println(posicaoVeiculo+ "\t\t" +veiculo.getModelo());
             posicaoVeiculo++;
               }
       }
    
    /**Método que Seleciona por meio de um código um veículo da minha lista */
      public Veiculo selecionaVeiculoDaLista(Scanner scanner, ArrayList<Veiculo> veiculoList){
          
          System.out.print("\nInforme o código do veículo: ");
          int codigoVeiculo = scanner.nextInt();
          scanner.nextLine();
           
           System.out.print("\nVeículo selecionado: ");
           Veiculo veiculoSelecionado = veiculoList.get(codigoVeiculo);
           System.out.println(veiculoSelecionado.getModelo());
           return veiculoSelecionado;
       }

     

}

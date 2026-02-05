package br.com.dighitink.service;

import java.util.ArrayList;
import java.util.Scanner;

//import br.com.dighitink.modelo.Aluguel;
import br.com.dighitink.modelo.Cliente;
import br.com.dighitink.modelo.Veiculo;


public class AluguelService {

     // private Cliente clienteSelecionado;
     // private ArrayList<Aluguel> alugueisList = new ArrayList<>();

     public void cabecalhoAluguelCliente() {     

          System.out.println("####################");
          System.out.println("   Locação Cliente      ");
          System.out.println("####################");
 
          System.out.println("--------------------------------");
          System.out.println("Código\t\tNome");
          System.out.println("--------------------------------");

     }

     public void getListaClientes(Scanner scanner ,ArrayList<Cliente> clientesList) {
         int posicaoCliente = 0;
         for(Cliente cliente:clientesList){
            System.out.println(posicaoCliente+" \t\t "+cliente.getNome());
            posicaoCliente++;
         }
     }

     public Cliente selecionaCliente(Scanner scanner, ArrayList<Cliente> clientesList ) {    
     
          System.out.print("\nInforme o código do cliente: ");
          int codigoCliente = scanner.nextInt();
          scanner.nextLine();

           System.out.print("\nCliente selecionado: ");
           Cliente clienteSelecionado = clientesList.get(codigoCliente);
           System.out.println(clienteSelecionado.getNome());
           return clienteSelecionado;
       }

        public void cabecalhoAluguelveiculo() {     

          System.out.println("####################");
          System.out.println("   Locação Veículo      ");
          System.out.println("####################");
 
          System.out.println("--------------------------------");
          System.out.println("Código\t\tVeículo");
          System.out.println("--------------------------------");

     }

      public void getListaVeiculos(ArrayList<Veiculo> veiculoList ){
             int posicaoVeiculo = 0;
             for(Veiculo veiculo:veiculoList){
             System.out.println(posicaoVeiculo+ "\t\t" +veiculo.getModelo());
             posicaoVeiculo++;
               }
       }

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

package br.com.dighitink.service;

import java.util.ArrayList;

import br.com.dighitink.modelo.Cliente;


public class AluguelService {


     public void cabecalhoAluguel() {     

          System.out.println("####################");
          System.out.println("      Locação       ");
          System.out.println("####################");
 
          System.out.println("--------------------------------");
          System.out.println("Código\t\tNome");
          System.out.println("--------------------------------");

     }

     public void getListaClientes(ArrayList<Cliente> clientesList) {
         int posicaoCliente = 0;
         for(Cliente cliente:clientesList){
            System.out.println(posicaoCliente+" \t\t "+cliente.getNome());
            posicaoCliente++;
         }
     }
      

    
}

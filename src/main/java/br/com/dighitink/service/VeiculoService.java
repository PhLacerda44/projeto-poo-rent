package br.com.dighitink.service;

import java.util.Scanner;

import br.com.dighitink.modelo.Veiculo;

public class VeiculoService {
  
    Scanner scanner = new Scanner(System.in);

   public Veiculo geraVeiculo(){

         //Informações do Cliente
         System.out.print("Digite o nome do Veículo:  ");
         String modeloVeiculo = scanner.nextLine();

         System.out.print("\nDigite a marca do Veículo:  ");
         String marcaVeiculo = scanner.nextLine();
         
         System.out.print("\nDigite o ano do Veículo:  ");
         Integer anoVeiculo = scanner.nextInt();


         // Caso o veículo seja de um ano abaixo de 2015, o processo não irá continuar
         if (anoVeiculo < 2015) {
              System.out.println("-----------------------------------------");
              System.out.println("Não é possível Concluir o cadastro!.");
              System.out.println("Veículos abaixo de 2015 não será possível Cadastrar");
              System.out.println("-----------------------------------------");
              scanner.nextLine();
        return null; 
     }
        scanner.nextLine();
                    
        Veiculo veiculoinput = new Veiculo();
        veiculoinput.setModelo(modeloVeiculo); 
        veiculoinput.setMarca(marcaVeiculo); 
        veiculoinput.setAno(anoVeiculo); 

        return veiculoinput;
        
        
   }

    
}

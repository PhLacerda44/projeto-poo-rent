package br.com.dighitink.service;

import java.util.Scanner;

import br.com.dighitink.modelo.Veiculo;

public class VeiculoService {
  
    Scanner scanner = new Scanner(System.in);

   public Veiculo geraVeiculo(){
         System.out.println("Digite o nome do Veículo:");
         String nomeVeiculo = scanner.nextLine();
         System.out.println("Digite a marca do Veículo");
         String marcaVeiculo = scanner.nextLine();
         System.out.println("Digite o ano do Veículo ");
         Integer anoVeiculo = scanner.nextInt();

         if (anoVeiculo < 2015) {
              System.out.println("-----------------------------------------");
              System.out.println("Não é possível Concluir o cadastro!.");
              System.out.println("-----------------------------------------");
              System.out.println("Pressione Enter para continuar");
              scanner.nextLine();
        return null; 
     }

        scanner.nextLine();
                    
        Veiculo veiculoinput = new Veiculo();
        veiculoinput.modelo = nomeVeiculo;
        veiculoinput.marca = marcaVeiculo;
        veiculoinput.ano = anoVeiculo;

        return veiculoinput;
        
        
   }

    
}

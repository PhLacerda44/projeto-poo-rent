package br.com.dighitink.service;

import java.util.Scanner;

import br.com.dighitink.modelo.Veiculo;
import br.com.dighitink.util.Utilitarios;

public class VeiculoService {

    Scanner scanner = new Scanner(System.in);

   //* Método que gera meu veículo, e faz a verificação de erro */
    public Veiculo geraVeiculo() {

      System.out.print("Digite o nome do Veículo: ");
      String modeloVeiculo = scanner.nextLine();

      System.out.print("\nDigite a marca do Veículo: ");
      String marcaVeiculo = scanner.nextLine();

      Integer anoVeiculo = Utilitarios.validaNumeroInteiro(scanner, "Informe o ano do veículo: ");
      
      Double valor = Utilitarios.validaNumeroDecimal(scanner, "Digite o valor da Diária: ");
      
      Veiculo veiculoinput = new Veiculo();
      veiculoinput.setModelo(modeloVeiculo);
      veiculoinput.setMarca(marcaVeiculo);
      veiculoinput.setAno(anoVeiculo);
      veiculoinput.setValorDiaria(valor);

      return veiculoinput;
   }
}

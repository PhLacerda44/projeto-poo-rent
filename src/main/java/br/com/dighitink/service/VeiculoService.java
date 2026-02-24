package br.com.dighitink.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import br.com.dighitink.dao.VeiculoDAO;
import br.com.dighitink.modelo.Veiculo;
import br.com.dighitink.util.Utilitarios;

public class VeiculoService {

    Scanner scanner = new Scanner(System.in);

   //* Método que gera meu veículo, e faz a verificação de erro */
    public Veiculo gerarESalvarVeiculo() throws SQLException {

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

      VeiculoDAO veiculoDAO = new VeiculoDAO();
      veiculoDAO.salvar(veiculoinput);

      return veiculoinput;
   }

   public List<Veiculo> listarVeiculos() throws SQLException{

      VeiculoDAO veiculoDAO = new VeiculoDAO();
      return veiculoDAO.listarTodos();
   }

   public Veiculo buscarPorId(Integer id) throws SQLException{
      VeiculoDAO veiculoDAO = new VeiculoDAO();
      return veiculoDAO.buscarPorId(id);
   }
   /** Método com o código de cadastro da minha lista de veículos */
   public void imprimeListaVeiculos(Scanner scanner ) throws SQLException{

      VeiculoService veiculoService = new VeiculoService();
      List<Veiculo> veiculoList = veiculoService.listarVeiculos();
      
         for(Veiculo veiculo:veiculoList){
         System.out.println(veiculo.getId()+ "\t\t" +veiculo.getModelo());
      
         }
   }
      /**Método que Seleciona por meio de um código um veículo da minha lista */
   public Veiculo buscarVeiculo(Scanner scanner) throws SQLException{
         
      VeiculoService veiculoService =  new VeiculoService();

      System.out.print("\nInforme o código do veículo: ");
      int codigoVeiculo = scanner.nextInt();
      scanner.nextLine();
      
      System.out.print("\nVeículo selecionado: ");
      Veiculo veiculoSelecionado = veiculoService.buscarPorId(codigoVeiculo);
      System.out.println(veiculoSelecionado.getModelo());
      return veiculoSelecionado;
      }
}

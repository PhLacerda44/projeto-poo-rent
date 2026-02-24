package br.com.dighitink.service;

import java.sql.SQLException;
import java.util.List;

import br.com.dighitink.dao.AluguelDAO;
import br.com.dighitink.modelo.Aluguel;


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

    /** Método que contêm o código sobre o cabeçalho, "Locação Veículo" */
      public void imprimeCabecalhoAluguelveiculo() {     

          System.out.println("####################");
          System.out.println("   Locação Veículo      ");
          System.out.println("####################");
 
          System.out.println("--------------------------------");
          System.out.println("Código\t\tVeículo");
          System.out.println("--------------------------------");

     }
    
      public List<Aluguel> listaAlugueis() throws SQLException{
        AluguelDAO aluguelDAO = new AluguelDAO();
        return aluguelDAO.listarTodos();
       }

      public Aluguel buscarPorId(Integer id) throws SQLException{
        AluguelDAO aluguelDAO = new AluguelDAO();
        return aluguelDAO.buscarPorId(id);
       }
        // Método para mostrar os dados do aluguel
      public void mostrarDadosAluguel(Aluguel aluguel) {

            Double valorDiaria = aluguel.getVeiculo().getValorDiaria();
            Double totalAluguel = aluguel.getTotalAluguel();

            System.out.println("############################");
            System.out.println("        Dados do aluguel    ");
            System.out.println("############################");
            System.out.println("\nCliente: " + aluguel.getCliente().getNome());
            System.out.println("\nVeículo Alugado: " + aluguel.getVeiculo().getModelo());
            System.out.println("\nValor da diária: " + valorDiaria);
            System.out.println("\nQuantidade de dias: " + aluguel.getQuantidadeDias());
            System.out.println("\nTotal do aluguel: " + totalAluguel);
        }

      public void salvar(Aluguel aluguel) throws SQLException {
            AluguelDAO aluguelDAO = new AluguelDAO();
            aluguelDAO.salvar(aluguel);
        }

     

}

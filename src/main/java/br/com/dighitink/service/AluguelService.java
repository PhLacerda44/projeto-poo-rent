package br.com.dighitink.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.dighitink.dao.AluguelDAO;
import br.com.dighitink.modelo.Aluguel;
//import br.com.dighitink.modelo.Aluguel;
import br.com.dighitink.modelo.Cliente;
import br.com.dighitink.modelo.Veiculo;
import br.com.dighitink.util.Utilitarios;


public class AluguelService {

  private ClienteService clienteService;  
    public AluguelService(ClienteService clienteService) {
    this.clienteService = clienteService;
  }

  private VeiculoService veiculoService;
      public AluguelService(VeiculoService veiculoService){
      this.veiculoService = veiculoService;
  }

    /** Método que contêm o código sobre o cabeçalho, "Locação Cliente"  */ 
      public void imprimeCabecalhoAluguelCliente() {     


          System.out.println("####################");
          System.out.println("   Locação Cliente      ");
          System.out.println("####################");
 
          System.out.println("--------------------------------");
          System.out.println("Código\t\tNome");
          System.out.println("--------------------------------");

     }

    /** Método com o código de cadastro da minha lista de clientes 
     * @throws SQLException */
      public void getListaClientes(Scanner scanner) throws SQLException {

        ClienteService clienteService = new ClienteService();
        List<Cliente> clientesList = clienteService.listarClientes();
         
         for(Cliente cliente:clientesList){
            System.out.println(cliente.getId()+" \t\t "+cliente.getNome());            
         }
     }
        
    /** Método que Seleciona por meio de um código um cliente da minha lista */
      public Cliente selecionaClienteDaLista(Scanner scanner) throws SQLException {    
     
          int codigoCliente = Utilitarios.validaNumeroInteiro(scanner, "Informe o código do cliente: ");
          scanner.nextLine();

           System.out.print("\nCliente selecionado: ");
           Cliente clienteSelecionado = clienteService.buscarPorId(1);
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
      public void imprimeListaVeiculos(Scanner scanner ) throws SQLException{

            VeiculoService veiculoService = new VeiculoService();
            List<Veiculo> veiculoList = veiculoService.listarVeiculos();
          
             for(Veiculo veiculo:veiculoList){
             System.out.println(veiculo.getId()+ "\t\t" +veiculo.getModelo());
           
               }
       }
    
    /**Método que Seleciona por meio de um código um veículo da minha lista */
      public Veiculo selecionaVeiculoDaLista(Scanner scanner) throws SQLException{
          
          System.out.print("\nInforme o código do veículo: ");
          int codigoVeiculo = scanner.nextInt();
          scanner.nextLine();
           
           System.out.print("\nVeículo selecionado: ");
           Veiculo veiculoSelecionado = veiculoService.buscarPorId(1);
           System.out.println(veiculoSelecionado.getModelo());
           return veiculoSelecionado;
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

     

}

package br.com.dighitink.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.dighitink.factory.ConnectionFactory;
import br.com.dighitink.modelo.Aluguel;
import br.com.dighitink.modelo.Cliente;
import br.com.dighitink.modelo.Veiculo;

public class AluguelDAO {

    public void salvar(Aluguel aluguel) throws SQLException {

        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.abreConexao();

        PreparedStatement pstm = connection.prepareStatement( "INSERT INTO aluguel (id_cliente, id_veiculo, quantidadedias, totalaluguel) VALUES (?, ?, ?, ?)" );

        pstm.setInt(1, aluguel.getCliente().getId());
        pstm.setInt(2, aluguel.getVeiculo().getId());
        pstm.setInt(3, aluguel.getQuantidadeDias());
        pstm.setDouble(4, aluguel.getTotalAluguel());

        pstm.execute();

        pstm.close();
        connection.close();
    }

    public List<Aluguel> listarTodos() throws SQLException {

        List<Aluguel> listaAlugueis = new ArrayList<>();

        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.abreConexao();

        PreparedStatement pstm = connection.prepareStatement("SELECT id, id_cliente, id_veiculo, quantidadedias, totalaluguel FROM aluguel");

        pstm.execute();
        ResultSet rst = pstm.getResultSet();

        while (rst.next()) {

            Aluguel aluguel = new Aluguel();

            aluguel.setId(rst.getInt("id"));

            Cliente cliente = new Cliente();
            cliente.setId(rst.getInt("id_cliente"));
            aluguel.setCliente(cliente);

            Veiculo veiculo = new Veiculo();
            veiculo.setId(rst.getInt("id_veiculo"));
            aluguel.setVeiculo(veiculo);

            aluguel.setQuantidadeDias(rst.getInt("quantidadedias"));
            aluguel.setTotalAluguel(rst.getDouble("totalaluguel"));

            listaAlugueis.add(aluguel);
        }

        rst.close();
        pstm.close();
        connection.close();

        return listaAlugueis;
    }

    public Aluguel buscarPorId(Integer id) throws SQLException {

        Aluguel aluguel = new Aluguel();

        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.abreConexao();

        PreparedStatement pstm = connection.prepareStatement( "SELECT id, id_cliente, id_veiculo, quantidadedias, totalaluguel FROM aluguel WHERE id = ?" );

        pstm.setInt(1, id);
        pstm.execute();

        ResultSet rst = pstm.getResultSet();

        while (rst.next()) {

            aluguel.setId(rst.getInt("id"));

            Cliente cliente = new Cliente();
            cliente.setId(rst.getInt("id_cliente"));
            aluguel.setCliente(cliente);

            Veiculo veiculo = new Veiculo();
            veiculo.setId(rst.getInt("id_veiculo"));
            aluguel.setVeiculo(veiculo);

            aluguel.setQuantidadeDias(rst.getInt("quantidadedias"));
            aluguel.setTotalAluguel(rst.getDouble("totalaluguel"));
        }

        rst.close();
        pstm.close();
        connection.close();

        return aluguel;
    }
}
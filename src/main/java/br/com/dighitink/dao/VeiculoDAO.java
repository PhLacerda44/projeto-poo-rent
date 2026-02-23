package br.com.dighitink.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.dighitink.factory.ConnectionFactory;
import br.com.dighitink.modelo.Veiculo;

public class VeiculoDAO {
    
    public void salvar (Veiculo veiculo) throws SQLException{

        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.abreConexao();

        PreparedStatement pstm = connection.prepareStatement("INSERT INTO veiculos (modelo, marca, ano, valordiaria) VALUES (?,?,?,?) ");
        pstm.setString(1, veiculo.getModelo());
        pstm.setString(2, veiculo.getMarca());
        pstm.setInt(3, veiculo.getAno());
        pstm.setDouble(4, veiculo.getValorDiaria());
        pstm.execute();

        pstm.close();
        connection.close();
    }

    public List<Veiculo> listarTodos() throws SQLException{
        
        List<Veiculo> listaVeiculos = new ArrayList<>();

        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.abreConexao();

        PreparedStatement pstm = connection.prepareStatement("SELECT id, modelo, marca, ano, valordiaria FROM veiculos");
        pstm.execute();

        ResultSet rst = pstm.getResultSet();
        while (rst.next()) {

            Veiculo veiculo = new Veiculo();
            veiculo.setId(rst.getInt("id"));
            veiculo.setModelo(rst.getString("modelo"));
            veiculo.setMarca(rst.getString("marca"));
            veiculo.setAno(rst.getInt("ano"));
            veiculo.setValorDiaria(rst.getDouble("valordiaria"));
            listaVeiculos.add(veiculo);
            
        }

        return listaVeiculos;

    }

    public Veiculo buscarPorId(Integer id) throws SQLException{

        Veiculo veiculo = new Veiculo();

        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.abreConexao();

        PreparedStatement pstm = connection.prepareStatement("SELECT id, modelo, marca, ano FROM veiculos WHERE id = ?");
        pstm.setInt(1, id);
        pstm.execute();

        ResultSet rst = pstm.getResultSet();
        while (rst.next()) {

            veiculo.setId(rst.getInt("id"));
            veiculo.setModelo(rst.getString("modelo"));
            veiculo.setMarca(rst.getString("marca"));
            veiculo.setAno(rst.getInt("ano"));
            veiculo.setValorDiaria(rst.getDouble("valordiaria"));
            
        }

        rst.close();
        pstm.close();
        connection.close();
        return veiculo;
    }
}

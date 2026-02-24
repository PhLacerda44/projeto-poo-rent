package br.com.dighitink.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.dighitink.factory.ConnectionFactory;
import br.com.dighitink.modelo.Cliente;

public class ClienteDAO {

    public void salvar(Cliente cliente) throws SQLException {

        ConnectionFactory factory = new ConnectionFactory();	
		Connection connection = factory.abreConexao();

        PreparedStatement pstm = connection.prepareStatement("INSERT INTO clientes (nome, idade, documento) VALUES (?, ?, ?)");
        pstm.setString(1, cliente.getNome());
        pstm.setInt(2, cliente.getIdade());
        pstm.setString(3, cliente.getDocumento());
        pstm.execute();

        pstm.close();
		connection.close();

    }

    public List<Cliente> listarTodos() throws SQLException {

        List<Cliente> listaClientes = new ArrayList<>();

        ConnectionFactory factory = new ConnectionFactory();	
		Connection connection = factory.abreConexao();

        PreparedStatement pstm = connection.prepareStatement("SELECT id, nome, idade, documento FROM clientes ORDER BY id");
        pstm.execute();

        ResultSet rst = pstm.getResultSet();
        while(rst.next()) {

            Cliente cliente = new Cliente();
            cliente.setId(rst.getInt("id"));
            cliente.setNome(rst.getString("nome"));
            cliente.setIdade(rst.getInt("idade"));
            cliente.setDocumento(rst.getString("documento"));
            listaClientes.add(cliente);
			
		}

        return listaClientes;

       
    }

    public Cliente buscarPorId(Integer id) throws SQLException {

        Cliente cliente = new Cliente();

        ConnectionFactory factory = new ConnectionFactory();	
		Connection connection = factory.abreConexao();

        PreparedStatement pstm = connection.prepareStatement("SELECT id, nome, idade, documento FROM clientes WHERE id = ?");
        pstm.setInt(1, id);
        pstm.execute();

        ResultSet rst = pstm.getResultSet();
        while(rst.next()) {

            
            cliente.setId(rst.getInt("id"));
            cliente.setNome(rst.getString("nome"));
            cliente.setIdade(rst.getInt("idade"));
            cliente.setDocumento(rst.getString("documento"));
			
		}

        rst.close();
		pstm.close();
		connection.close();
     
        return cliente;

    }
}
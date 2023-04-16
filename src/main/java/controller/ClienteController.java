package controller;


import conectBank.ConnectionBank;
import java.sql.PreparedStatement;
import java.sql.Connection;
import model.Clientes;
//import java.sql.Date;


public class ClienteController {
    
    
public void salvarClientes(Clientes clientes){
        
String sql = "INSERT INTO clientes(nomecliente,endereco,telefone,email) VALUES (?,?,?,?)";
        
Connection connection = null; 
PreparedStatement statement = null;
  
  try{
      
 connection = ConnectionBank.getConnection();
 statement = connection.prepareStatement(sql);  
 
 statement.setString(1, clientes.getNomecliente());
 statement.setString(2, clientes.getEndereco());
 statement.setString(3, clientes.getTelefone());
 statement.setString(4, clientes.getEmail());
 statement.execute();
 }catch(Exception e){
    throw new RuntimeException("Erro ao salvar Cliente no Banco de dados"+ e.getMessage());
}finally{
      ConnectionBank.closeConnection(connection,statement);
  }

  
}
    
    
    
    
    
    
    
    
    
    
    
}

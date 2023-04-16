package model;

//import java.util.Date;


public class Clientes {
    private int idcliente;
    private String nomecliente;   
    private String endereco;
    private String telefone;
    private String email;
    
    
    
 public Clientes(){
     
 }   
 
 

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }
    
 
 
 
 public String getNomecliente(){
     return nomecliente;
 }
 
  public void setNomecliente(String nomecliente)  {
      this.nomecliente = nomecliente;
  }
  
    
  public String getEndereco(){
      return endereco;
  }
  
  
  public void setEndereco(String endereco){
      this.endereco = endereco;
      
      
  }
  
  
  
 public String getTelefone(){
     return telefone;
 }
 
 
 public void setTelefone(String telefone){
     this.telefone = telefone;
 }
 public String getEmail(){
     return email;
 } 
  
  public void setEmail(String email){
      this.email = email;
      
      
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
    
}

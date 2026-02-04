package br.com.dighitink.modelo;

public class Cliente {

   private String nome ;
   private Integer idade ;
   private String documento ;

   //Encapsulamento Nome
   public String getNome() {
        return nome;
    }
   public void setNome(String nome){
      this.nome = nome;
   }

   //Encapsuamento Idade
   public Integer getIdade(){
      return idade;
   }
   public void setIdade(Integer idade){
      this.idade = idade;
   }

   //Encapsumaneto Documento
   public String getDocumento(){
      return documento;
   }
   public void setDocumento(String documento){
      this.documento = documento;
   }
        
   
       


   
   
}

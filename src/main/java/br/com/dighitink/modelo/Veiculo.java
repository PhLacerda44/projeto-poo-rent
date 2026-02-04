package br.com.dighitink.modelo;

public class Veiculo {

   private String modelo;
   private String marca;
   private Integer ano;

   //Encapsulamento Modelo
   public String getModelo(){
      return modelo;
   }
   public void setModelo(String modelo) {
      this.modelo = modelo;
   }


   //Encapsulamento Marca
   public String getMarca(){
      return marca;
   }
   public void setMarca(String marca){
      this.marca = marca;
   }


   //Encapsulamento Ano
   public Integer getAno(){
      return ano;
   }
   public void setAno(Integer ano){
      this.ano = ano;
   }

}

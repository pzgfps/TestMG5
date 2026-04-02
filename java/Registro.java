package mg_desafio;

import java.util.Date;

public class Registro {
   private Date horario;
   private Tipo tipo;
   private double volume;
   private Secao secao;
   private String responsavel;
   private double valor; // trocar para BigDecimal
   private boolean entrada;
   
   
   public Registro(Date horario, Tipo tipo, double volume, Secao secao, String responsavel, double valor,
                   boolean entrada) {
      
      this.horario = horario;
      this.tipo = tipo;
      this.volume = volume;
      this.secao = secao;
      this.responsavel = responsavel;
      this.valor = valor;
      this.entrada = entrada;
   }


   public Date getHorario() {
      return horario;
   }


   public void setHorario(Date horario) {
      this.horario = horario;
   }


   public Tipo getTipo() {
      return tipo;
   }


   public void setTipo(Tipo tipo) {
      this.tipo = tipo;
   }


   public double getVolume() {
      return volume;
   }


   public void setVolume(double volume) {
      this.volume = volume;
   }


   public Secao getSecao() {
      return secao;
   }


   public void setSecao(Secao secao) {
      this.secao = secao;
   }


   public String getResponsavel() {
      return responsavel;
   }


   public void setResponsavel(String responsavel) {
      this.responsavel = responsavel;
   }


   public double getValor() {
      return valor;
   }


   public void setValor(double valor) {
      this.valor = valor;
   }


   public boolean isEntrada() {
      return entrada;
   }


   public void setEntrada(boolean entrada) {
      this.entrada = entrada;
   }
   
   
   
}

package mg_desafio;

import java.util.List;

public class Queries {
   
   private Banco banco;
   
   public Queries () {
      banco = new Banco();
   }
   
   public void volumeTotal (Tipo tipo) {
      
      System.out.println("Volume Total: " + banco.volumeTotal(tipo));
      
   }
   
   public void historico (Tipo tipo, Secao secao) {
      List<Registro> q = banco.historico(tipo, secao);
      for(Registro r : q)
         System.out.println(r);
   }
   
   public double volumeSecao () {
      
      
      
   }

}

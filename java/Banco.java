package mg_desafio;

import java.util.ArrayList;
import java.util.List;

public class Banco {

   public List<Registro> lista;

   public Banco() {
      lista = new ArrayList<>();
   }
   
   public double volumeTotal (Tipo tipo) {
      // select filtrando pelo tipo e somando o volume de entrada e subtraindo o de saída
      
      double vol = 0;
      for(Registro r : lista) {
         if(r.getTipo() == tipo) {
            if(r.isEntrada())
               vol += r.getVolume();
            else vol -= r.getVolume();
         }
      }
      
      return vol;
   }
   
   public List<Registro> historico (Tipo tipo, Secao secao) {
      // select filtrando por tipo e secao 
      
      List<Registro> query = new ArrayList<>();
      for(Registro r : lista) {
         if(r.getSecao().equals(secao) && r.getTipo() == tipo)
            query.add(r);
      }
      
      return query;
   }
   
}

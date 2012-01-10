
public class Total {
   private int total;
   public Total() {
	   this(0);
   }
   public Total(int valor){
	   inicializarPuntaje(valor);
   }
   

   private void inicializarPuntaje(int valor)
   {
	   total=valor;
   }
   public void sumar(int valor)
   {
	   total+=valor;
   }
   
   @Override
   public boolean equals(Object nuevoTotal){
	   return total == ((Total)nuevoTotal).total;
   }
}

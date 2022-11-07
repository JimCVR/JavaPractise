package Tema_6.Actividades_Entregables.Ej_2;

public class ListaDePalabras {
   String [] cadenas;
   public ListaDePalabras(){
       cadenas = new String[3];
       cadenas[0] = "Hola";
       cadenas[1] = "\n";
       cadenas[2] = "Mundo";
   }
   public ListaDePalabras(String [] cadenas){
       this.cadenas = cadenas;
   }
   public void mostrarPalabras(){
       for(String i : cadenas){
            System.out.print(i+" ");
       }
       System.out.println();
   }
   public void setPalabra(int posicion,String palabra){
       for(int i = 0;i < cadenas.length;i++){
           cadenas[posicion] = palabra;
       }
   }
   public void eliminarCadena(int posicion){
       for(int i = 0;i < cadenas.length;i++){
           cadenas[posicion] = "";
       }
   }
    public void eliminarCadena(String palabra){
        for(int i = 0;i < cadenas.length;i++){
            if(cadenas[i].equals(palabra)) {
                cadenas[i] = "";
            }
        }
    }
}
/*
* 2 Crea una clase con un array de cadenas, cada cadena será una palabra o un separador (espacio o espacio y coma o espacio y
* punto por ejemplo, /n para salto de línea ..), con métodos para reemplazar una cadena del array, para eliminarla, para
*  mostrar todo el array. Todo esto se utilizará desde otra clase principal con un menú y opción para salir
* */
package Tema_7;
import java.util.*;
public class Ej_14 {
    public static void main (String[]args){
        Map <Integer,Double> productos = new HashMap<>();
        int codigo = 0;
        double precio = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------");

        System.out.println("1. Introducir producto");
        System.out.println("2. Modificar precio");
        System.out.println("3. Mostrar todos los productos");
        System.out.println("4. Eliminar producto");
        System.out.println("5. Salir");
        System.out.println("-----------------------------");
        int orden = sc.nextInt();

        switch(orden){
            case 1:
                System.out.println("Introduce codigo");
                codigo = sc.nextInt();
                System.out.println("Introduce precio");
                precio = sc.nextDouble();
                productos.put(codigo, precio);
                System.out.println("Producto añadido con exito!");
                break;
            case 2:
                System.out.println("Introduce codigo");
                codigo = sc.nextInt();
                System.out.println("Introduce nuevo precio");
                precio = sc.nextDouble();
                productos.replace(codigo, precio);
                System.out.println("Producto modificado con exito!");
                break;
            case 3:
                Iterator it = productos.keySet().iterator();
                while(it.hasNext()){
                    Integer key = (Integer) it.next();
                    System.out.println("Codigo: " +key+ " Precio: "+productos.get(key));
                }
                break;
            case 4:
                System.out.println("Introduce codigo del producto");
                codigo = sc.nextInt();
                productos.remove(codigo);
                System.out.println("Producto eliminado!");
                break;
            case 5:
                System.out.println("Saliendo...");
                break;
        }

    }
}
/*
* 14) Crea un mapa HashMap donde se almacenará el código y el precio de Productos. Contiene el campo clave código de tipo String y el atributo precio de tipo double.

Realizar el siguiente menú (utilizar funciones para cada opción):

1. Introducir producto (Pide los dos campos y los guarda en el HashMap).

2. Modificar precio (Pide un código y un nuevo precio y lo inserta en el HashMap).

3. Mostrar todos los productos (muestra todos los elementos del HashMap).

4. Eliminar producto (Pide un código y lo elimina del HashMap).

5. Salir.

* */
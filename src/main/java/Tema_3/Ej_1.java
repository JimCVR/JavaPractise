
public class Ej_1 {
    public static void main(String[]args){
        String s1 = "Hello";//s1 s2 y s3 misma ubicacion pool comun
        String s2 = "Hello";
        String s3 = s1 ;
        String s4 = new String("Hello");//s4 y s5 distintas ubicaciones de almacenamiento
        String s5 = new String("Hello");
    }
}

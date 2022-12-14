package Tema_5;

import java.util.Scanner;

public class Carta {
    private Scanner input;
    private int numero;
    private char palo;

    public Carta(){
        input = new Scanner(System.in);
        numero = 1;
        palo = 'c';
    }
    public Carta(Carta nuevaCarta){
        this.numero = nuevaCarta.getNumero();
        this.palo = nuevaCarta.getPalo();
    }

    public int getNumero() {
        return numero;
    }

    public char getPalo() {
        return palo;
    }

    public void setNumero() {
        boolean flag = true;
        int numero = 0;
        System.out.println("Introduce numero");
        do{
            numero = input.nextInt();
            input.nextLine();
            if( numero <= 13 || numero > 0) {
                this.numero = numero;
                flag = false;
            }
        }while(flag);
    }

    public void setPalo() {
        boolean flag = true;
        char palo = ' ';
        do{
            System.out.println("Introduce palo");
            palo = input.next().charAt(0);
            if(palo =='c' || palo =='p' || palo =='d' || palo =='t'){
                this.palo = palo;
                flag = false;
            }
        }while(flag);
    }
    public void mostrarCarta(){
        String cadenaPalo = "";
        switch(palo){
            case 'c': cadenaPalo = "corazones";
            break;
            case 'p': cadenaPalo = "picas";
            break;
            case 'd': cadenaPalo = "diamantes";
            break;
            case 't': cadenaPalo = "treboles";
        }
        switch(numero){
            case 1 : System.out.println("es el As de "+cadenaPalo);
            break;
            case 11:    System.out.println("es el Jack de "+cadenaPalo);
            break;
            case 12:    System.out.println("es la Reina de "+cadenaPalo);
            break;
            case 13:    System.out.println("es el Rey de "+cadenaPalo);
            break;
            default: System.out.println("es el "+numero+" de "+cadenaPalo);
        }
    }
    public  void comparar(Carta carta2){
        System.out.print("El mayor ");
        if(numero > carta2.getNumero()){
            mostrarCarta();
        } else if (numero == carta2.getNumero()){
            if(palo > carta2.getPalo()){
                mostrarCarta();
            }else{
                carta2.mostrarCarta();
            }
        }else{
            carta2.mostrarCarta();
        }
    }
    public static void main(String[]args){
        Carta carta1 = new Carta();
        carta1.setNumero();
        carta1.setPalo();
        Carta carta2 = new Carta(carta1);
        carta1.mostrarCarta();
        carta2.mostrarCarta();
        carta2.setNumero();
        carta2.setPalo();
        carta1.mostrarCarta();
        carta2.mostrarCarta();
        carta1.comparar(carta2);
    }
}
/* Implementa una clase Carta que represente a una carta de una baraja de p??ker. De  una carta interesa conocer su n??mero y su palo (almacenado como una ??nica letra).
Un constructor por defecto y un constructor de copias.
Los m??todos get que permitan acceder a los atributos.
Los m??todos set que en lugar de recibir los nuevos valores como  argumento, los soliciten por teclado. Se comprobar??n que sean v??lidos y se  volver??n a solicitar mientras no lo sean. Para que el n??mero de la carta sea  valido deber?? estar entre 1 y 13 y el palo deber?? ser una de las siguientes  letras: c,p,r,t que corresponden a corazones, picas, rombos y tr??boles.
Un m??todo mostrarCarta() que muestre por pantalla de que carta se trata  con el siguiente formato: es el <numero> de <palo> donde el n??mero y el  palo corresponden a los atributos de la carta con las siguientes  particularidades:
a) El palo del n??mero deber?? mostrarse al completo, es decir
se deber?? sustituir la letra del palo por el palo en cuesti??n.
b) Si el n??mero de la carta est?? entre 2 y 10 se mostrar??
normalmente. Para el resto de los n??meros 1,11,12,13 se
cambiar?? respectivamente por As, Jack, Reina, Rey .

- Un m??todo comparar(Carta) que reciba una carta como argumento y la  compare con la actual Indicando por pantalla cu??l de ellas es la ganadora.  Para esto se comprobar?? en primer el n??mero, si son distintos ganar?? la  mayor, si son iguales se comparar??n los palos, el orden de victoria es  Tr??bol, Rombos, Picas, Corazones. Si las cartas son iguales se indicar?? que  hay un empate.
- Un m??todo main en el que se creen 2 cartas, la primera con el constructor  por defecto y se inicialice con los m??todos set, la segunda se copiar?? con el  constructor de copias. Despu??s se mostrar??n ambas cartas con el m??todo  mostrarCarta() y se comparar??n con el m??todo comparar. Despu??s de esto  se modificar?? la segunda con los m??todos set y se volver??n a mostrar y  comparar.
*/
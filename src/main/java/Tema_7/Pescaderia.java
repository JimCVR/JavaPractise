package Tema_7;

import java.util.*;

public class Pescaderia {
    Queue <String> clientes = new LinkedList();
    Random r = new Random();
    public Pescaderia(){
        for(int i = 0;i < r.nextInt(6)+5;i++){
            clientes.add("Cliente "+(i+1));
        }
    }
    public String mostrarCliente(){
        int minutosCola = r.nextInt(6)+5;
        return "Atendiendo a "+ clientes.poll();
    }
    public boolean clienteAparece(){
        int clientChance = r.nextInt(10)+1;
        if(clientChance==10){
            System.out.print("Aparecio un nuevo cliente");
        }
        return clientChance == 10;
    }
    public void mostrarCola(){
        for(String c : clientes){
            System.out.print(c+" ");
        }
    }
    public void menuPescaderia(){

        int tamanhoCola = clientes.size();
        int contCliente = 1;
        int minutosTotales =1;
        while(!clientes.isEmpty() && minutosTotales<=100) {
            int minutoCola = r.nextInt(6)+5;
            for (int i = 1; i <= minutoCola; i++) {
                if(i==1){
                    System.out.print((minutosTotales)+" "+mostrarCliente() + ": " + minutoCola + " minutos en cola: ");
                    System.out.print("(");
                    mostrarCola();
                    System.out.print(")");
                }else{
                    System.out.print(minutosTotales+" ");
                }
                if (clienteAparece()) {
                    clientes.add("Cliente " + (tamanhoCola + contCliente));
                    contCliente++;
                }
                System.out.println();

                minutosTotales++;
            }
        }
        System.out.println("Cerrando la pescaderia...");
        if(clientes.size()>0){
            System.out.println("Quedaron "+clientes.size()+" clientes sin atender");
        }
    }
    public static void main(String[]args){
        Pescaderia p = new Pescaderia();
        p.menuPescaderia();
    }
}

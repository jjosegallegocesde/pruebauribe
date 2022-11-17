package org.example;

import org.example.clasesHalloween.Fiesta;
import org.example.clasesHalloween.Invitado;
import org.example.clasesHalloween.Lugar;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner entradaPorTeclado=new Scanner(System.in);
        Lugar objetoLugar = new Lugar();
        Fiesta objetoFiesta = new Fiesta();

        ArrayList<Invitado> invitados = new ArrayList<Invitado>();
        int contadorInvitados=0;

        System.out.println("****** GRAN FIESTA GRUPO URIBE********");
        System.out.println("**************************************");


        //CICLO PARA UBICAR INVITADOS DENTRO DEL AFORO
        int variableDeControl=0;
        System.out.println("Menu del programa");
        System.out.println("**************");
        System.out.println("0. SALIR");
        System.out.println("1. Registro del Lugar");
        System.out.println("2. Registro de la fiesta");
        System.out.println("3. Registro de Invitado");
        System.out.println("4. Ver Invitados");


        do{
            System.out.print("\nDigita una opcion del menu: ");
            variableDeControl=Integer.parseInt(entradaPorTeclado.nextLine());

            switch (variableDeControl){

                case 1:
                    System.out.print("Digita el aforo: ");
                    objetoLugar.setAforo(entradaPorTeclado.nextInt());
                    entradaPorTeclado.nextLine();
                    System.out.print("Digita la direccion: ");
                    objetoLugar.setDireccion(entradaPorTeclado.nextLine());
                    break;
                case 2:
                    System.out.print("Fecha: ");
                    objetoFiesta.setFecha(entradaPorTeclado.next());
                    System.out.print("Costos de alimentos: ");
                    objetoFiesta.setCostosAlimentos(entradaPorTeclado.nextDouble());
                    System.out.print("Costos de bebidas: ");
                    objetoFiesta.setCostosBebidas(entradaPorTeclado.nextDouble());
                    System.out.print("Costos de lugar: ");
                    objetoFiesta.setCostosLugar(entradaPorTeclado.nextDouble());
                    System.out.print("Costos de equipos: ");
                    objetoFiesta.setCostosEquipos(entradaPorTeclado.nextDouble());
                    break;
                case 3:

                    if(objetoLugar.getAforo()>=1){

                        Invitado invitado= new Invitado();

                        System.out.print("Nombres de invitado: ");
                        invitado.setNombres(entradaPorTeclado.next());

                        /*System.out.print("Edad de invitado: ");
                        invitado.setEdad(entradaPorTeclado.nextInt());

                        System.out.print("Documento Invitado: ");
                        invitado.setId(entradaPorTeclado.next());

                        System.out.print("Paga entrada este invitado? ");
                        invitado.setAplicaCover(entradaPorTeclado.nextBoolean());

                        System.out.print("Nombre del disfraz: ");
                        invitado.setDisfraz(entradaPorTeclado.next());*/
                        invitados.add(invitado);
                        contadorInvitados++;
                        objetoLugar.setAforo(objetoLugar.getAforo()-1);
                    }else{
                        System.out.println("no hay mas espacio disponible");
                    }
                    break;
                case 4:

                    for(Invitado invitadoBuscado:invitados){
                        System.out.println(invitadoBuscado.getNombres());
                    }

                    break;

                default:
                    System.out.println("Selecciona una opcion valida");

            }


        }while(variableDeControl != 0);















    }
}
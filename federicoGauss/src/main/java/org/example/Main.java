package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    String usuario, usuarioBD="mariana", contrasena, contrasenaBD="321",correo, correoBD="maria@gmail.com";
    int intentos=0, opciones=0;
    boolean login=false;

    Scanner lea = new Scanner(System.in);

    while(!login) {/*
        System.out.println("Correo: ");
        correo = lea.nextLine();
        System.out.println("Usuario: ");
        usuario = lea.nextLine();
        System.out.println("Contrasena: ");
        contrasena = lea.nextLine();
        login = true;

        if (usuario.equals(usuarioBD) && contrasena.equals(contrasenaBD) && correo.equals(correoBD)) {
            System.out.println("----- Menu -----");
        } else {
            for (intentos = 0; intentos <= 1; intentos++) {
                System.out.println("***** Contrasena incorrecta *****");
                System.out.println("***** Intentelo nuevamente *****");
                System.out.println("Contrasena: ");
                contrasena = lea.nextLine();
            }
        } */
        do{
           while(){

           }
        switch (opciones){
            case 1:
                System.out.println("----- MENU -----");
                System.out.println("entrada de cangrejo de urrao $28.000");
                System.out.println("escalopes a lo rigo 35.000");
                System.out.println("filete tour de francia 150.000");
                System.out.println("corvina de rigo 20.000");
                System.out.println("jugos de urrao 18.500");
                break;
            case 2:
                break;
            case 3:
                System.out.println("Calcular total");
                Integer totalSinPropina=((cantidadCangrejo*28000)+
                        (cantidadEscalopes*35000)+
                        (cantidadFiletes*150000)+
                        (cantidadCorvina*80000)+
                        (cantidadCoctel*20000)+
                        (cantidadJugos*18500));
                break;
            case 4:
                System.out.println("Salir");
                break;
        }

        }
        while (opciones!=4);

    }

/*
        System.out.println("----- MENU -----");
        System.out.println("entrada de cangrejo de urrao $28.000");
        cantidadCangrejo= lea.nextInt();
        System.out.println("escalopes a lo rigo 35.000");
        cantidadEscalopes=lea.nextInt();
        System.out.println("filete tour de francia 150.000");
        cantidadFiletes=lea.nextInt();
        System.out.println("corvina de rigo 20.000");
        cantidadCorvina= lea.nextInt();
        System.out.println("jugos de urrao 18.500");
        cantidadJugos= lea.nextInt();

*/

    }
}
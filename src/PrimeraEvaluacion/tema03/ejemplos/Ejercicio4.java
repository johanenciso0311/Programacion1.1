package PrimeraEvaluacion.tema03.ejemplos;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        String user = "johan";
        String password = "johan0311";

        Scanner teclado = new Scanner(System.in);
        System.out.println("Usuario: ");
        String usuario = teclado.nextLine();
        System.out.println("contraseña: ");
        String contraseña = teclado.nextLine();

        if (usuario.equals(user) && contraseña.equals(password)){
            System.out.println("has entrado al sistema");

        }
        else System.out.println("usuario y/o contraseña incorrectos");

    }

}

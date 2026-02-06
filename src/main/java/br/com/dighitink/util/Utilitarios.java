package br.com.dighitink.util;

import java.io.IOException;
import java.util.Scanner;

public class Utilitarios {

    //Uso para limpar a tela do console
    public static void limparTela() throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    public static Integer validaNumeroInteiro(Scanner scanner, String texto){

        boolean valorValido = false;
        int numero = 0;

        while (!valorValido) {
            try {
                System.out.print("\n"+texto);
                numero = scanner.nextInt();
                scanner.nextLine();
                valorValido = true;
              
            } catch (Exception e) {
                System.out.println("Valor inválido");
                scanner.nextLine();
            }
            
        }

        return numero;

    }

      public static Double validaNumeroDecimal(Scanner scanner, String texto){
        
        boolean valorValido = false;
        Double numero = 0.0;

        while (!valorValido) {
            try{
                System.out.print("\n"+texto);
                numero = scanner.nextDouble();
                scanner.nextLine();
                valorValido = true;
            
            } catch (Exception e) {
                System.out.println("Valor inválido");
                scanner.nextLine();
            }
        }
        return numero;
    } 
}

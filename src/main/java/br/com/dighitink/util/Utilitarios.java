package br.com.dighitink.util;

import java.io.IOException;

public class Utilitarios {

    //Uso para limpar a tela do console
    public static void limparTela() throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }


    
}

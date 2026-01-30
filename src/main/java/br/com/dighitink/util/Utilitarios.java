package br.com.dighitink.util;

import java.io.IOException;

public class Utilitarios {

    public static void limparTela() throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }


    
}

package com.util;

public class Formatar {
    //metodo que somente formata a string
    public static void verde(String texto) {
        System.out.println("\u001B[32m" + "\u001B[1m" + "----- " + texto + " -----" + "\u001B[0m");
    }

    /*
    metodo que formata a string e adiciona um parametro para dar enter em alguma posição do texto
    0 - enter no inicio
    1 - enter no final
    2 - enter no inicio e no final
    outro - padrao sem enter
    */
    public static void verde(String texto, int num) {
        if (num == 0) System.out.println("\u001B[32m" + "\u001B[1m" + "\n----- " + texto + " -----" + "\u001B[0m");
        else if (num == 1) System.out.println("\u001B[32m" + "\u001B[1m" + "----- " + texto + " -----\n" + "\u001B[0m");
        else if (num == 2) System.out.println("\u001B[32m" + "\u001B[1m" + "\n----- " + texto + " -----\n" + "\u001B[0m");
        else System.out.println("\u001B[32m" + "\u001B[1m" + "----- " + texto + " -----" + "\u001B[0m");
    }

    public static void timeOut(int num) {
        try {
            Thread.sleep(num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
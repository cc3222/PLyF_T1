/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package plyf_t1;

import java.util.Scanner;

/**
 *
 * @author jp
 */
public class PLyF_T1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Numero de estilo");
        int opc = new Scanner(System.in).nextInt();
        switch (opc) {
            case 1:
                Estilo4 estilo1 = new Estilo4();
                estilo1.ventana();
                break;
            case 2:
                Estilo2 estilo2 = new Estilo2();
                estilo2.ventana();
                break;
            case 3:
                Estilo1 estilo3 = new Estilo1();
                estilo3.ventana();
                break;
            case 4:
                Estilo3 estilo4 = new Estilo3();
                estilo4.ventana();
                break;
        }
    }
}

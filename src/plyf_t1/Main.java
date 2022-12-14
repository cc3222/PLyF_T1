/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package plyf_t1;

import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @Equipo 3
 *
 * @author Juan Pablo Campos Casasanero
 * @author Ana Lilia Salinas Reyes
 * @author Alexis Pineda Perez
 * @author Emanuel Arenas Garcia
 * @author Jose Guadalupe Osorio Anzures
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Numero de estilo");
        int opc = new Scanner(System.in).nextInt();
        switch (opc) {
            case 1:
                KyR estilo1 = new KyR();
                estilo1.ventana();
                break;
            case 2:
                Whitesmiths estilo2 = new Whitesmiths();
                estilo2.ventana();
                break;
            case 3:
                Allman estilo3 = new Allman();
                estilo3.ventana();
                break;
            case 4:
                Gnu estilo4 = new Gnu();
                estilo4.ventana();
                break;
        }

    }

    /**
     *
     * Metodo encargado de construir una ventana de 400x400 con posicion
     * central, cierre del programa al cerrar la ventana y activar su
     * visibilidad
     */
    public void ventana() {
        JFrame ventana = new JFrame("xd");
        ventana.setSize(400, 400);
        ventana.setLocationRelativeTo(ventana);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista(ventana);
        ventana.setVisible(true);

    }

    /**
     * Metodo encargado de construir un GridLayout Agregarlo en un contenedor y
     * asignar ese contenedor como principal
     *
     * @param ventana JFrame sobre el cual se esta trabajando
     */
    public void vista(JFrame ventana) {
        LayoutManager layout = new GridLayout(3, 1);
        JPanel vista = new JPanel(layout);
        componentes(vista);
        ventana.setContentPane(vista);
    }

    /**
     * Metodo donde se crear los componenetes y se a??aden al JPanel en una
     * posicion especificada
     *
     * @param vista JPanel sobre el cual se esta trabajando
     */
    public void componentes(JPanel vista) {
        JButton saludo = new JButton("Saludar");
        vista.add(saludo, 0);

        JButton saludo_nombre = new JButton("Saludo personal");
        vista.add(saludo_nombre, 1);

        JButton despedida = new JButton("Despedida");
        vista.add(despedida, 2);

        saludo.addActionListener(e -> evento(1));
        saludo_nombre.addActionListener(e -> evento(2));
        despedida.addActionListener(e -> evento(3));
    }

    /**
     * Metodo encargado de accionar un evento segun el numero especificado
     *
     * @param i numero que especifica que evento es accionado
     */
    public void evento(int i) {
        if (i == 1) {
            JOptionPane.showMessageDialog(null, "Hola Mundo");
        } else if (i == 2) {
            String nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
            JOptionPane.showMessageDialog(null, "Hola " + nombre);
        } else if (i > 2) {
            JOptionPane.showMessageDialog(null, "Adios");
            System.exit(0);
        }
    }

}

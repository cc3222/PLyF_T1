/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plyf_t1;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jp
 */
public class Estilo2 
    {

    public Estilo2() 
        {

        }

    public void ventana() 
        {
        JFrame ventana = new JFrame("xd");
        ventana.setSize(400, 400);
        ventana.setLocationRelativeTo(ventana);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista(ventana);
        ventana.setVisible(true);
        }

    public void vista(JFrame ventana)
        {
        JPanel vista = new JPanel(new GridLayout(3, 1));
        componentes(vista);
        ventana.setContentPane(vista);
        }

    public void componentes(JPanel vista) 
        {
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

    public void evento(int i) 
        {
        if (i == 1) 
            {
            JOptionPane.showMessageDialog(null, "Hola Mundo");
            } 
        else if (i == 2) 
            {
            String nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
            JOptionPane.showMessageDialog(null, "Hola " + nombre);
            } 
        else if (i > 2) 
            {
            JOptionPane.showMessageDialog(null, "Adios");
            System.exit(0);
            }
        }
    }

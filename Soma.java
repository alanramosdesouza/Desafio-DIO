/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.soma;

/**
 *
 * @author Alan
 */
import javax.swing.JOptionPane;
public class Soma {
    public static void main (String args[]){
        String valor1 = JOptionPane.showInputDialog("Primeiro valor: ");
        String valor2 = JOptionPane.showInputDialog("Segundo valor: ");
               double n1 = Double.parseDouble (valor1);
               double n2 = Double.parseDouble(valor2);
               double soma = n1 + n2;
               JOptionPane.showMessageDialog(null, "O resultado da soma é: " 
               +soma, "Soma de Valores", JOptionPane.PLAIN_MESSAGE);
    }
}

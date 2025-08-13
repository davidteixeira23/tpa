/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto2;
import javax.swing.JOptionPane;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class Projeto2 {

    public static void main(String[] args) {
       int a = Integer.parseInt(JOptionPane.showInputDialog("Digite A:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite B:"));
       
        //declaração da variavel string resultado
        String resultado; 

        
        
                   if (a == b) {
            resultado = "Número A (" + a + ") é igual ao número B (" + b + ").";
        } else if (a > b) {
            resultado = "Número A (" + a + ") é maior que o número B (" + b + ").";
        } else {
            resultado = "Número A (" + a + ") é menor que o número B (" + b + ").";
        }

        // Adicionando informação de !=
        if (a != b) {
            resultado += "\nE os números são diferentes (!=).";
        }

        // Mostra o resultado em uma única janela
        JOptionPane.showMessageDialog(null, resultado);
    }
}

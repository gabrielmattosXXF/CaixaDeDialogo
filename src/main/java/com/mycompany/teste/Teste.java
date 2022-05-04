/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.teste;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Mattos
 */
public class Teste {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String[] options={"Luiz", "Yuri", "Augusto"};
        
        int option = JOptionPane.showOptionDialog(null, "Quem é o tigrão?", "Pergunta do dia.", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        
        //String macho = JOptionPane.showImputDialog(null, "Quem é o tigrão?", "Pergunta do dia.", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options[]);
        //String macho = JOptionPane.showInputDialog(null, "Quem é o tigrão?", "Pergunta do dia.", JOptionPane.QUESTION_MESSAGE);
        String macho=options[option];
        JOptionPane.showConfirmDialog(null, "O tigrão é o "+macho, "Janela do ugas", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null);
        
        String x1, x2, y1, y2;
        double xx1, xx2, yy1, yy2;
        x1 = JOptionPane.showInputDialog("Digite o valor de x1");
        y1 = JOptionPane.showInputDialog("Digite o valor de y1");
        x2 = JOptionPane.showInputDialog("Digite o valor de x2");
        y2 = JOptionPane.showInputDialog("Digite o valor de y2");
        
        xx1=Double.parseDouble(x1);
        yy1=Double.parseDouble(y1);
        xx2=Double.parseDouble(x2);
        yy2=Double.parseDouble(y2);
        
        double dist = Math.sqrt(Math.pow((xx2-xx1), 2)+Math.pow((yy2-yy1), 2));
        
        //JOptionPane.showInternalInputDialog(null, "A distância entre os pontos ("+xx1+", "+yy1+") e ("+xx2+", "+yy2+") é "+dist, "Distância entre os pontos", JOptionPane.INFORMATION_MESSAGE, null);
        JOptionPane.showMessageDialog(null, "A distância entre os pontos ("+xx1+", "+yy1+") e ("+xx2+", "+yy2+") é "+dist, "Distância entre os pontos", JOptionPane.INFORMATION_MESSAGE, null);
    
        String operacao[] = {"+", "-", "x", "/"};
        
        String num1, num2;
        
        num1=JOptionPane.showInputDialog(null, "num1");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04exm01;

import javax.swing.JFrame;

/**
 *
 * @author 11944413600
 */
public class Aula04Exm01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JanelaBotoes janela = new JanelaBotoes();
        janela.setSize(200,200);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04exm01;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author 11944413600
 */
public class JanelaBotoes extends JFrame{
    
    private final JButton btnSimples = new JButton("Clique-me!");
    private final JButton btnEnfeitado = new JButton("Clique-me também!");
    
    public JanelaBotoes() throws HeadlessException{
        super("Botoes");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        
        ImageIcon icon= new ImageIcon("resources/doge.png");
        
        Image img = icon.getImage() ;  
        
        img = img.getScaledInstance( 48, 48,  java.awt.Image.SCALE_SMOOTH ) ;  
        
        ImageIcon icon2= new ImageIcon("resources/icon.png");
        
        Image img2 = icon2.getImage() ;  
        
        img2 = img2.getScaledInstance( 48, 48,  java.awt.Image.SCALE_SMOOTH ) ;  
        
        btnEnfeitado.setIcon(new ImageIcon( img2 ));
        btnEnfeitado.setRolloverIcon(new ImageIcon(img));
        btnEnfeitado.setPressedIcon(new ImageIcon(img));
        add(btnSimples);
        add(btnEnfeitado);
        BotaoClicado click = new BotaoClicado();
        btnSimples.addActionListener(click);
        btnEnfeitado.addActionListener(click);
    }
    
    private class BotaoClicado implements ActionListener {
        
        private int simples=0;
        
        private int enfeitado=0;
        
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==btnSimples){
                simples++;
                JOptionPane.showMessageDialog(null, "Botão simples clicado\nSimples: "+simples+"\nEnfeitado: "+enfeitado+"", "Click", JOptionPane.INFORMATION_MESSAGE);
                
            } else if(e.getSource()==btnEnfeitado){
                enfeitado++;
                JOptionPane.showMessageDialog(null, String.format("Botão enfeitado clicado\nSimples:%s\nEnfeitado:%s", simples,enfeitado), "Click", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    
}

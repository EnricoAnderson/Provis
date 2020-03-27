/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provis1;

import javax.swing.JFrame;

/**
 *
 * @author MY-PC
 */
public class frameUtama extends JFrame {
    public frameUtama(){
        this.setSize(300,300);
        this.setLocation(200,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void tampil(){
        this.setVisible(true);
    }
    
    //override
    public void tampil(String nama){
        this.setName(nama);
        this.setVisible(true);
    }
}

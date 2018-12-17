/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 *
 * @author j3r3miah
 */
public class Graphs {

    public static void main(String[] args) {
     JFrame s=new JFrame("GRAPH");
      s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      engine en=new engine();
      s.add(en);
      //engine w=new engine(words);
      s.setSize(700,700);
      s.setVisible(true);
    }
    
}

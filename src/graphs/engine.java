/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class engine extends JPanel {
    
     public void paintComponent(Graphics g){
          super.paintComponent(g);
          this.setBackground(Color.BLACK);
          g.setColor(Color.pink);
         g.drawRect(3,7,600,600);
 
       
         
         int x[] = {200,600,55,333};
         int y[] = {90,50,200,210};
           g.setColor(Color.YELLOW);
           g.drawPolyline(x, y, x.length);
           
           g.setColor(Color.RED);
           g.drawArc(4,5,4,3,39,60);
     
     
     }

  public class words extends JFrame{
     JPanel figs=new JPanel();
     public words(){
     JLabel  rip=new JLabel("123");
    figs.add(rip);
     add(figs);
     
    }
     }
}
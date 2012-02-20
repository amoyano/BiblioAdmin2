/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioadmin2.renderers;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import models.Libro;
/**
 *
 * @author moyanoa
 */
public class LibroRenderer extends JLabel implements ListCellRenderer {

    public Component getListCellRendererComponent(JList jlist, Object o, int i, boolean isSelected, boolean bln1) {
        Libro l = (Libro)o;
        this.setText(l.isbn + " - " + l.titulo);
        
         if (isSelected) {
             setBackground(jlist.getSelectionBackground());
	       setForeground(jlist.getSelectionForeground());
               
	   }
         else {
	       setBackground(jlist.getBackground());
	       setForeground(jlist.getForeground());
	  }
        this.setFont(jlist.getFont()); 
        this.setOpaque(true);
        this.setEnabled(jlist.isEnabled());
        return this;
    }
    
}

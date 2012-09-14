/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculo;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;
import javax.swing.JOptionPane;

/**
 * Esta clase se encargará de realizar la operación necesaria para obtener los
 * resultados de la ecuación.
 * 
 * @author Xhaman
 */
public class Calculo_Ecuacion {
    
    /**
     * Estas son las variables necesarias para poder realizar la ecuación!
     */
    private double a;
    private double b;
    private double c;
    
    
    /**
     * Unico constructor de la clase, en el se inicializar todo a cero, a traves
     * del setVariable!
     */
    public Calculo_Ecuacion() {
        
        setVariables();
    }
    
    /**
     * Modifica el valor de la variable a.
     * @param nueva_a.
     */
    public void setA(double nueva_a) {
        
        try {
            
            if(nueva_a != 0) {
                
                a = nueva_a;
                
            } else {
                JOptionPane.showMessageDialog(null, "El valor de a no puede ser 0");
                
            }
            
        }
        catch(InternalError ex) {
                    
            JOptionPane.showMessageDialog(null, "¡Se ha producido un error interno! n/" + ex);
        }
        
    }
    
    /**
     * Obtiene el valor de la varibale a.
     * @return a.
     */
    public double geta() {
        
        return a;
    }
    
    /**
     * Modifica el valor de la variable b.
     * @param nueva_b.
     */
    public void setB(double nueva_b) {
        
        try {
            
            if(nueva_b != 0) {
                
                b = nueva_b;
                
            } else {
                JOptionPane.showMessageDialog(null, "El valor no es numerico");
                
            }
            
        }
        catch(InternalError ex) {
                    
            JOptionPane.showMessageDialog(null, "¡Se ha producido un error interno! n/" + ex);
        }
        
    }
    
    /**
     * Obtiene el valor de la varibale b.
     * @return b.
     */
    public double getb() {
        
        return b;
    }
    
    
    /**
     * Modifica el valor de la variable c.
     * @param nueva_c.
     */
    public void setC(double nueva_c) {
        
        try {
            
            if(nueva_c != 0) {
                
                c = nueva_c;
                
            } else {
                JOptionPane.showMessageDialog(null, "El valor no es numerico.");
            }
            
        }
        catch(InternalError ex) {
                    
            JOptionPane.showMessageDialog(null, "¡Se ha producido un error interno! n/" + ex);
        }
        
    }
    
    /**
     * Obtiene el valor de la varibale c.
     * @return c.
     */
    public double getc() {
        
        return c;
    }
    
    /**
     * Este set es el encargado de inicializar los valores de las variables
     * y de restaurarlas en su valor predeterminador.
     */
    public void setVariables() {
        
        a = 0;
        b = 0;
        c = 0;
    }
}

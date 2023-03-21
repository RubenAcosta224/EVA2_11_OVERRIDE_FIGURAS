/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_11_override_figuras;

/**
 *
 * @author invitado
 */
public class EVA2_11_OVERRIDE_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //area, perimetro
        
        //circulo implementa su propia version de area y perimetro
        
        //triangulo
        
        
        
        Circulo circu1=new Circulo();
        circu1.setRadio(4);
        System.out.println(circu1);
        
        
        Triangulo tria1=new Triangulo();
        tria1.setBase(3);
        tria1.setAltura(4);
        System.out.println(tria1);
    }
    
}

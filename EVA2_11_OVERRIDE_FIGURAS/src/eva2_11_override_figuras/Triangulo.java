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
public class Triangulo extends Figura{
    private double altura;
    private double base;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    
    
    
    
    @Override
    public double calcularArea(){
        return (base*altura)/2;
    }
    
    @Override
    public double calcularPerimetro(){
        return base*3;
    }
    
            @Override
    public String toString(){
        //no estamos invocando al metdo sobreescrito de la clase, lo reemplazamos de la superclase
        String cade="Datos triangulo:\n"
                +"Area: "+calcularArea()+"\n"+
                "Perimetro: "+calcularPerimetro();
        
        return cade;
    }
}


//clases abstractas solo sirven para generalizar, pero no para crear objetos
//solo para heredar, como superclases

//metodos abstractos sirven con cabecera pero no implementacion
//servirian solo para cuando hereden lo tengan y este obligado a sobreescribirlo


//interfaces es un tipo de dato abstracto pero solo tiene metodos abstractos
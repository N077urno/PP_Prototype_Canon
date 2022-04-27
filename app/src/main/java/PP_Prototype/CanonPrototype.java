/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PP_Prototype;

/**
 *
 * @author IFGoiano
 */
public abstract class CanonPrototype {
    protected double valorCompra;
    
    public abstract String exibirInfo();
    
    public abstract CanonPrototype clonar();
    
    public double getValorCompra(){
        return valorCompra;
    }
    
    public void setValorCompra(double valorCompra){
        this.valorCompra = valorCompra;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PP_Prototype;

/**
 *
 * @author IFGoiano
 */
public class D5D extends CanonPrototype {
    protected D5D(D5D cameraD5D){
        this.valorCompra = cameraD5D.getValorCompra();
    }
    
    public D5D(){
        this.valorCompra = 0;
    }
    
    @Override
    public String exibirInfo(){
        return("Modelo D5D \nMontadora: Canon\n" + "Valor: R$ "+getValorCompra());
    }
    
    @Override
    public CanonPrototype clonar(){
        return(new D5D(this));
    }
}

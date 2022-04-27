/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PP_Prototype;

/**
 *
 * @author IFGoiano
 */
public class T4i extends CanonPrototype{
    
    protected T4i(T4i cameraT4i){
        this.valorCompra = cameraT4i.getValorCompra();
    }
    
    public T4i(){
        this.valorCompra = 0;
    }
    
    @Override
    public String exibirInfo(){
        return("Modelo: T4i \nMontadora: Canon \n" + "Valor: R$ "+getValorCompra());
    }
    
    @Override
    public CanonPrototype clonar(){
        return(new T4i(this));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin_8;

/**
 *
 * @author dam1
 */
public class Producto {
    private String nombre;
    private int ventasAnuales;
    
    public Producto (String nom,int va){
        nombre=nom;
        ventasAnuales=va;
    }
    
    public String tipoArticulo(){
        String tipo;
        if (ventasAnuales<=100) {tipo="bajo";}
        else if(ventasAnuales>100 && ventasAnuales<=500){
            tipo="medio";
        }else if(ventasAnuales>500 && ventasAnuales<=1000){
            tipo="alto";
        }else {tipo="primera necesidad";}
        
        return tipo;
    }
    
}

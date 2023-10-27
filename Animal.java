/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *Class Animal
 * representación abstracta de animales
 * @author Estudiantes
 */
public abstract class Animal { 
    String nombre;
    int peso;
    int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
       return "soy " + "nombre" + ", peso=" + peso + "Kilos y tengo, edad=" + edad + " meses";
    }
    
    
    
    public abstract void alimentar();
    
}


package com.mycompany.practicaoop1;

import javax.swing.JOptionPane;
public class Estudiantes {
    public String IDestudiante;
    public String IDinstitucion;
    public String nombreEstud;
    public String apellidosEstu;
    public String ubicacionEstu;
    public int edadEstu;
    public String gradoEstu;
    public String adecuacion;
    public String sexoEstu;
    public String seccionEstu;
    
    public void ingresarEstudiantes(){
        IDestudiante = JOptionPane.showInputDialog("Ingrese la cedula del estudiante: ");
        IDinstitucion = JOptionPane.showInputDialog("Ingrese el ID de la institucion del estudiante: ");
        nombreEstud = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
    }
    public void mostrarRegistroCompleto (){
        JOptionPane.showMessageDialog(null,"La cedula del estudiante es: " + IDestudiante);
        JOptionPane.showMessageDialog(null,"El ID institucional del estudiante es: " + IDinstitucion);
        JOptionPane.showMessageDialog(null,"El nombre del estudiante es: " + nombreEstud);
    }
    public void eliminarEstudiantes (){
      
    }
    public void actualizarEstudiante (){
    
    }
    public void comprobanteAdecuacion (){
    
    }
    
    public void mostrarUnRegistro (){
    
    }
    public void mostrarCantidadEst (){
    
    }
    public void mostrarCantidadEstEliminado (){
    
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolemario;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author xp
 */
public class EjercicioLemario {
     HashMap<String, Boolean> lemario = new HashMap<>();

     public void cargaFicheroLemario(){
    
        File fichero = new File("src/ejerciciolemario/lemario-20101017.txt");
        try  {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            
            while ((linea = br.readLine()) != null){
               
                lemario.put(linea, true);
            } 
            
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(EjercicioLemario.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (IOException ex) {
            Logger.getLogger(EjercicioLemario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      public boolean buscar(String palabra){
    
        if(lemario.containsKey(palabra)){
            return true;
        }
        return false;
    }
      public boolean escaleraDePalabras(ArrayList<String> escalera){
        
	boolean palabra = true;
        int contador;
	for (int i = 0; i < escalera.size() - 1; i++) {	
            palabra = buscar(escalera.get(i));
            if(!palabra){
                return false;
            }
            
            contador = 0;
	    if (escalera.get(i + 1).length() == escalera.get(i).length())  {		
		for (int j = 0; j < escalera.get(i).length(); j++) {
                    if(escalera.get(i).charAt(j) != escalera.get(i + 1).charAt(j)){
                        contador++;
                    }
                    if(contador > 1){ //si tiene ya dos palabras distintas devuelve false
                    
                        palabra = false;
                    }
                    if(contador == 1){
                        palabra =  true;
                    }
                    
                    
                        
                    
		}
	    } 
	}
	return palabra;
    }
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          ArrayList<String> listaPalabras = new ArrayList();
        EjercicioLemario ejercicio = new EjercicioLemario();
        ejercicio.cargaFicheroLemario();
        listaPalabras.add("pato");
        listaPalabras.add("pata");
        System.out.println(ejercicio.escaleraDePalabras(listaPalabras));
    }
    
}

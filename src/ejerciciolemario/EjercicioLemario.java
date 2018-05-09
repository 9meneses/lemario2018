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
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author xp
 */
public class EjercicioLemario {

    public void cargaFicheroLemario(){
        File fichero = new File("src/ejerciciolemario/lemario-20101017.txt");
        HashMap<String, Boolean> lemario = new HashMap();
        try {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);
            String linea ; 
            int cont = 0; 
            String palabra = "hola";
            
            
            while ( (linea = br.readLine()) != null){
                lemario.put(linea, Boolean.TRUE);
                if(lemario.get("h") != null){
                for(int i = 0; i < lemario.size(); i++){
                    if(lemario.containsKey(linea.charAt(i)));
                
                }
                System.out.println(linea);
            }
                else{
                    System.out.println("Error");
                }
                
                
                
                cont++;
                
                
               
            }
            /*
            	for ( int i = 0; i < cadena.length(); i++ ) {
			if ( h.containsKey ( cadena.charAt ( i ) ) ) {
				h.put ( cadena.charAt ( i ), (int)h.get ( cadena.charAt ( i ) ) + 1 );
			} else {
				h.put ( cadena.charAt ( i ), 1 );
			}
		}
            */
            
            //System.out.println(cont);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EjercicioLemario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EjercicioLemario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new EjercicioLemario().cargaFicheroLemario();
    }
    
}

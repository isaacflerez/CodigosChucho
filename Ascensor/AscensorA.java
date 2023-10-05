
package testcalculadora.testascensor;

import java.util.Random;
 
public class AscensorA {
 
    public void PisoAscensor(){
        private int totalDePisos = 7;
        private Random random = new Random();
    
        
        public int piso() {
            return random.nextInt(totalDePisos) + 1; 
           
        }

        Usuario usuariobj = new Usuario();
        
        //System.out.println("aca esta el ascensor piso " + piso());
         
        if(usuariobj.num()== piso()){
            System.out.println("El ascensor ya llegó");
        }
        else if(usuariobj.num()> piso()){
            System.out.println("El ascensor va subiendo se encuentra en el piso" + " "+piso());        
        }
        else if(usuariobj.num()< piso()){
            System.out.println("El ascensor va bajando se encuentra en el piso" + " " + piso());
        }
     
    }
  
}   


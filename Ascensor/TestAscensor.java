

package testcalculadora.testascensor;


import java.util.Scanner;


public class TestAscensor {

    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Si desea seguir pero con el ascensor en otro piso digite 0");
            System.out.println("Si desea seguir pero con el ascensor en el mismo piso digite 1");
            int s = 0; 
            int y =1;
            int p = scanner.nextInt();
                if(p == s){
                    AscensorC uno=new AscensorC();
                    uno.PisoAscensor();
                }
                else if(p == y){
                    AscensorA dos=new AscensorC();
                    dos.PisoAscensor();
                }
                else{
                    break;
                }
        }
    
    }
    
}


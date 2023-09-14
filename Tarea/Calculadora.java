



    
    public class Calculadora {
    private Suma objSuma=new Suma();
    private Usuario objUsuario = new Usuario();
    private Resta objResta=new Resta();
    private Multiplicacion objMultiplicacion=new Multiplicacion();
    
    public void operaciones(){
        System.out.println("Para escoger una operacion digite los siguientes números: \n1. Suma\n2. Resta\n3. Multiplicacion\nCualquier otro numero para salir.");
        System.out.println("Digite su opción ");
        int opcion = objUsuario.pedirNumero();
        if(opcion == 1){
            objSuma.mostrar(objSuma.sumar());
        }
        if(opcion == 2){
            objResta.mostrar(objResta.restar());
        }
        if(opcion == 3){
            objMultiplicacion.mostrar(objMultiplicacion.multiplicar());
        }
        else{
            System.out.println("Gracias por vivir");
        }
    
       
    }
}
       






public class Calculadora {
    private Suma objSuma=new Suma();
    private Resta objResta=new Resta();
    private Multiplicacion objMultiplicacion=new Multiplicacion();
    private Usuario objUsuario =new Usuario();
    
    public void operaciones(){
        System.out.println("Digite su opcion");
        System.out.println("1. suma\n2. resta\n3. multiplicacion\n Cualquier otro numero para salir.");
        int opcion = objUsuario.pedirNumero();
        if(opcion == 1){
            ObjSuma.mostrar(objSuma.sumar());
        }
        if(opcion == 2){
            ObjResta.mostrar(objResta.restar());
        }
        if(opcion == 3){
            ObjMultiplicacion.mostrar(objMultiplicacion.multiplicar());
        }
        else(){
            System.out.println("Gracias por vivir");
        }
        
        
    }
}

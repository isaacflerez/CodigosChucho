public class Multiplicacion{
    Usuario objUsuario=new Usuario();
    
    public int multiplicar(){
        return objUsuario.pedirNumero()*objUsuario.pedirNumero();
    }
    public void mostrar(int y){
        System.out.println("la multiplicaion es "+ y);
    }
    
}

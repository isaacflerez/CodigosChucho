

public class Suma {
    Usuario objUsuario=new Usuario();
    
    public int sumar(){
        return objUsuario.pedirNumero()+objUsuario.pedirNumero();
    }
    public void mostrar(int x){
        System.out.println("La suma es "+ x);
    }
    
}

public class Resta {
    Usuario objUsuario=new Usuario();
    
    public int restar(){
        return objUsuario.pedirNumero()-objUsuario.pedirNumero();
    }
    public void mostrar(int z){
        System.out.println("la resta es "+ z);
    }
    
}

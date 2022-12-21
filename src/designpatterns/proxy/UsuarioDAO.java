package designpatterns.proxy;

public class UsuarioDAO {
    public static Usuario getPessoaByID(String id) throws InterruptedException {
        System.out.println("Simulando busca no banco de dados com id= "+id);
        Thread.sleep(1000);
        return new UsuarioImpl(id,"Usuario " + id);
    }
}

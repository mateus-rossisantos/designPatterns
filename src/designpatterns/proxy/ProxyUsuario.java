package designpatterns.proxy;

public class ProxyUsuario implements Usuario {
    private final String id;

    private Usuario usuario;

    public ProxyUsuario(String nome) {
        this.id = nome;
    }

    public String getNome() throws InterruptedException {
        if (usuario == null) {
            usuario = UsuarioDAO.getPessoaByID(id);
        }
        return usuario.getNome();
    }

    public String getId() {
        return this.id;
    }
}
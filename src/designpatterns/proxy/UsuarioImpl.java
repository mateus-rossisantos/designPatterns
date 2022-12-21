package designpatterns.proxy;

public class UsuarioImpl implements Usuario {
    private final String nome;
    private final String id;

    public UsuarioImpl(String id, String nome) {
        this.id = id;
        this.nome = nome;
        System.out.println("Retornou a pessoa do banco de dados ->  " + nome);
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return this.id;
    }
}
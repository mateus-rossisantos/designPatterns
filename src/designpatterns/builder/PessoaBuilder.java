package designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

public class PessoaBuilder {

    private Pessoa pessoa;
    private Endereco endereco;
    private List<Telefone> telefones = new ArrayList<>();

    public PessoaBuilder() {
        this.pessoa = new Pessoa();
        this.endereco = new Endereco();
    }

    public static PessoaBuilder builder() {
        return new PessoaBuilder();
    }

    public PessoaBuilder nome(String nome, String sobrenome) {
        this.pessoa.setNome(nome);
        this.pessoa.setSobrenome(sobrenome);
        return this;
    }

    public PessoaBuilder dtNascimento(int dia, int mes, int ano) {
        this.pessoa.setDia(dia);
        this.pessoa.setMes(mes);
        this.pessoa.setAno(ano);
        return this;
    }

    public PessoaBuilder logradouro(String logradouro) {
        this.endereco.setLogradouro(logradouro);
        return this;
    }

    public PessoaBuilder numero(String numero) {
        this.endereco.setNumero(numero);
        return this;
    }

    public PessoaBuilder complemento(String complemento) {
        this.endereco.setComplemento(complemento);
        return this;
    }

    public PessoaBuilder bairro(String bairro) {
        this.endereco.setBairro(bairro);
        return this;
    }

    public PessoaBuilder cidade(String cidade) {
        this.endereco.setCidade(cidade);
        return this;
    }

    public PessoaBuilder pais(String pais) {
        this.endereco.setPais(pais);
        return this;
    }

    public PessoaBuilder fone(int ddd, int numero) {
        this.telefones.add(new Telefone(ddd, numero));
        return this;
    }

    public Pessoa build() {
        this.pessoa.setEndereco(this.endereco);
        this.pessoa.setTelefones(this.telefones);
        return this.pessoa;
    }
}

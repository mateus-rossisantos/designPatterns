import designpatterns.abstractFactory.AndroidFactory;
import designpatterns.abstractFactory.App;
import designpatterns.abstractFactory.IosFactory;
import designpatterns.abstractFactory.TelaFactory;
import designpatterns.adapter.adapter.MongoAdapter;
import designpatterns.adapter.repository.impl.OracleDBImpl;
import designpatterns.adapter.repository.interfaces.DBInterface;
import designpatterns.bridge.ControleRemotoImpl;
import designpatterns.bridge.Dispositivo;
import designpatterns.bridge.Radio;
import designpatterns.bridge.TV;
import designpatterns.builder.Pessoa;
import designpatterns.builder.PessoaBuilder;
import designpatterns.chainofresponsibility.*;
import designpatterns.composite.CPU;
import designpatterns.composite.Cache;
import designpatterns.interpreter.*;
import designpatterns.prototype.*;
import designpatterns.state.MaquinaDeRefri;

import java.math.BigDecimal;
import java.util.List;

public class DesignPatterns {

    public void composite() {
        System.out.println("O padrão composite é um padrão de projeto de software que permite que você trate objetos individuais e coleções de objetos de maneira uniforme. Isso é útil quando você quer construir uma estrutura de objetos em árvore e precisa tratar cada nó da árvore de maneira uniforme, independentemente de ser um nó folha ou um nó interno.");
        Cache cacheL1 = new Cache(4);
        Cache cacheL2 = new Cache(2);
        CPU processador = new CPU(12);

        processador.adiciona(cacheL1);
        processador.adiciona(cacheL2);

        processador.executa();
    }

    public void prototype() {
        System.out.println("O padrão prototype é um padrão de projeto de software que permite que você crie novas instâncias de objetos a partir de modelos pré-existentes, evitando o custo de criar novas instâncias a partir do zero. Ele é especialmente útil quando a criação de novas instâncias é cara ou demorada, por exemplo, porque envolve a alocação de recursos externos ou a execução de operações complexas.");
        Gol GolPrototype = new Gol();
        VolksPrototype gol =  GolPrototype.clonar();
        gol.setValorVenda(88000);
        gol.infoCar();

        Onix OnixPrototype = new Onix();
        GMPrototype onix =  OnixPrototype.clonar();
        onix.setValorVenda(75000);
        onix.infoCar();

        Cruze CruzePrototype = new Cruze();
        GMPrototype cruze =  CruzePrototype.clonar();
        cruze.setValorVenda(120000);
        cruze.infoCar();

        Polo PoloPrototype = new Polo();
        VolksPrototype polo =  PoloPrototype.clonar();
        polo.setValorVenda(98000);
        polo.infoCar();
    }

    public void chainOfResponsibility() {
        System.out.println("O padrão de projeto Chain of Responsibility é um padrão de design de software que permite que um objeto envie uma solicitação para uma cadeia de objetos sem especificar explicitamente o destinatário da solicitação. Em vez disso, cada objeto na cadeia tem a oportunidade de processar a solicitação. Se um objeto não puder processar a solicitação, ele pode encaminhá-la para o próximo objeto na cadeia.");
        Pedido pedido = new Pedido(BigDecimal.valueOf(1550), List.of(new Item()));
        final Desconto descontoPorItem = new DescontoPorItens();
        final Desconto descontoPorValor = new DescontoPorValor();
        final Desconto semDesconto = new SemDesconto();

        descontoPorItem.setProximo(descontoPorValor);
        descontoPorValor.setProximo(semDesconto);

        System.out.println("Valor do desconto: R$ " + descontoPorValor.calcular(pedido));
    }

    public void builder() {
        System.out.println("O padrão builder é um padrão de projeto de software que permite que você crie objetos complexos passo a passo, de maneira mais clara e flexível do que chamar vários construtores. Ele é especialmente útil quando você tem um objeto com muitos parâmetros opcionais ou quando os parâmetros podem ser fornecidos em várias combinações válidas.");
        Pessoa pessoa = PessoaBuilder.builder().nome("Mateus", "Rossi dos Santos")
                .dtNascimento(22, 5, 1980)
                .logradouro("Rua 3")
                .numero("163")
                .complemento("Casa 25")
                .bairro("Desvio Rizzo")
                .cidade("Caxias do Sul")
                .pais("Brasil")
                .fone(54, 32271962)
                .fone(54, 991438897)
                .build();

        System.out.println("Pessoa construida com builder: ");
        System.out.println(pessoa.toString());
    }

    public void bridge() {
        System.out.println("O padrão de projeto Bridge é um padrão de projeto estrutural que visa desacoplar uma abstração de sua implementação, de forma que ambas possam ser alteradas independentemente. Isso é conseguido criando uma interface comum para a abstração e uma classe de implementação para cada implementação possível. A abstração então possui uma referência para a classe de implementação e delega a ela as chamadas de método.");
        testarDispositivo(new TV());
        testarDispositivo(new Radio());
    }

    public void adapter() throws InterruptedException {
        System.out.println("O padrão de projeto Adapter é um padrão de projeto estrutural que visa adaptar uma interface de uma classe para outra interface esperada pelos clientes. Isso é útil quando temos uma classe existente que precisa ser usada, mas sua interface não é compatível com o que o cliente espera. O Adapter permite que a classe existente seja usada sem alterá-la.");
        DBInterface bancoDeDados = new OracleDBImpl();

        String usuario = "Usuário";

        System.out.println("EXEMPLO ADAPTER");
        System.out.println("----------------");

        bancoDeDados.insert(usuario);
        bancoDeDados.select(usuario);
        bancoDeDados.update(usuario);
        bancoDeDados.delete(usuario);

        bancoDeDados = new MongoAdapter();

        bancoDeDados.insert(usuario);
        bancoDeDados.select(usuario);
        bancoDeDados.update(usuario);
        bancoDeDados.delete(usuario);
    }

    public void interpreter() {
        System.out.println("O padrão de projeto Interpreter é um padrão de projeto comportamental que permite definir uma gramática para uma linguagem e interpretar sentenças nessa linguagem. Ele é útil quando precisamos interpretar uma linguagem específica, como uma linguagem de script ou uma linguagem de consulta.");

        Operador somar = new Somar(new Numero(1), new Numero(4));

        System.out.println(somar.interpretar());

        Operador subtrair = new Subtrair(somar, new Numero(2));

        System.out.println(subtrair.interpretar());

        Operador multiplicar = new Multiplicar(subtrair, somar);

        System.out.println(multiplicar.interpretar());

        Operador dividir = new Dividir(new Numero(30), multiplicar);

        System.out.println(dividir.interpretar());
    }

    public void abstractFactory() {
        System.out.println("O padrão Abstract Factory é um padrão de projeto de software que permite a criação de famílias de objetos relacionados ou dependentes sem especificar suas classes concretas. Em outras palavras, o padrão Abstract Factory fornece uma interface para criar conjuntos de objetos relacionados ou dependentes sem especificar suas classes concretas.");
        App app;
        TelaFactory telaFactory;
        String sistema = "Android";

        if (sistema.equals("Android")){  //você pode fazer este teste dar false para testar o IosFactory
            telaFactory = new AndroidFactory();
        } else {
            telaFactory = new IosFactory();
        }
        app = new App(telaFactory);
        app.clicar();
    }

    public void state() {
        System.out.println("O padrão de projeto State é um padrão de projeto de software que permite que um objeto altere seu comportamento quando o seu estado interno muda. Ele é útil quando um objeto precisa alterar sua lógica de execução de acordo com o seu estado atual.");
        //state começa como sem refri
        MaquinaDeRefri maquinaDeRefri = new MaquinaDeRefri(2);
        //como foi passado 2 refris o state passa para semMoeda

        System.out.println(maquinaDeRefri);

        //quando insere a moeda ele muda o state para com Moeda
        maquinaDeRefri.inserirMoeda();
        //quando escolhe ele muda para o estado de venda
        //entrega usando o estado de venda e diminui o estoque,
        //se o estoque fica vazio ele muda para o estado sem refri se não vai para sem moeda
        maquinaDeRefri.escolherRefri();


        System.out.println(maquinaDeRefri);

        maquinaDeRefri.inserirMoeda();
        maquinaDeRefri.escolherRefri();

        System.out.println(maquinaDeRefri);

        maquinaDeRefri.inserirMoeda();
        maquinaDeRefri.escolherRefri();

        System.out.println(maquinaDeRefri);
    }

    public void visitor() {
        System.out.println("O padrão de projeto Visitor é um padrão de projeto de software que permite adicionar uma operação a um conjunto de objetos de uma estrutura de dados, sem alterar as classes dos objetos em si. Ele é útil quando você precisa executar uma operação em todos os elementos de uma estrutura de dados, mas não quer adicionar essa operação às classes dos elementos.");
    }

    public void proxy() {
        System.out.println("O padrão de projeto Proxy é um padrão de projeto de software que permite fornecer uma interface de acesso a um objeto, chamado \"subject\", de maneira a controlar o acesso a esse objeto. Ele é útil quando você quer adicionar algum tipo de lógica de controle de acesso a um objeto ou quando você quer adicionar funcionalidades adicionais ao objeto sem alterar sua classe.");
    }

    private void testarDispositivo(Dispositivo dispositivo) {
        System.out.println("Teste controle remoto");
        ControleRemotoImpl controleRemoto = new ControleRemotoImpl(dispositivo);
        controleRemoto.power();
        controleRemoto.channelUp();
        controleRemoto.volumeDown();
        dispositivo.printStatus();
    }
}

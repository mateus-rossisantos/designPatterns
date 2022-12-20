import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("DEMONSTRAÇÃO DESIGN PATTERNS");

        menu();
    }

    private static void menu() {
        DesignPatterns designPatterns = new DesignPatterns();
        Scanner scan = new Scanner(System.in);
        boolean off = false;

        while (!off){
            System.out.println("Escolha o padrão de projeto que desejar.");
            opcoes();
            String opcao = scan.nextLine();

            switch (opcao){
                case "1":
                    designPatterns.composite();
                    break;
                case "2":
                    designPatterns.prototype();
                    break;
                case "3":
                    designPatterns.chainOfResponsibility();
                    break;
                case "4":
                    designPatterns.builder();
                    break;
                case "5":
                    designPatterns.bridge();
                    break;
                case "6":
                    designPatterns.adapter();
                    break;
                case "7":
                    designPatterns.interpreter();
                    break;
                case "8":
                    designPatterns.abstractFactory();
                    break;
                case "9":
                    designPatterns.state();
                    break;
                case "10":
                    designPatterns.visitor();
                    break;
                case "11":
                    designPatterns.proxy();
                    break;
                case "0":
                    off = true;
                    break;
                default:
                    off = true;
            }
        }

    }

    private static void opcoes() {
        System.out.println("1 - Composite");
        System.out.println("2 - Prototype");
        System.out.println("3 - Chain of Responsibility");
        System.out.println("4 - Builder");
        System.out.println("5 - Bridge");
        System.out.println("6 - Adapter");
        System.out.println("7 - Interpreter");
        System.out.println("8 - Abstract Factory");
        System.out.println("9 - State");
        System.out.println("10 - Visitor");
        System.out.println("11 - Proxy");
        System.out.println("0 - sair");
    }
}
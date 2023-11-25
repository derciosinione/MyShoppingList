import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    int tamMax=100;
    String [] nome = new String[tamMax];
    double [] quanto = new double[tamMax];
    double [] preco = new double[tamMax];
    boolean [] feito = new boolean[tamMax];
    int nItens=0;
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        boolean continuiar=true;
        String escolha;

        do {

            System.out.println(
                    "(E)ditar lista.\n" +
                    "(F)azer compras.\n" +
                    "Fazer (c)ontas.\n" +
                    "(S)air");

            System.out.printf("Informe a opção desejada: ");
            escolha = scanner.next().toUpperCase();

            if (escolha.equals("S"))
                continuiar = false;

        } while (continuiar);
    }

}
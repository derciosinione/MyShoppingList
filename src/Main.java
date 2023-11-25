import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static int tamMax=100;
    static String [] nome = new String[tamMax];
    static double [] quanto = new double[tamMax];
    static double [] preco = new double[tamMax];
    static boolean [] feito = new boolean[tamMax];
    static int nItens=0;
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
            escolha = scanner.next();

            switch (escolha.toUpperCase()){
                case "E":
                    menuEditarLista();
                    break;
                case "F":

                    System.out.println("\nVc escolheu fazer compras\n");
                    break;
                case "C":
                    System.out.println("\nVc escolheu fazer contas\n");
                    break;
                case "S":
                    System.out.println("\nVc escolheu sair do programa\n");
                    continuiar = false;
                    break;
                default:
                    System.out.println("\nOpção indisponivel!!! Escolhe uma outra opção dentro do menu\n");
            }


        } while (continuiar);
    }

    public static void menuEditarLista(){
        System.out.println("\n Vc escolheu editar a lista \n");

        boolean continuar = true;

        while (continuar){
            String escolha;
            System.out.println("(I)nserir item no fim da lista.\n" +
                    "Inserir item na (p)osição n da lista.\n" +
                    "(A)pagar último item inserido na lista.\n" +
                    "Apagar item na posição (n) da lista.\n" +
                    "(A)pagar itens da posição m à n da lista.\n" +
                    "(L)istar todos os itens.\n" +
                    "(V)oltar");

            System.out.printf("Informe a opção desejada: ");
            escolha = scanner.next();

            switch (escolha.toUpperCase()){
                case "I":
                    inserirItem(nItens);
                    break;
                case "P":
                    System.out.printf("Informe a posição que pretende colocar o item: ");
                    int posicao = scanner.nextInt();
                    inserirItem(posicao);
                    System.out.println("Vc escolheu P");
                    break;
                case "A":
                    // TODO Implementar o codigo para essa escolha
                    System.out.println("Vc escolheu A");
                    break;
                case "L":
                    if(nItens==0){
                        System.out.println("\n Você não tem nenhum item na lista \n");
                        break;
                    }
                    listarItens();
                    break;
                case "V":
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção não implementada!!! Tente novamente");
            }
        }
    }

    public static void inserirItem(int posicao){

        if (posicao<0 || posicao>=tamMax){
            System.out.println("A posicao escolhida não é valida, escolhe um intervalo de 0 a 99");
            return;
        }

        var valor = nome[posicao];

        if (valor==null){
            nItens++;
        }

        String comprado;

        System.out.printf("Informe o nome do produto: ");
        nome[posicao] = scanner.next();

        System.out.printf("Informe a quantidade do produto (%s): ", nome[posicao]);
        quanto[posicao] = scanner.nextDouble();

        System.out.printf("Informe o preço do produto (%s): ", nome[posicao]);
        preco[posicao] = scanner.nextDouble();

        System.out.printf("O Produto (%s) já foi comprado (sim/nao)?: ", nome[posicao]);
        comprado = scanner.next();

        feito[posicao] = comprado.toLowerCase().equals("sim") ? true : false;

        System.out.println("\n Você adicionou um novo item na lista \n");

    }
    public static void listarItens(){
        System.out.println("\n\t\t Item \t\t Quantidade \t\t Preço \t\t Comprado");

        for (int i = 0; i < tamMax; i++) {

            if (nome[i] == null){
                continue;
            }

            var estacomprado = feito[i] ? "Sim" : "Não";

            System.out.printf("%d: \t\t %s \t\t %f \t\t %f \t\t %s \n",
                    i, nome[i],
                    quanto[i],
                    preco[i],
                    estacomprado);
        }

        System.out.println("\n");
    }
}
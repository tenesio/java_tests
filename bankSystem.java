import java.util.ArrayList;
import java.util.Scanner;

public class bankSystem {
    ArrayList<Account> contas = new ArrayList<Account>();

    public static void main(String[] args) {
        int op = 0;
        Scanner scan = new Scanner(System.in);
        while (op != 4) {
            Menu();
            op = scan.nextInt();
            opMenu(op);
        }
        scan.close();
    }

    public static void Menu() {
        System.out.println("1 - criar conta");
        System.out.println("2 - alterar conta");
        System.out.println("3 - listar todas as contas");
        System.out.println("4 - sacar dinheiro");
        System.out.println("5 - depositar dinheiro");
        System.out.println("6 - transferir dinheiro");
        System.out.println("7 - verificar saldo");
        System.out.println("8 - verificar modificações");
        System.out.println("9 - ");
    }

    public static void opMenu(int op) {
        switch (op) {
            case 1:
                System.out.println("Criar Conta");
                criar_conta();
                break;
            case 2:
                System.out.println("Alterar Conta");
                // Altera_conta();
                break;
            case 3:
                System.out.println("Lista de Contas");
                // listar_contas();
                break;
            case 4:
                System.out.println("");
            default:
                break;
        }
    }

    public static Account criar_conta() {
        Account account = new Account(" ", "", "", 0, "", "", "");

        return account;
    }
}
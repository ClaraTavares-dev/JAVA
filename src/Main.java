//Nome:Maria Clara Tavares
//Data:18/06/2025

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome;
        int escolha;
        int descricaoDoPedido;

        System.out.println("==== Seja bem-vindo à lanchonete BOM JESUS!!! ====");
        System.out.println("Confira o nosso cardápio!!");

        System.out.print("Digite seu nome para realizarmos o pedido: ");
        nome = sc.nextLine();

        System.out.println("Ótimo, " + nome + "! Vamos fazer seu pedido.\n");

        System.out.println("Escolha uma dessas opções:");
        System.out.println("==== Bebidas [1] ====");
        System.out.println("==== Salgados [2] ====");
        System.out.println("==== Doces [3] ====");
        escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("======== Bebidas ========");
                System.out.println("[1] Coca-cola de 500ML [6.50 REAIS]");
                System.out.println("[2] Fanta laranja 1L [7.50 REAIS]");
                System.out.println("[3] Guaraná Antártica 2L [12 REAIS]");
                System.out.println("[4] Coca-cola 2L [15 REAIS]");
                System.out.print("Informe a sua escolha: ");
                descricaoDoPedido = sc.nextInt();

                switch (descricaoDoPedido) {
                    case 1:
                        System.out.println("Você escolheu: Coca-cola de 500ML");
                        break;
                    case 2:
                        System.out.println("Você escolheu: Fanta laranja 1L");
                        break;
                    case 3:
                        System.out.println("Você escolheu: Guaraná Antártica 2L");
                        break;
                    case 4:
                        System.out.println("Você escolheu: Coca-cola 2L");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                       
                }
                break;

            case 2:
                System.out.println("\n======== Salgados ========");
                System.out.println("[1] Coxinha de frango [5.50 REAIS]");
                System.out.println("[2] Coxinha de charque [6.50 REAIS]");
                System.out.println("[3] Coxinha de frango c/ catupiry [7 REAIS]");
                System.out.println("[4] Pastel de frango c/ catupiry (forno) [7 REAIS]");
                System.out.println("[5] Empada de frango 1KG [25 REAIS]");
                System.out.print("Informe a sua escolha: ");
                descricaoDoPedido = sc.nextInt();

                switch (descricaoDoPedido) {
                    case 1:
                        System.out.println("Você escolheu: Coxinha de frango");
                        break;
                    case 2:
                        System.out.println("Você escolheu: Coxinha de charque");
                        break;
                    case 3:
                        System.out.println("Você escolheu: Coxinha de frango c/ catupiry");
                        break;
                    case 4:
                        System.out.println("Você escolheu: Pastel de frango c/ catupiry (forno)");
                        break;
                    case 5:
                        System.out.println("Você escolheu: Empada de frango 1KG");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        
                }
                break;

            case 3:
                System.out.println("\n======== Doces ========");
                System.out.println("[1] Bolo de chocolate (fatia) [5 REAIS]");
                System.out.println("[2] Bolo de cenoura com chocolate (fatia) [6 REAIS]");
                System.out.print("Informe a sua escolha: ");
                descricaoDoPedido = sc.nextInt();

                switch (descricaoDoPedido) {
                    case 1:
                        System.out.println("Você escolheu: Bolo de chocolate (fatia)");
                        break;
                    case 2:
                        System.out.println("Você escolheu: Bolo de cenoura com chocolate (fatia)");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                      
                }
                break;

            default:
                System.out.println("Infelizmente só temos as opções acima no cardápio.");
               
        }

        System.out.println("\nSe direcione até o caixa para efetuar o pagamento!!");
        System.out.println("OBRIGADO POR COMPRAR COM A LANCHONETE BOM JESUS!!");
        sc.close();
    }
}
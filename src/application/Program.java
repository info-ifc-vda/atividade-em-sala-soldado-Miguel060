package application;

import entities.Soldado;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int continuar = 0;
        do {
            ArrayList<Soldado> soldados = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                System.out.println("Insira o nome do soldado: ");
                String nome = sc.nextLine();
                soldados.add(new Soldado(nome));

                int soldadoOption2;
                do {
                    System.out.println("Escolha uma ação: 1-(Movimentar)/ 2-(Atacar)/ 3-(Sair)");
                    soldadoOption2 = sc.nextInt();
                    sc.nextLine();

                    if (soldadoOption2 == 1) {
                        int opPosicao;
                        System.out.println("Definir posição?(1-SIM/2-NAO)");
                        opPosicao = sc.nextInt();
                        sc.nextLine();
                        if (opPosicao == 1) {
                            System.out.println("Insira a posição: ");
                            int posicao = sc.nextInt();
                            sc.nextLine();
                            soldados.get(i).movimentar(posicao);
                        } else {
                            soldados.get(i).movimentar();
                        }
                    } else if (soldadoOption2 == 2) {
                        System.out.println("Escolher arma?(1-SIM/2-NAO)");
                        int opArma = sc.nextInt();
                        sc.nextLine();
                        if (opArma == 1) {
                            System.out.println("Insira a arma: ");
                            String arma = sc.nextLine();
                            soldados.get(i).atacar(arma);
                        } else {
                            soldados.get(i).atacar();
                        }
                    }
                } while (soldadoOption2 != 3);
                System.out.println("Deseja sair? (1-Não / 2-Sim)");
                int sair = sc.nextInt();
                sc.nextLine();
                if (sair == 2) {
                    continuar = 2;
                    break;
                }
            }
            if (continuar != 2) {
                System.out.println("Continuar? (1-SIM/2-NAO)");
                continuar = sc.nextInt();
                sc.nextLine();
            }

        } while (continuar != 2);
        sc.close();
    }
}
